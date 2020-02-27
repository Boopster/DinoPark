import React, {useState, useEffect} from 'react';
import Button from '../../components/button/Button';
import './NewGame.css';

const NewGame = ({changeGameState}) => {

  const [buttonClass, setButtonClass] = useState("button-hidden");

  const toggleButtonClass = () => {
    const startTimer = setTimeout(() => setButtonClass("button fade-in"), 2000);
  }

  useEffect(() => {
    toggleButtonClass();
  }, []);

  return (
    <>
      <h1 className="title"><img height="150" width="150" src={require("../../images/Sprite400.png")} alt="mushroom"/>DinoPark&trade;</h1>
      <div className="flex-end">
        <Button
          onClick={changeGameState}
          className={buttonClass}
          value="welcome-animation"
          title="New Game"
        />
      </div>
    </>
  );
};

export default NewGame;
