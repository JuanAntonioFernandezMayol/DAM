import React, { useState, useEffect } from "react";
import "./App.css";
import { Card, Container, Row, Col } from 'react-bootstrap';

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
    <Container>
      <h1 className="text-center">Lista de frutas</h1>
      <Row xs={1} md={2} lg={3} xl={4} className="g-4">
        {frutas.map((fruta) => (
          <Col key={fruta.id}>
            <Card>
              <Card.Img variant="top" src={fruta.imagenUrl} className="img-fluid"/>
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
          </Col>
        ))}
      </Row>
    </Container>
  );
};

export default App;
