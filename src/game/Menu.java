package game;

/**
 * It's a menu!
 */
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class Menu extends BasicGameState{
    Image play;
    Image exit;
    int width = 800;
    int height = 600;


    public Menu(int state){
    }
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
        play = new Image("res/play.png");
        exit = new Image("res/exit.png");
    }
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
        play.draw(width - 700,height-100);
        exit.draw(width - 200,height -100);
    }
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{

    }
    public int getID(){
        return 0;
    }
}
