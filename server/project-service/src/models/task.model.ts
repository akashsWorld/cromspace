import mongoose from "mongoose";
import  TaskStatus, {defaultStatus,TaskType,defaultTaskType} from "./constants";
const taskSchema = new mongoose.Schema({
    taskName:{
        type:String,
        required:true
    },
    taskDeatils:{
        type:String,
        required:true
    },
    taskStatus:{
        type:String,
        enum: Object.values(Object.values(TaskStatus)),
        default: defaultStatus
    },
    taskType:{
        type:String,
        enum: Object.values(Object.values(TaskType)),
        default: defaultTaskType
    },
    taskPoints:{
        type:Number
    },
    assignedTo:{
        type:String,
    }
},{timestamps:true});

export const Task = mongoose.model("Task",taskSchema);