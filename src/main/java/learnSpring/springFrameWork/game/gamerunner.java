package learnSpring.springFrameWork.game;

public class gamerunner {
	// MarioGame game;
	SuperContraGame game;

	//// this is called tightly coupled this is why we should avoid it

	public gamerunner(SuperContraGame game) {
		this.game = game;
	}

	public void run() {
		System.out.println("this is game runner " + game);
		game.up();
		game.down();
		game.left();
		game.right();

	}

}
