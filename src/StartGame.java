import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import gamelogic.Player;
import view.TerminalDraw;

import java.io.IOException;

import static view.TerminalDraw.terminal;
import static view.TerminalDraw.textGraphics;

public class StartGame {

    public static Player player = null;

    public static void main(String[] args) throws IOException {
        TerminalDraw.init();

        player = new Player();

        textGraphics = TerminalDraw.terminal.newTextGraphics();

        textGraphics.drawRectangle(new TerminalPosition(0,0), new TerminalSize(10,10), '*');
        textGraphics.setCharacter(player.getPosition().x, player.getPosition().y, player.getModel());

        terminal.flush();
    }
}
