const express = require("express");
const jobsRoute = require("./routes/jobsRoute");
const port = 5000;
const app = express();
const cors = require("cors");
app.use(cors());

app.use("/api", jobsRoute);

/*app.get("/", (req, res) => {
  res.send("Api is working...");
});*/

app.listen(port, () => console.log(`Server is running on ${port}...`));
