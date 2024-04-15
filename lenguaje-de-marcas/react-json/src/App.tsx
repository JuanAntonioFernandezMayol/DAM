import React, { useState, useEffect } from "react";
import "./App.css";
import Bootstrap from "react-bootstrap";

const App = () => {
  const [frutas, setFrutas] = useState([]);

  useEffect(() => {
    fetch("data.json")
      .then((response) => response.json())
      .then((data) => setFrutas(data));
  }, []);

  return (
    <div className="App">
      <h1>Lista de frutas</h1>
      {frutas.map((fruta) => (
        <Bootstrap.Card key={fruta.id}>
          <Bootstrap.Card.Img variant="top" src={fruta.imagenUrl} />
          <Bootstrap.Card.Body>
            <Bootstrap.Card.Title>{fruta.nombre}</Bootstrap.Card.Title>
            <Bootstrap.Card.Text>
              ID: {fruta.id} <br />
              Color: {fruta.color} <br />
              Origen: {fruta.origen} <br />
              Disponible: {fruta.disponible ? "Sí" : "No"}
            </Bootstrap.Card.Text>
          </Bootstrap.Card.Body>
        </Bootstrap.Card>
      ))}
    </div>
  );
};

export default App;
