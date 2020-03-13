import React from 'react';
import './Inventory.css';

const Inventory = () => {
  return (
    <>
      <div className="inventory-container">
        <div className="inventory-item-1">
          <img className="inv-img" src={require("../../images/Sprite-Meat.png")} alt="raw meat"/>
          <div className="item-count">0</div>
        </div>
        <div className="inventory-item-2">
          <img className="inv-img" id="mushroom" src={require("../../images/Sprite400.png")} alt="mushroom"/>
          <div className="item-count">0</div>
        </div>
        <div className="inventory-item-3">
          <img className="inv-img" src={require("../../images/Sprite-egg.png")} alt="dinosaur egg"/>
          <div className="item-count">0</div>
        </div>
        <div className="inventory-item-4">
          <img className="inv-img" src={require("../../images/Sprite-medicine.png")} alt="medicine"/>
          <div className="item-count">0</div>
        </div>
      </div>
    </>
  );
};

export default Inventory
