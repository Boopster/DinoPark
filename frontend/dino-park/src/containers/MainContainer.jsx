import React, {useState} from 'react';
import InitialState from './title-screen/InitialState';
import LoadGame from '../components/load-game/LoadGame';
import NewGameSetup from '../components/new-game/NewGameSetup';
import WelcomeAnimation from './new-game/WelcomeAnimation';
import PlayGame from './play-game/PlayGame';

const MainContainer = () => {

  const [gameState, setGameState] = useState('initial-state');

  const changeGameState = (event) => {
    setGameState(event.target.value);
  }

  if (gameState === 'initial-state') {
    return (
      <>
        <InitialState
          changeGameState={changeGameState}
        />
      </>
    );
  } else if (gameState === 'new-game') {
    return (
      <>
        <NewGameSetup
          changeGameState={changeGameState}
        />
      </>
    );
  } else if (gameState === 'welcome-animation') {
    return (
      <>
        <WelcomeAnimation
          changeGameState={changeGameState}
        />
      </>
    );
  } else if (gameState === 'load-game') {
    return (
      <>
        <LoadGame
          changeGameState={changeGameState}
        />
      </>
    );
  } else {
    return (
      <>
        <PlayGame
        />
      </>
    );
  };

};

export default MainContainer;
