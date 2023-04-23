import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.vych.game.DesktopLauncher;
import com.vych.game.utils.PropertiesLoader;

public class Main {
    public static void main(String[] args) {

        PropertiesLoader propertiesLoader = PropertiesLoader.getInstance();

        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setForegroundFPS(propertiesLoader.getInt("game.config.desktop.targetFps"));
        config.setTitle(propertiesLoader.getString("game.config.desktop.title"));
        config.setWindowedMode(
                propertiesLoader.getInt("game.config.desktop.w"),
                propertiesLoader.getInt("game.config.desktop.h")
        );
        config.useVsync(propertiesLoader.getBool("game.config.desktop.vsync"));
        config.setWindowIcon("icon.png");

        DesktopLauncher.launch(config, CustomScene.class);

    }
}
