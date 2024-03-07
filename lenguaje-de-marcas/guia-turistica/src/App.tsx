import React from 'react';
import './App.css';
import {
  BrowserRouter,
  Routes,
  Route,
  Link,
} from "react-router-dom";
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import Inicio from "./views/home"
import ActividadesLibres from "./views/actividades-libres"
import Hoteles from "./views/hoteles"
import PuntosInteres from "./views/puntos-interes"
import Restaurantes from "./views/restaurantes"
function App() {
  return (
    <div>
    <BrowserRouter>
    <div>
      <Navbar bg="dark" data-bs-theme="dark" className='menu'>
        <Container>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
          <Nav>
            <Nav.Link as={Link} to="/">Home</Nav.Link>
            <Nav.Link as={Link} to="/actividades-libres">Actividades Libres</Nav.Link>
            <Nav.Link as={Link} to="/hoteles">Hoteles</Nav.Link>
            <Nav.Link as={Link} to="/puntos-de-interes">Puntos de interes</Nav.Link>
            <Nav.Link as={Link} to="/restaurantes">Restaurantes</Nav.Link>
          </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>

      
        <Routes>
          <Route path="/actividades-libres" element={<ActividadesLibres />} />
          <Route path="/hoteles" element={<Hoteles />} />
          <Route path="/puntos-de-interes" element={<PuntosInteres />} />
          <Route path="/restaurantes" element={<Restaurantes />} />
          <Route path="/" element={<Inicio />} />
        </Routes>
    </div>
    </BrowserRouter>
    </div>
  );
};

export default App;