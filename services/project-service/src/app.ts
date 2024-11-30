import express from 'express';

const app = express();

app.use(express.static("public"));
app.use(express.json({
    limit:"20kb"
}));



export default app;