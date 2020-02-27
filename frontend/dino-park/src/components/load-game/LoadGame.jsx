import React from 'react';
import './LoadGame.css';
import Button from '../../components/button/Button';

const LoadGame = ({changeGameState}) => {
  return (
    <>
      <div className="top-bottom-grid">
        <div className="top">
          <table>
            <thead><tr><td>Saved Games</td></tr></thead>
            <tbody>
              <tr>
                <td>Saved Game 1</td>
              </tr>
              <tr>
                <td>Saved Game 2</td>
              </tr>
              <tr>
                <td>Saved Game 3</td>
              </tr>
            </tbody>
          </table>
        </div>
        <div className="bottom">
          <Button
            title="Load Game"
            className="button"
          />
          <Button
            title="Return to Title Screen"
            className="button"
            onClick={changeGameState}
            value="initial-state"
          />
        </div>
      </div>
    </>
  );
};

export default LoadGame;
