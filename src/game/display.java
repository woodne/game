package game;

/**
 * actual game yay
 */
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class display extends BasicGameState{

    public display(int state){
    }
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
    }
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
        g.drawString("This is the game display!", 200, 200);
    }
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
    }
    public int getID(){
        return 1;
    }
}