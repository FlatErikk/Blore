package com.mygdx.game;

import com.badlogic.gdx.Game;

public class Blore extends Game {

	@Override
	public void create () {

		//MainMenu
		this.setScreen(new MainMenu(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
	}


}
