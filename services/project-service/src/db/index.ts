import mongoose from "mongoose";
import { DB_NAME } from "../constants";

const connectDB = async () => {
    const uri = process.env.MONGODB_URI || `mongodb://root:password@127.0.0.1:27017/${DB_NAME}?authSource=admin`;
    try {
        await mongoose.connect(uri);
        console.log('Connected to MongoDB');
    } catch (error) {
        console.log(`Error connecting to MongoDB at ${uri}: ${error}`);
        process.exit(1);
    }
}

export default connectDB