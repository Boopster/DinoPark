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
  const urlInventory = "api/inventories";

  useEffect(() => {
    loadData();
  }, [gameState]);

  const loadData = async () => {
    const response = await fetch(url);
    const data = await response.json();
    setSavedGames(data._embedded.games);
    console.log(data);
  };

  const changeGameState = (event) => {
    setGameState(event.target.value);
  };

  const handlePostGame = async (game) => {
    const response = await fetch(url, {
      method: 'POST',
      headers: {
        'Content-Type':'application/json'
      },
      body:JSON.stringify(game)
    })
      const data = await response.json();
      console.log(data);
      setGameState("welcome-animation");
  };

  const handlePostInventory = async () => {
    const inventory = {};
    const response = await fetch(urlInventory, {
      method: 'POST',
      headers: {
        'Content-Type':'application/json'
      },
      body:JSON.stringify(inventory)
    })
      const data = await response.json();
      return data;
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
          handlePostInventory={handlePostInventory}
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
