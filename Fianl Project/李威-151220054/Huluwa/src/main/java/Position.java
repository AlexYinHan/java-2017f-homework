@FuncAnno(func="to hold the creatures")

public class Position {

    private int x;
    private int y;
    private Thing2D holder;
    private boolean Owned;//是否被占的flag

    public Thing2D getHolder() {
        if(Owned)
            return holder;
        else
            return null;
    }

    public void setHolder(Thing2D holder) {
    	
        this.holder = holder;
        Owned=true;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public boolean getOwned(){return this.Owned;}

    public void setOwned(boolean Owned){this.Owned=Owned;}

    public Position(int x){
        super();
        this.x = x;
        Owned=false;
    }

    public Position(int x,int y){
        super();
        this.x = x;
        this.y = y;
        Owned=false;
    }
}