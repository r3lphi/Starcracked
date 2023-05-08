import java.time.Duration;
import java.time.Instant;

public class Time {
    private static Duration lastTime = Duration.ZERO;
    private static Instant beginTime = Instant.now();

    public static double deltaTime;

    public static void Tick(){
        Duration fpsTime = Duration.between(beginTime, Instant.now());
        deltaTime = (double)(fpsTime.toMillis() - lastTime.toMillis()) / 1000;

        lastTime = fpsTime;
    }
}