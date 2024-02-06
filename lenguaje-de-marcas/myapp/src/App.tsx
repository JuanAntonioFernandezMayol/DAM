import React from 'react';
import logo from './logo.svg';
import './App.css';
import TodoList from './TodoList'
import TodoItem from './TodoItem'
import todoButton from './TodoButton'

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <TodoList/>
        
      </header>
    </div>
  );
}

export default App;
