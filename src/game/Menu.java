package game;

/**
 * It's a menu!
 */
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class Menu extends BasicGameState{


    public Menu(int state){
    }
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{

    }
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
        g.drawString("This is the awesome menu!!", 200, 200);
        g.fillRect(250,250,200, 50);
    }
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
        Input input = gc.getInput();
        int xPos = Mouse.getX();
        int yPos = Mouse.getY();


        if((xPos > 250 && xPos < 450)&& (yPos>300 && yPos<350)){
            if(input.isMouseButtonDown(0)){
                sbg.enterState(1);
            }
        }
    }
    public int getID(){
        return 0;
    }
}
