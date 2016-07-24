package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.IdleClicker;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = IdleClicker.GameName;
		config.width = IdleClicker.WIDTH;
		config.height = IdleClicker.HEIGHT;
		config.resizable = false;
		
		new LwjglApplication(new IdleClicker(), config);
	}
}
