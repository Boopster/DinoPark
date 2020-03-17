import React from 'react';
import './NewGameSetup.css';
import FormButton from '../button/FormButton';

const NewGameSetup = ({handlePostGame}) => {

  const saveGame = (event) => {
    event.preventDefault();
    const game = {
      "username": event.target.username.value,
      "difficulty": event.target.difficulty.value,
      "parkName": event.target.parkname.value,
      "balance": 2000
    }
    handlePostGame(game);
  }

  return (
    <>
      <form onSubmit={saveGame} className="new-game-setup">
        <div className="heading">
          <p>Create New Game</p>
        </div>
        <div className="username">
          <p>Username:</p>
        </div>
        <div className="username-input">
          <input id="text-input" name="username" type="text" required="required" placeholder="Enter username.."/>
        </div>
        <div className="park-name">
          <p>Park Name:</p>
        </div>
        <div className="park-name-input">
          <input id="text-input" name="parkname" type="text" required="required" placeholder="Enter park name.."/>
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
          <FormButton
            title="Create Game"
            className="button"
            type="submit"
          />
        </div>
      </form>
    </>
  );

};

export default NewGameSetup;
