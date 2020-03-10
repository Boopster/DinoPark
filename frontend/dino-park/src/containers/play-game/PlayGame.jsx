import React, {useState} from 'react';
import './PlayGame.css';
import NavBar from '../../components/nav-bar/NavBar';
import Inventory from '../../components/inventory/Inventory';
import Shop from '../../components/shop/Shop';

const PlayGame = () => {
  const [showView] = useState("park-view");

  if (showView === "park-view") {
    return (
      <>
        <NavBar/>
        <div className="park-container">
          <Inventory/>
        </div>
      </>
    );
  } else {
    return (
      <>
        <Shop/>
      </>
    );
  };

};

export default PlayGame;
