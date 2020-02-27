import React from 'react';
import './Button.css';

const Button = ({className, onClick, title, value}) => {
  return (
    <button className={className} onClick={onClick} value={value}>{title}</button>
  );
};

export default Button;
