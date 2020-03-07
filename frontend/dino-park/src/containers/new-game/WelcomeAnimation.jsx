import React, {useState, useEffect} from 'react';
import Button from '../../components/button/Button';
import './WelcomeAnimation.css';

const WelcomeAnimation = ({changeGameState}) => {

  const [guideWelcomeCount, setGuideWelcomeCount] = useState(0);
  const [btnValue, setBtnValue] = useState("1");
  const [guideWelcome] = useState(
    [
      'Welcome to the legendary, lost "Boo Boo Island"!',
      "My name is Montgomery Phileas Hunter...",
      "...and I will be your guide, and faithful companion...",
      "...as you settle-in on the island.",
      "I do hope you don't mind me being so forward...",
      "...but I must say...",
      "...we were all a bit surprised you gave up...",
      "...your dream of becoming a software developer...",
      "...to take up the position as the new DinoPark TM Manager.",
      "Anyway!... enough idle chit chat...",
      "...I have such a good feeling about this!",
      "Let's get you started!!!"
    ]
  );

  const guideWelcomeCounter = (event) => {
    const currentCount = guideWelcomeCount + parseInt(event.target.value);
    if (currentCount === guideWelcome.length) {
      setBtnValue("play");
      changeGameState(event);
    } else {
      setGuideWelcomeCount(currentCount);
    }
  }

    useEffect(()=>{},[guideWelcome, guideWelcomeCount]);

  return (
    <>
      <div className="window">
        <div className="banner">
          <h2>Welcome to DinoPark&trade;</h2>
        </div>
        <div className="montgomery"></div>
        <div className="guide">
          <div className="text">
            <p>{guideWelcome[guideWelcomeCount]}</p>
          </div>
          <div className="next">
            <Button
              title="Next"
              className="button"
              onClick={guideWelcomeCounter}
              value={btnValue}
              type="button"
            />
          </div>
        </div>
      </div>
    </>
  );
};

export default WelcomeAnimation;
