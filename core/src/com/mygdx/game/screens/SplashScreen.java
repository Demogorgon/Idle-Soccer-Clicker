package com.mygdx.game.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;
import com.mygdx.game.IdleClicker;

public class SplashScreen extends AbstractScreen{

	private Texture splashImg;

	public SplashScreen(final IdleClicker game) {
		super(game);
		init();
		
		Timer.schedule(new Task() {
			
			@Override
			public void run() {
				game.setScreen(new GameplayScreen(game));
			}
		}, 2);
	}

	private void init() {
		splashImg = new Texture("ball.png");
		
	}

	@Override
	public void render(float delta) {
		super.render(delta);
		
		spriteBatch.begin();
		spriteBatch.draw(splashImg, 0, 0);
		spriteBatch.end();
	}

}
