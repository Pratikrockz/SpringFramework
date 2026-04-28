package learnSpring.springFrameWork.game;

public class SuperContraGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("up superContra");
	}

	@Override
	public void down() {
		System.out.println("down superContra");
	}

	@Override
	public void left() {
		System.out.println("left superContra");
	}

	@Override
	public void right() {
		System.out.println("right superContra");
	}
}
