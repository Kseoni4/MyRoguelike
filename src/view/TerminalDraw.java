package view;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.AWTTerminalFontConfiguration;
import com.googlecode.lanterna.terminal.swing.SwingTerminalFontConfiguration;

import java.awt.*;
import java.io.IOException;

public class TerminalDraw {


    public static DefaultTerminalFactory dtf = new DefaultTerminalFactory();
    public static Terminal terminal = null;
    public static TextGraphics textGraphics = null;

    public static void init(){
        try {
            dtf.setInitialTerminalSize(new TerminalSize(10,10));

            SwingTerminalFontConfiguration swingTerminalFontConfiguration = SwingTerminalFontConfiguration.newInstance(
                    new Font("Courier New", Font.PLAIN, 32));

            dtf.setTerminalEmulatorFontConfiguration(swingTerminalFontConfiguration);

            terminal = dtf.createTerminal();

            terminal.enterPrivateMode();

            terminal.setCursorVisible(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
