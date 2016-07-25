package com.mygdx.game.screens;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.IdleClicker;

public class SplashScreen extends AbstractScreen{

	private Texture splashImg;

	public SplashScreen(IdleClicker game) {
		super(game);
		init();
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
