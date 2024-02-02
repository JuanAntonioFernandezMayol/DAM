import React from "react";
function TodoItem ({content}){
    return (
    <div className="">
    <li>{content}</li>
    <button variant="primary">Botón</button>
    </div>
    );
} 

export default TodoItem;