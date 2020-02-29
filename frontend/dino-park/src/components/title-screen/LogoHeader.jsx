import React from 'react';
import './LogoHeader.css'

const LogoHeader = () => {

  return (
    <>
      <h1 className="title">
        <img className="title-img" src={require("../../images/Sprite400.png")} alt="mushroom"/>DinoPark&trade;
      </h1>
    </>
  );

};

export default LogoHeader;
