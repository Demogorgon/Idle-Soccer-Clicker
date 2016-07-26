package com.mygdx.game.screens;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.IdleClicker;
import com.mygdx.game.entities.Player;

public class GameplayScreen extends AbstractScreen {
	
	private Player player;
	private Button generateCashButton;

	public GameplayScreen(IdleClicker game) {
		super(game);
	}

	@Override
	protected void init() {
		InitPlayer();
		InitGenerateCashButton();
	}
	
	private void InitPlayer() {
		player = new Player();
		stage.addActor(player);
	}

	private void InitGenerateCashButton() {
		generateCashButton = new Button(new ButtonStyle());
		generateCashButton.setWidth(460);
		generateCashButton.setHeight(360);
		generateCashButton.setX(50);
		generateCashButton.setY(170);
		generateCashButton.setDebug(true);
		
		stage.addActor(generateCashButton);
		
		generateCashButton.addListener(new ClickListener(){
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				System.out.println("Click");
				return super.touchDown(event, x, y, pointer, button);
			}
		});
		
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
