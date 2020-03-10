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
            <a href="/park">Park</a>
          </li>
          <li className="navLink">
            <a href="/supples">Supplies</a>
          </li>
          <li className="navLink">
            <a href="/dashboard">Dashboard</a>
          </li>
          <li>
            <a href="/menu">Menu</a>
          </li>
        </ul>
      </div>
    </>
  )
}

export default NavBar;
