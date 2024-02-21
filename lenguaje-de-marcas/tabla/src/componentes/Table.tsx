import React from "react";
import {filas} from "./lista"

function Table() {
    return (
        <table className="table">
          <thead>
            <tr>
              <th>Producte</th>
              <th>Quantitat</th>
              <th>Preu</th>
              <th>Tenda</th>
              <th>Notes</th>
              <th>Comprat</th>
              <th>Imatge</th>
            </tr>
          </thead>
          <tbody>
            {filas.map((fila, index) => (
              <tr key={index}>
                <td>{fila.producto}</td>
                <td>{fila.cantidad}</td>
                <td>{fila.precio}</td>
                <td>{fila.tienda}</td>
                <td>{fila.notas}</td>
                <td>{fila.comprado ? "Sí" : "No"}</td>
                <td>
                  <img src={fila.imagen} alt={fila.producto} style={{ maxWidth: '100px' }} />
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      );
    
    
}
export default Table