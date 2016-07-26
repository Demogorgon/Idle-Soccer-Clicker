package com.mygdx.game.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;
import com.mygdx.game.IdleClicker;

public class SplashScreen extends AbstractScreen{

	private Texture splashImg;

	public SplashScreen(final IdleClicker game) {
		super(game);
		
		Timer.schedule(new Task() {
			
			@Override
			public void run() {
				game.setScreen(new GameplayScreen(game));
			}
		}, 2);
	}
	
	@Override
	protected void init() {
		splashImg = new Texture("Ball.png");
	}

	@Override
	public void render(float delta) {
		final int TextureDrawX = ((IdleClicker.WIDTH / 2) - (splashImg.getWidth() / 2));
		final int TextureDrawY = ((IdleClicker.HEIGHT / 2) + (splashImg.getHeight() / 2));
		
		super.render(delta);
		
		spriteBatch.begin();
		spriteBatch.draw(splashImg, TextureDrawX , TextureDrawY);
		spriteBatch.end();
	}



}
