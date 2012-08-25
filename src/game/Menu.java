package game;

/**
 * It's a menu!
 */
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{

    public Menu(int state){
    }
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
    }
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
        g.drawString("This is a super sweet menu!", 100, 100);

        //200, 130
        Image avatar = new Image("res/avatar.png");
        g.drawImage(avatar, 200,130);
    }
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
    }
    public int getID(){
        return 0;
    }
}
