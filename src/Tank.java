public class Tank {

    private int x, y;
    private int dir;
    private int fuel;
    static int tankNumber;

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank() {
        this(0, 0, 100);
    }

    public void goForward(int i) {

        if(fuel < Math.abs(i)) {
            if (i >= 0)
                i = fuel;
            else i = -fuel;}
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        fuel -= Math.abs(i);
    }

    public void printPosition() {
        System.out.println("The Tank T34-" + ++tankNumber + " is at " + x +", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}
