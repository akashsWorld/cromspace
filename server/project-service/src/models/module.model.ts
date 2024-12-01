import mongoose from "mongoose";
import ModuleState,{defaultStatus} from "./constants";

const moduleSchema = new mongoose.Schema({
    moduleName:{
        type:String,
        required:true
    },
    state:{
        type:String,
        enum: Object.values(Object.values(ModuleState)),
        default: defaultStatus
    },
    completedOn:{
        type:Date,
    },
    startDate:{
        type:Date, 
    },
    endDate:{
        type:Date
    },
    tasks:[{
        type:mongoose.Schema.Types.ObjectId,
        ref:"Task"
    }]
},{timestamps:true})

export const Module = mongoose.model("Module",moduleSchema);