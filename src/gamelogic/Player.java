package gamelogic;

import java.util.Calendar;

public class Player extends GameObject{
    public Player() {
        this.id = 1;
        this.name = "Player"+ Calendar.getInstance().getTimeInMillis();
        this.model = '@';
        this.color = "GREEN_BRIGHT";
        this.position = new Position(1,1);
    }
}
