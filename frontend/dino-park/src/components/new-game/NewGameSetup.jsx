import React from 'react';
import './NewGameSetup.css';
import Button from '../button/Button'

const NewGameSetup = ({handleSaveGame, changeGameState}) => {

  const saveGame = async (event) => {
    event.preventDefault();
    let balance = 0;
    if (event.target.difficulty.value === "easy") {
      balance = 2000;
    } else {
      balance = 1000;
    }
    const game = {
      "username": event.target.username.value,
      "parkName": event.target.parkname.value,
      "difficulty": event.target.difficulty.value,
      "balance": balance
    }
    handleSaveGame(game);
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
          <input id="text-input" name="username" type="text" placeholder="Enter username.."/>
        </div>
        <div className="park-name">
          <p>Park Name:</p>
        </div>
        <div className="park-name-input">
          <input id="text-input" name="parkname" type="text" placeholder="Enter park name.."/>
        </div>
        <div className="difficulty">
          <p>Difficulty:</p>
        </div>
        <div className="difficulty-input">
          <label forhtml="easy">
            <input id="easy" name="difficulty" type="radio" value="easy"/>Easy
          </label>
          <label forhtml="normal">
            <input id="normal" name="difficulty" type="radio" value="normal" defaultChecked/>Normal
          </label>
          <label forhtml="hard">
            <input id="hard" name="difficulty" type="radio" value="hard"/>Hard
          </label>
        </div>
        <div className="footer">
          <Button
            title="Create Game"
            onClick={saveGame}
            className="button"
            value="welcome-animation"
            type="submit"
          />
        </div>
      </div>
    </>
  );

};

export default NewGameSetup;
