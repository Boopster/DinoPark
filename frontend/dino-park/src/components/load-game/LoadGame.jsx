import React from 'react';
import './LoadGame.css';
import Button from '../../components/button/Button';

const LoadGame = ({savedGames, changeGameState}) => {

  const savedGamesList = savedGames.map((g, id) => (
    <tr key={id}>
      <td>{g.username}</td>
      <td>{g.parkName}</td>
    </tr>
  ));

  return (
    <>
      <div className="top-bottom-grid">
        <div className="top">
          <table>
            <thead>
              <tr>
                <td colSpan="2">Saved Games</td>
              </tr>
              <tr>
                <td>User:</td>
                <td>Park:</td>
              </tr>
            </thead>
            <tbody>
              {savedGamesList}
            </tbody>
          </table>
        </div>
        <div className="bottom">
          <Button
            title="Load Game"
            className="button"
            onClick={changeGameState}
            value="play-game"
            type="button"
          />
          <Button
            title="Return to Title Screen"
            className="button"
            onClick={changeGameState}
            value="initial-state"
            type="button"
          />
        </div>
      </div>
    </>
  );
};

export default LoadGame;
