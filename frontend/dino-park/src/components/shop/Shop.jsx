import React from 'react';
import Inventory from '../inventory/Inventory';
import './Shop.css';

const Shop = (changeView) => {
  return (
    <>
      <div className="shop-grid">
        <div className="shop-header">
          <Inventory/>
          <h1>Supplies</h1>
        </div>
        <div className="item-grid">
          <div className="item" id="item-1">
            <img className="inv-img" src={require("../../images/Sprite-Meat.png")} alt="raw meat"/>
          </div>
          <div className="item" id="item-2">
            <img className="inv-img" id="mushroom" src={require("../../images/Sprite400.png")} alt="mushroom"/>
          </div>
          <div className="item" id="item-3">
            <img className="inv-img"  id="egg" src={require("../../images/Sprite-egg.png")} alt="dinosaur egg"/>
          </div>
          <div className="item" id="item-4">
            <img className="inv-img" src={require("../../images/Sprite-medicine.png")} alt="medicine"/>
          </div>
        </div>
        <div className="item-details">
          <h2>Item Name</h2>
          <p>Item Description</p>
          <p>Item Price</p>
        </div>
      </div>
    </>
  );
};

export default Shop;
