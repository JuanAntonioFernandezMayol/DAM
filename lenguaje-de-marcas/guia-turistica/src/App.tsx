import React from 'react';
import './App.css';
import {
  BrowserRouter,
  Routes,
  Route,
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
    <Navbar bg="dark" data-bs-theme="dark" className='menu'>
    <Container>
    <Navbar.Brand href="/">Guia-Turismo</Navbar.Brand>
      <Nav>
      <Nav.Link href="/">Home</Nav.Link>
      <Nav.Link href="/actividades-libres">Actividades Libres</Nav.Link>
      <Nav.Link href="/hoteles">Hoteles</Nav.Link>
      <Nav.Link href="/puntos-de-interes">Puntos de interes</Nav.Link>
      <Nav.Link href="/restaurantes">Restaurantes</Nav.Link>
      </Nav>
      </Container>
      </Navbar>
      
        <BrowserRouter>
        <Routes>
          <Route path="/actividades-libres" element={<ActividadesLibres/>} />
          <Route path="/hoteles" element={<Hoteles/>}/>
          <Route path="/puntos-de-interes" element={<PuntosInteres />}/>
          <Route path="/restaurantes" element={<Restaurantes />}/>
          <Route path="/" element={<Inicio />}/>
        </Routes>
        </BrowserRouter>
    </div>
  );
};

export default App;