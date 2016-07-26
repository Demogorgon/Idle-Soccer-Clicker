package com.mygdx.game.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Player extends Image{
	private final static int WIDTH = 68;
	private final static int HEIGHT = 70;

	private final static int ButtonPosX = 200;
	private final static int ButtonPosY = 300;

	public Player() {
		super(new Texture("Ball.png"));


		this.setOrigin(WIDTH / 2, HEIGHT / 2);
		this.setSize(WIDTH, HEIGHT);

		// starting position
		this.setPosition(ButtonPosX, ButtonPosY);
	}

	public void reactOnClick() {
		Action RotateAction = Actions.rotateBy(20);
		
		this.addAction(RotateAction);
		
	}

}
