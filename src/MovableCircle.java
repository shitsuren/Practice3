public class MovableCircle  implements Movable  {
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed){
    this.center.x = x;
    this.center.y = y;
    this.center.xSpeed = xSpeed;
    this.center.ySpeed = ySpeed;
    this.radius = radius;
   }
    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public void moveUp(){
        this.center.y = this.center.y + this.center.ySpeed;
    }
    public void moveDown(){
        this.center.y = this.center.y + this.center.ySpeed;
    }
    public void moveLeft(){
        this.center.x = this.center.x + this.center.xSpeed;
    }
    public void moveRight(){
        this.center.x = this.center.x - this.center.xSpeed;
    }
}
