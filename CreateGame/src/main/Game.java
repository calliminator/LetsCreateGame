package main;

import java.util.Timer;
import java.util.TimerTask;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import levels.Level1;
import menus.Credits;
import menus.Start;

public class Game extends StateBasedGame {
	/*Here we define our Game-States a Game-States is like a new Screen or like a level
	 *  Every Game-State has a special number assigned to it with which we can "run/load" the state
	 *  
	 *  Formatation:
	 *  Type Levels: "NAME_LEVEL"
	 *  Type Menus: "NAME_Menu"
	 */
	public static final String GAMENAME = "My Jumpn Run Game";
	public static final int START_MENU = 0; // we give out start Menu the id 0
	public static final int CREDITS_MENU = 1;
	public static final int START_LEVEL = 2; // we give out start Ingame the id 1
		
	public Game(String gameName) {
		super(gameName);
		// We add out state to the object Game
		this.addState(new Start(START_MENU)); 
		this.addState(new Credits(CREDITS_MENU));
		this.addState(new Level1(START_LEVEL));
	}

	public void initStatesList(GameContainer gc) throws SlickException {
		this.enterState(START_MENU); // this is the state we first enter
	}

}
