import React from 'react'
import { puntosDeInteres } from "../components/puntosInteres"
import { Col, Row } from "react-bootstrap";


function PuntosInteres() {
    return (
        <div className="card">
        <Row>
            {puntosDeInteres.map((filas, indice) => (
                <Col xs={12} sm={6} md={4} lg={3}>
                    <div className="card-body text-bg-dark mb-3 text-center rounded" key={indice}>
                        <div>
                            <img src={filas.imagen} alt={"foto"} style={{ width: '15rem' }} />
                        </div>
                        <h5 className="card-title">{filas.nombre}</h5>
                        <p className="card-text">Ubicacion: {filas.ubicacion}</p>
                        <p className="card-text">Descripcion: {filas.descripcion}</p>
                        <p>Entradas: {filas.entrada ? "Sí" : "No"}</p>
                        <a href="https://www.booking.com/region/es/mallorca.es.html" className="btn btn-primary">Link</a>
                    </div>
                </Col>
            ))}
        </Row>
    </div>
    )
}

export default PuntosInteres