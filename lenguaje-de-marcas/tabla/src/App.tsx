import React from 'react';
import logo from './logo.svg';
import './App.css';
import Table from "./componentes/Table";

const App: React.FC = () => {
  return (
    <div className="container">
      <h1>Llista de Compres</h1>
      <Table />
    </div>
  );
};

export default App;
