package gamelogic;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;

public abstract class GameObject {

    protected int id;
    protected String name;
    protected char model;
    protected String color;
    protected Position position;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TextCharacter getModel() {
        return new TextCharacter(model).withForegroundColor(TextColor.ANSI.valueOf(color));
    }

    public void setModel(char model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
