


import java.awt.*;

public class Level1State extends GameState {

    private TileMap tileMap;

    public Level1State(GameStateManager gsm) {
        this.gsm = gsm;
        init();
    }

    public void init() {
        tileMap = new TileMap();
        tileMap.loadTiles("/Resources/Background/Train.png");
    }


    public void update() {

    }

    public void draw(Graphics2D g) {

        // clear screen
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);

        // draw tilemap
        tileMap.draw(g);

    }

    public void keyPressed(int k) {
    }

    public void keyReleased(int k) {
    }

}











