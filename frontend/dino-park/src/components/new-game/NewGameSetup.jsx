import React from 'react';
import './NewGameSetup.css';
import Button from '../button/Button'

const NewGameSetup = ({changeGameState}) => {

  const saveGame = (event) => {
    changeGameState(event);
  }

  return (
    <>
      <div className="new-game-setup">
        <div className="heading">
          <p>Create New Game</p>
        </div>
        <div className="username">
          <p>Username:</p>
        </div>
        <div className="username-input">
          <input name="username" type="text" placeholder="Enter username.."/>
        </div>
        <div className="park-name">
          <p>Park Name:</p>
        </div>
        <div className="park-name-input">
          <input name="park-name" type="text" placeholder="Enter park name.."/>
        </div>
        <div className="difficulty">
          <p>Difficulty:</p>
        </div>
        <div className="difficulty-input">
          <label forHtml="easy">
            <input id="easy" name="difficulty" type="radio" value="easy"/>Easy
          </label>
          <label forHtml="normal">
            <input id="normal" name="difficulty" type="radio" value="normal"/>Normal
          </label>
          <label forHtml="hard">
            <input id="hard" name="difficulty" type="radio" value="hard"/>Hard
          </label>
        </div>
        <div className="footer">
          <Button
            title="Create Game"
            onClick={changeGameState}
            className="button"
            value="game"
          />
        </div>
      </div>
    </>
  );

};

export default NewGameSetup;
