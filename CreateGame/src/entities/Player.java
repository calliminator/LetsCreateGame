package entities;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

import javafx.geometry.Rectangle2D;
import net.java.games.input.Component.Identifier.Key;

public class Player extends Entity{
	
	public float speed = 2;
	
	public Player(float x, float y) {
		super(x, y);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int t) {
		//Input-Control
		
		if(gc.getInput().isKeyDown(Input.KEY_W) || gc.getInput().isControllerUp(gc.getInput().ANY_CONTROLLER)) {
			posY -= speed;
		}
		if(gc.getInput().isKeyDown(Input.KEY_A) || gc.getInput().isControllerLeft(gc.getInput().ANY_CONTROLLER)) {
			posX -= speed;
		}
		if(gc.getInput().isKeyDown(Input.KEY_S) || gc.getInput().isControllerDown(gc.getInput().ANY_CONTROLLER)) {
			posY += speed;
		}
		if(gc.getInput().isKeyDown(Input.KEY_D) || gc.getInput().isControllerRight(gc.getInput().ANY_CONTROLLER)) {
			posX += speed;
		}
	}

	@Override
	public void render(GameContainer gc, Graphics g) {
		g.setColor(Color.red);
		
		shape = new Rectangle(posX-7, posY-7, 14, 14);
		g.fill(shape);
	}

}
