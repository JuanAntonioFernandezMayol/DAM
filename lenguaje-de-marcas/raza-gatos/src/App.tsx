import React from "react";
import "./App.css";
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import Container from "react-bootstrap/Container";
import Nav from "react-bootstrap/Nav";
import Navbar from "react-bootstrap/Navbar";
import Breeds from "./views/Breeds";
import Inicio from "./views/home";
import DetallesRaza from "./views/DetallesRaza";

function App() {
  return (
    <div>
      <BrowserRouter>
        <div>
          <Navbar bg="dark" data-bs-theme="dark" className="menu">
            <Container>
              <Navbar.Toggle aria-controls="basic-navbar-nav" />
              <Navbar.Collapse id="basic-navbar-nav">
                <Nav>
                  <Nav.Link as={Link} to="/">
                    Home
                  </Nav.Link>
                  <Nav.Link as={Link} to="/breeds">
                    Listado de razas
                  </Nav.Link>
                </Nav>
              </Navbar.Collapse>
            </Container>
          </Navbar>

          <Routes>
            <Route path="/breeds" element={<Breeds />} />
            <Route path="/" element={<Inicio />} />
            <Route path="/breeds/:id" element={<DetallesRaza />} />
          </Routes>
        </div>
      </BrowserRouter>
    </div>
  );
}

export default App;
