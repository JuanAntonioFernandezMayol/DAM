import React from 'react';
import './App.css';
import Table from "./componentes/Table";

const App: React.FC = () => {
  return (
    <div className="container">
      <h1>Lista de la compra</h1>
      <Table />
    </div>
  );
};

export default App;
