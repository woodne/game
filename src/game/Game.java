package game;

/**
 * main game control (loop)
 */
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame {

    public static final int width = 800;
    public static final int height = 600;

    public static final String gameName ="game name here! 0.01 Pre-Alpha";
    public static final int menu = 0;
    public static final int gameScreen = 1;

    public Game(String gameName){
        super(gameName);
        this.addState(new Menu(menu));
        this.addState(new display(gameScreen));
    }
    public void initStatesList(GameContainer gc) throws SlickException{
        this.getState(menu).init(gc, this);
        this.getState(gameScreen).init(gc, this);
        this.enterState(menu);
    }

    public static void main(String[] args) {
        AppGameContainer appgc;
        try{
            appgc = new AppGameContainer(new Game(gameName));
            appgc.setDisplayMode(width,height,false);
            appgc.start();
        }catch(SlickException e){
            e.printStackTrace();
        }
    }
}
