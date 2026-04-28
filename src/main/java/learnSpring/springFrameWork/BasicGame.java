package learnSpring.springFrameWork;

import learnSpring.springFrameWork.game.SuperContraGame;
import learnSpring.springFrameWork.game.gamerunner;

public class BasicGame {

	public static void main(String[] args) {
		// var marioGame = new MarioGame(); // creating game object
		var SuperContraGame = new SuperContraGame();
		var gamerunner = new gamerunner(SuperContraGame); // sending mariogame objectto gameRunner
		gamerunner.run();

	}

}
