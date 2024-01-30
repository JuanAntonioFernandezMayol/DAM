import React from "react";
import TodoItem from "./Todoitem";

function TodoList() {
    const [tasks, setTasks] = React.useState(["Tasca 1", "Tasca 2"]);
    
    return (
        <div>
        <h2>La meva LLista de Tasques</h2>
        <ul>
        {tasks.map((task,index) =>  (
            <TodoItem key={index} content={task}></TodoItem>
            ))}
        </ul>
        </div>
    );
    
}
export default TodoList;