document.addEventListener("DOMContentLoaded", () => {
  const dashboardBtn = document.getElementById("dashboardBtn");

  dashboardBtn.addEventListener("click", () => {
    chrome.tabs.create({
      url: "https://your-jobsnap-frontend.com/dashboard", // <-- change to your actual deployed URL
    });
  });
});
