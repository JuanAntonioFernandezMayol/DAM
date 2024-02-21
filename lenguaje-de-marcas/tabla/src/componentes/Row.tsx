import React from "react";

interface FilaProps {
    producto: string;
    cantidad: number;
    precio: number;
    tienda: string;
    notas: string;
    comprado: boolean;
    imagen: string;
}

const Row: React.FC<FilaProps> = ({
producto,
cantidad,
precio,
tienda,
notas,
comprado,
imagen,
}) => {
    return (
        <tr>
            <td>{producto}</td>
            <td>{cantidad}</td>
            <td>{precio}</td>
            <td>{tienda}</td>
            <td>{notas}</td>
            <td>{comprado ? "Sí" : "No"}</td>
            <td>
                <img src={imagen} alt={producto} style={{ maxWidth: '100px' }} />
            </td>
        </tr>
    );
};
export default Row