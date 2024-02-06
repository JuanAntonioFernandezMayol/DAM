import React from "react";
import TodoItem from "./TodoItem";
import { Button } from "react-bootstrap";

function TodoButton() {
    const [cont, setCont] = React.useState(0)

    return (
        <div>
            <p>{cont}</p>
            <Button variant="success" onClick={()=> setCont(prevCont => prevCont + 1)}>+1</Button>
        </div>
    );
}

export default TodoButton;