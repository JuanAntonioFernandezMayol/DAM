import React, { useState, useEffect } from "react";
import { useParams } from "react-router-dom";
import Card from "react-bootstrap/Card";
import Image from "react-bootstrap/Image";
export type DetallesRazas = DetalleRaza[];

export interface DetalleRaza {
  weight: Weight;
  id: number;
  name: string;
  bred_for?: string;
  breed_group?: string;
  life_span: string;
  temperament?: string;
  origin?: string;
  reference_image_id: string;
  country_code?: string;
  description?: string;
  history?: string;
}

export interface Weight {
  imperial: string;
  metric: string;
}

const DetallesRaza = () => {
  const { id } = useParams<{ id: string }>();
  const [DetalleRaza, setDetalleRaza] = useState<DetalleRaza[]>([]);

  useEffect(() => {
    fetch(`https://api.thecatapi.com/v1/breeds/${id}`, {
      headers: {
        "x-api-key": "123456",
      },
    })
      .then((response) => response.json())
      .then((data: DetalleRaza) => {
        setDetalleRaza([data]);
      });
  }, [id]);

  return (
    <div className="container-fluid ">
      <h1 className="position-relative">Detalles Raza</h1>
      <div className="d-flex justify-content-center">
        {DetalleRaza.map((raza) => (
          <Card className="text-center align-self-baseline" key={raza.id}>
            <Card.Body>
              <Card.Title>{raza.name}</Card.Title>
              <h4>Details:</h4> {raza.description}
              <Card.Img />
              <Image
                className="img-fluid align-self-end"
                src={
                  "https://cdn2.thecatapi.com/images/" +
                  raza.reference_image_id +
                  ".jpg"
                }
                alt={raza.name}
                fluid
              />
            </Card.Body>
          </Card>
        ))}
      </div>
    </div>
  );
};
export default DetallesRaza;
