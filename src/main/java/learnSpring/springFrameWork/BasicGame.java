package learnSpring.springFrameWork;

import learnSpring.springFrameWork.game.Pacmangame;
import learnSpring.springFrameWork.game.gamerunner;

public class BasicGame {

	public static void main(String[] args) {
		// var marioGame = new MarioGame(); // creating game object
		// var SuperContraGame = new SuperContraGame();
		// var game = new SuperContraGame();
		// var game = new MarioGame();
		var game = new Pacmangame();
		var gamerunner = new gamerunner(game); // sending mariogame objectto gameRunner
		gamerunner.run();

	}

}

// In case of tightly coupled game runner class is directly calling mario game or supercontra game now
// game runner calling gameconsole interface and mario game super contra game implemnets gaming console interface

//It is loosely coupled