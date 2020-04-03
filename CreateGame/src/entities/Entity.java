package entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.state.StateBasedGame;

public abstract class Entity {
	public float posX;
	public float posY;
	public Shape shape;
	public boolean wantToDie = false; //Wenn true wird es von der Loop in Controls/update gel�scht
	public int age = 0; //Eigenschaft die von Erbenden Methoden genutzt werden kann
	
	public Entity(float x, float y){
		posX = x;
		posY = y;
	}
	
	public abstract void update(GameContainer gc, StateBasedGame sbg, int t); //Dient zum Updaten von Physik und Logik
	public abstract void render(GameContainer gc, Graphics g); //Dient zum Zeichnen der Graphik
	
}
