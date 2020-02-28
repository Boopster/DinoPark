import React from 'react';
import './PlayGame.css';
import NavBar from '../../components/nav-bar/NavBar';
import Inventory from '../../components/inventory/Inventory';

const PlayGame = () => {
  return (
    <>
      <NavBar/>
      <div className="park-container">
        <Inventory/>
      </div>
    </>
  );
};

export default PlayGame;
