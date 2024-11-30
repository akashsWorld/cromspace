import app from "./app";
import dotenv from "dotenv";
import connectDB from "./db";

dotenv.config({
    path: "./env"
});

const port = process.env.PORT || 8502;
connectDB().then(
    () => {
    app.listen(port, () => {
        console.log(`Server running on port ${port}`);  
    });
}, (err) => {
    console.log("MongoDB Connection Failed !!!", err);
});
