package gamelogic;

public class Position {

    public int x;
    public int y;

    public Position getRelativePosition(Position position){
       return new Position(this.x + position.x, this.y + position.y);
    }

    @Override
    public String toString(){
        return "["+this.x+";"+this.y+"]";
    }

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Position(Position position){
        this(position.x, position.y);
    }
}
