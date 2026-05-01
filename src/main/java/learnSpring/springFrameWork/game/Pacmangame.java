package learnSpring.springFrameWork.game;

public class Pacmangame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("up pacman");
	}

	@Override
	public void down() {
		System.out.println("down pacman");
	}

	@Override
	public void left() {
		System.out.println("left pacman");
	}

	@Override
	public void right() {
		System.out.println("rightpackman");
	}
}
