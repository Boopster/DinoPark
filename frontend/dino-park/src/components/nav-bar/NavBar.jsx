import React from 'react';
import './NavBar.css';

const NavBar = () => {
  return (
    <>
      <div className="nav-bar">
      <img className="nav-img" src={require("../../images/Sprite400.png")} alt="mushroom"/>
        <ul>
          <li>
            <h1 className="header">DinoPark&trade;</h1>
          </li>
          <li className="navLink">
            <a href="/game">View Park</a>
          </li>
          <li className="navLink">
            <a href="/shop">Shop</a>
          </li>
          <li className="navLink">
            <a href="/dashboard">View Dashboard</a>
          </li>
          <li>
            <a href="/help">Help</a>
          </li>
        </ul>
      </div>
    </>
  )
}

export default NavBar;
