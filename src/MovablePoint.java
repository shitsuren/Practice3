public class MovablePoint implements Movable{
    int x;
 int y;
 int xSpeed;
 int ySpeed;

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
 }
    public void moveUp(){
        this.x = this.x+this.xSpeed;
    };
    public void moveDown(){
        this.x = this.x-this.xSpeed;
    };
    public void moveLeft(){
        this.y = this.y+this.ySpeed;
    };
    public void moveRight(){
        this.y = this.y+this.ySpeed;
    };
}
