import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Assets {
    public static BufferedImage s_Tile, s_Box;

    public static void Initialize(){
        s_Tile = ImportImage("Tile.png");
        s_Box = ImportImage("Box.png");
    }

    public static BufferedImage ImportImage(String src){
        try {
            return ImageIO.read(new File("Assets/" + src));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
