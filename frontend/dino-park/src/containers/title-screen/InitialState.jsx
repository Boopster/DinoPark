import React, {useState, useEffect} from 'react';
import './InitialState.css';
import Button from '../../components/button/Button';
import LogoHeader from '../../components/title-screen/LogoHeader';

const InitialState = ({changeGameState}) => {

  const [buttonClass, setButtonClass] = useState("button-hidden");

  const toggleButtonClass = () => {
    setTimeout(() => setButtonClass("button fade-in"), 2000);
  }

  useEffect(() => {
    toggleButtonClass();
  }, []);

  return (
    <>
      <div className="top-bottom-grid">
        <div className="top">
          <LogoHeader/>
        </div>
        <div className="bottom">
          <Button
            title="New Game"
            className={buttonClass}
            onClick={changeGameState}
            value="new-game"
            type="button"
          />
          <Button
            title="Load Game"
            className={buttonClass}
            onClick={changeGameState}
            value="load-game"
            type="button"
          />
        </div>
      </div>
    </>
  );

};

export default InitialState;
