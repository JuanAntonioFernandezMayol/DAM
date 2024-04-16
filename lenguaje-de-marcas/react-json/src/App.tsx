import React, { useState, useEffect } from "react";
import "./App.css";
import { Card } from "react-bootstrap";

interface Fruta {
  id: number;
  nombre: string;
  disponible: boolean;
  color: string;
  origen: string;
  imagenUrl: string;
}

const App = () => {
  const [frutas, setFrutas] = useState<Fruta[]>([]);

  useEffect(() => {
    fetch("https://raw.githubusercontent.com/JuanAntonioFernandezMayol/DAM/main/lenguaje-de-marcas/react-json/src/data.json")
      .then((response) => response.json())
      .then((data) => setFrutas(data as Fruta[]));
  }, []);

  return (
    <div className="App">
      <h1>Lista de frutas</h1>
      {frutas.map((fruta) => (
        <Card key={fruta.id}>
          <Card.Img variant="top" src={fruta.imagenUrl} />
          <Card.Body>
            <Card.Title>{fruta.nombre}</Card.Title>
            <Card.Text>
              <p>ID: {fruta.id} </p>
              <p>Color: {fruta.color}</p>
              <p>Origen: {fruta.origen}</p>
              <p>Disponible: {fruta.disponible ? "Sí" : "No"}</p>
            </Card.Text>
          </Card.Body>
        </Card>
      ))}
    </div>
  );
};

export default App;
