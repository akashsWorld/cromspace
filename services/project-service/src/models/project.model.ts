import mongoose from "mongoose";

const projectSchema = new mongoose.Schema({
    projectName:{
        type:String,
        required:true
    },
    spaceId:{
        type:String,
        required:true,
    },
    completedOn:{
        type:Date,
    },
    moudules:[{
        type:mongoose.Schema.Types.ObjectId,
        ref:"Module"
    }]
},{timestamps:true})

export const Project = mongoose.model("Project",projectSchema);