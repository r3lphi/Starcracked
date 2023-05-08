import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Loop implements VisualTickable, Runnable{
    private boolean isRunning = false;

    private Display display;

    private Thread thread;

    public Loop(){
        Start();
    }

    @Override
    public void Start() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        isRunning = true;

        display = new Display("Starcracked", 640, 480);

        Assets.Initialize();
        
        Update();
    }

    @Override
    public void Update() {
        while(isRunning){
            Time.Tick();

            // display.Update();

            Render(display.GetGraphics());
        }

        System.exit(0);
    }

    @Override
    public void Render(Graphics g) {
        g.setColor(Color.blue);

        g.drawImage(
            Assets.s_Tile,
            (display.GetFrame().getWidth() / 2) - (Assets.s_Tile.getWidth() / 2),
            (display.GetFrame().getHeight() / 2) - (Assets.s_Tile.getHeight() / 2),
            null
        );
        g.drawImage(
            Assets.s_Tile,
            (display.GetFrame().getWidth() / 2) - (Assets.s_Tile.getWidth() / 2) - 16,
            (display.GetFrame().getHeight() / 2) - (Assets.s_Tile.getHeight() / 2) + 8,
            null
        );

        g.dispose();
    }
}
