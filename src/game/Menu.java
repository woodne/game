package game;

/**
 * It's a menu!
 */
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class Menu extends BasicGameState{
 //   Image play;
 //   Image exit;
    Image menu;

    public Menu(int state){
    }
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
  //      play = new Image("res/play.png");
  //      exit = new Image("res/exit.png");
        menu = new Image("res/menu.png");
    }
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
        menu.draw();
    }
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{

    }
    public int getID(){
        return 0;
    }
}
