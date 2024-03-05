import React from 'react'
import { actividadesLibres } from '../components/actividadesLibres'
import { Col, Row } from "react-bootstrap";

function ActividadesLibres() {
    return (
        <div className="card">
        <Row>
            {actividadesLibres.map((filas, indice) => (
                <Col xs={12} sm={6} md={4} lg={3}>
                    <div className="card-body text-bg-dark mb-3 text-center rounded" key={indice}>
                        <div>
                            <img src={filas.imagen} alt={"foto"} style={{ width: '15rem' }} />
                        </div>
                        <h4 className="card-title">{filas.actividad}</h4>
                        <p className="card-text">Capacidad: {filas.capacidad}</p>
                        <p className="card-text">Precio: {filas.precio}</p>
                        <p className="card-text">Ubicacion: {filas.ubicacion}</p>
                        <p>Disponible: {filas.disponible ? "Sí" : "No"}</p>
                        <a href="https://www.booking.com/region/es/mallorca.es.html" className="btn btn-primary">Link</a>
                    </div>
                </Col>
            ))}
        </Row>
    </div>
    )
}

export default ActividadesLibres