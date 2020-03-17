import React, {useState, useEffect} from 'react';
import InitialState from './title-screen/InitialState';
import LoadGame from '../components/load-game/LoadGame';
import NewGameSetup from '../components/new-game/NewGameSetup';
import WelcomeAnimation from './new-game/WelcomeAnimation';
import PlayGame from './play-game/PlayGame';

const MainContainer = () => {

  const [gameState, setGameState] = useState('initial-state');
  const [savedGames, setSavedGames] = useState([]);

  const url = "api/games";

  useEffect(() => {
    loadData();
  }, [gameState]);

  const loadData = async () => {
    const response = await fetch(url);
    const data = await response.json();
    setSavedGames(data);
    console.log(data);
  };

  const changeGameState = (event) => {
    setGameState(event.target.value);
  };

  const handlePostGame = async (game) => {
    return await fetch(url, {
      method: 'POST',
      headers: {
        'Content-Type':'application/json'
      },
      body:JSON.stringify(game)
    }).then(() => {
      setGameState("welcome-animation");
    });
  };

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
          handlePostGame={handlePostGame}
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
          savedGames={savedGames}
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
