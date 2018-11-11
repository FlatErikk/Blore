package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class Assets {
    static TextureAtlas menuButtons;
    static BitmapFont asgard;
    static Preferences settings;
    static float sound;
    static int screenWidth, screenHeight;

    static void loadMainMenu(){
        menuButtons = new TextureAtlas(Gdx.files.internal("menuButtons.atlas"));
        asgard = new BitmapFont(Gdx.files.internal("asgard.fnt"));

        settings = Gdx.app.getPreferences("settings");
        sound = settings.getFloat("sound");
        screenWidth = settings.getInteger("screenWidth");
        screenHeight = settings.getInteger("screenHeight");
    }
}
