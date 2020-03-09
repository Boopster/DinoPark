import React from 'react';
import './Button.css';

const FormButton = ({className, title, type}) => {
  return (
    <button className={className} type={type}>{title}</button>
  );
};

export default FormButton;
