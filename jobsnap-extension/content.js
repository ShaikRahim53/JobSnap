// content.js

// 1. Helper to extract job info from the page
function extractJobInfo() {
  const title = document.title;

  // Try to infer company and platform
  const hostname = window.location.hostname;
  let platform = "Unknown";
  let company = "Unknown";

  if (hostname.includes("google")) {
    platform = "Google Careers";
    company = "Google";
  } else if (hostname.includes("linkedin")) {
    platform = "LinkedIn";
    // Company might be in page title like: "Software Engineer at XYZ - LinkedIn"
    const match = title.match(/at (.*?) - LinkedIn/);
    if (match) company = match[1];
  } else if (hostname.includes("naukri")) {
    platform = "Naukri";
    // Try regex to extract company
    const match = title.match(/at (.*?) \| Naukri/);
    if (match) company = match[1];
  } else {
    platform = hostname;
  }

  return {
    title,
    company,
    platform,
    url: window.location.href,
    timestamp: new Date().toISOString(),
  };
}

// 2. Send job info to background
const jobData = extractJobInfo();

chrome.runtime.sendMessage(
  {
    type: "JOB_DETAILS",
    payload: jobData,
  },
  (response) => {
    console.log("✅ DropResume: Job data sent", response);
  }
);
