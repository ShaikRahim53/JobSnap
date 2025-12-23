const express = require("express");
const router = express.Router();

router.get("/", (req, res) => {
  res.send("Api is working...");
});

router.get("/jobs", (req, res) => {
  res.send("Jobs api is called...");
});

module.exports = router;
