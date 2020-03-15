import React, {useState} from 'react';
import './PlayGame.css';
import NavBar from '../../components/nav-bar/NavBar';
import Inventory from '../../components/inventory/Inventory';
import Shop from '../../components/shop/Shop';

const PlayGame = () => {
  const [showView, setShowView] = useState("park-view");

  const changeView = (event) => {
    setShowView(event.target.value);
  };

  if (showView === "park-view") {
    return (
      <>
        <NavBar
          changeView={changeView}
        />
        <div className="park-container">
          <Inventory/>
        </div>
      </>
    );
  } else {
    return (
      <>
        <NavBar
          changeView={changeView}
        />
        <Shop
        />
      </>
    );
  };

};

export default PlayGame;
