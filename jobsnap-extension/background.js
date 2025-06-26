// background.js

chrome.runtime.onInstalled.addListener(() => {
  console.log("🧠 JobSnap background ready");
});

chrome.runtime.onMessage.addListener((message, sender, sendResponse) => {
  if (message.type === "JOB_DETAILS") {
    const job = message.payload;
    console.log("📥 Job received:", job);

    // Store to chrome local storage
    chrome.storage.local.get({ jobs: [] }, (data) => {
      const updatedJobs = [...data.jobs, job];
      chrome.storage.local.set({ jobs: updatedJobs }, () => {
        console.log("📦 Stored job in local storage:", job);
        sendResponse({ status: "stored" });
      });
    });

    return true; // Required when using async sendResponse
  }
});
