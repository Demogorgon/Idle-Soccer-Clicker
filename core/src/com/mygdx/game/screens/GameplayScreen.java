package com.mygdx.game.screens;

import com.mygdx.game.IdleClicker;
import com.mygdx.game.entities.Player;

public class GameplayScreen extends AbstractScreen {
	
	private Player player;

	public GameplayScreen(IdleClicker game) {
		super(game);
		init();
	}

	private void init() {
		InitGenerateCashButton();
		
	}

	private void InitGenerateCashButton() {
		player = new Player();
		stage.addActor(player);
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		update();
		
		spriteBatch.begin();
		stage.draw();
		spriteBatch.end();
	}

	private void update() {
		stage.act();
		
	}

}
