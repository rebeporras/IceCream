package com.empresa.ZombieBird;

import com.badlogic.gdx.Game;
import com.empresa.Screens.SplashScreen;
import com.empresa.ZBHelpers.AssetLoader;

public class ZBGame extends Game {

	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}

}