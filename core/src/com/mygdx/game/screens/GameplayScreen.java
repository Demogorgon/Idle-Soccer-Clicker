package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.IdleClicker;
import com.mygdx.game.entities.Player;

public class GameplayScreen extends AbstractScreen {
	
	private Player player;
	private TextButton generateCashButton;
	private TextButtonStyle textButtonStyle;
	private BitmapFont font;
	private Skin skin;
	private TextureAtlas buttonAtlas;


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
        font = new BitmapFont();
        skin = new Skin();
        buttonAtlas = new TextureAtlas(Gdx.files.internal("ui/test.pack"));
        skin.addRegions(buttonAtlas);
        textButtonStyle = new TextButtonStyle();
        textButtonStyle.font = font;
        textButtonStyle.up = skin.getDrawable("test");

        generateCashButton = new TextButton("Button1", textButtonStyle);
		generateCashButton.setWidth(460);
		generateCashButton.setHeight(360);
		generateCashButton.setX(50);
		generateCashButton.setY(170);
		generateCashButton.setDebug(true);
		
		stage.addActor(generateCashButton);
		
		generateCashButton.addListener(new ClickListener(){
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				
				player.reactOnClick();
				
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
