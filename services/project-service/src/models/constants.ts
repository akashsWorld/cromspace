const Status = {
    pending:"PENDING",
    inProgress:"In_PROGRESS",
    completed:"COMPLETED"
}
export const TaskType = {
    bug:"BUG",
    feature:"FEATURE"
}
export default Status;
export const defaultStatus = Status.pending;
export const defaultTaskType = TaskType.bug;
