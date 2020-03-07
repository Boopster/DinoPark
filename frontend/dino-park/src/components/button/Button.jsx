import React from 'react';
import './Button.css';

const Button = ({className, onClick, title, value, type}) => {
  return (
    <button className={className} onClick={onClick} value={value} type={type}>{title}</button>
  );
};

export default Button;
