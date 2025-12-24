import { MongoClient } from "mongodb";
const MONGODB_CONNECTION_URI = "mongodb://localhost:27017";

const client = new MongoClient(MONGODB_CONNECTION_URI);

async function run() {
  try {
    await client.connect();
    console.log("Successfully Connected to MongoDB database....");

    const result = await client
      .db("jobsnap")
      .collection("jobs")
      .find()
      .toArray();
    console.log(result);
  } catch (err) {
    console.log("Failed to connect:", err);
  } finally {
    await client.close();
  }
}
run();
