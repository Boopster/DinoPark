import React from 'react';
import Inventory from '../inventory/Inventory';
import './Shop.css';

const Shop = () => {
  return (
    <>
      <div className="shop-grid">
        <div className="shop-header">
          <Inventory/>
          <h1>Supplies</h1>
        </div>
        <div className="item-grid">
          <div classname="item" id="item-1">Mushroom</div>
          <div classname="item" id="item-2">Raw Meat</div>
          <div classname="item" id="item-3">Medi-kit</div>
          <div classname="item" id="item-4">Level 1 Egg</div>
          <div classname="item" id="item-5">Level 2 Egg</div>
          <div classname="item" id="item-6">Level 3 Egg</div>
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
