import React from "react";
import TodoItem from "./TodoItem";
import { Button } from "react-bootstrap";

function TodoList() {
    const [tasks, setTasks] = React.useState(["Tasca 1", "Tasca 2"]);
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
            <h2>La Meva Llista de Tasques</h2>
            <input className="entradaTarea" value={valor} onChange={actualizarValor} type="text" required placeholder="Escribe una tarea" />
            <ul>
                {tasks.map((task, index) => (
                    <TodoItem key={index} content={task} remove={remove}/>
                ))}
            </ul>
            <Button variant="success" onClick={()=> addTask("ss")}>Añadir Tarea</Button>
        </div>
        
    );
}
export default TodoList