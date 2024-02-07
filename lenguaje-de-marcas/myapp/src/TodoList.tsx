import React from "react";
import TodoItem from "./TodoItem";
import { Button } from "react-bootstrap";

function TodoList() {
    const [tasks, setTasks] = React.useState(["Tarea 1","Tarea 2"]);
    const [valor, setValor] = React.useState("")


    function addTask(texto: string) {
        setTasks((currentTasks) => [...currentTasks, valor])
        setValor("")
    }
    function actualizarValor(e: React.FormEvent<HTMLInputElement>){
        setValor(e.currentTarget.value)
    }
    function remove(elemento:string){
        setTasks(prevTasks => prevTasks.filter(item => item !== elemento))
    }
    
    return (
        <div>
            <h2>Mi lista de tareas</h2>
            <input className="entradaTarea" value={valor} onChange={actualizarValor} type="text" required placeholder="Escribe una tarea" />
            <Button variant="success" onClick={()=> addTask("ss")}>Añadir Tarea</Button>
            <ul>
                {tasks.map((task, index) => (
                    <TodoItem key={index} content={task} remove={remove}/>
                ))}
            </ul>
        </div>
        
    );
}
export default TodoList