import React from 'react';
import './LogoHeader.css'

const LogoHeader = () => {

  return (
    <>
      <h1 className="title">
        <img height="150" width="150" src={require("../../images/Sprite400.png")} alt="mushroom"/>DinoPark&trade;
      </h1>
    </>
  );

};

export default LogoHeader;
