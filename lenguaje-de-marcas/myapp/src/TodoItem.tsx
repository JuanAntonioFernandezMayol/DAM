import React from "react";
import { Button } from "react-bootstrap";

function TodoItem({ content,remove }: { content: string,remove: (elemento:string) => void }) {
    return (
            <div>
                <li>{content}</li>
                <i className="del" onClick={() => remove(content)}> X </i>    
            </div>
    )}
export default TodoItem;