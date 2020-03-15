import React from 'react';
import './NavBar.css';
import Button from '../button/Button';

const NavBar = ({changeView}) => {
  return (
    <>
      <div className="nav-bar">
      <img className="nav-img" src={require("../../images/Sprite400.png")} alt="mushroom"/>
        <ul>
          <li>
            <h1 className="header">DinoPark&trade;</h1>
          </li>
          <li className="navLink">
            <Button className="nav-button" onClick={changeView} type="button" value="park-view">Park</Button>
          </li>
          <li className="navLink">
            <Button className="nav-button" onClick={changeView} type="button" value="shop-view">Supplies</Button>
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
  );
};

export default NavBar;
