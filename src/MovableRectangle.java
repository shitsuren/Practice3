public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
     MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft.x = x1;
        this.bottomRight.x = x2;
        this.topLeft.y = y1;
        this.bottomRight.y = y2;
        this.topLeft.xSpeed = xSpeed;
        this.bottomRight.ySpeed = ySpeed;
    }
    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
    public void moveUp(){
         this.topLeft.y = this.topLeft.y + this.topLeft.ySpeed;
         this.bottomRight.y = this.bottomRight.y + this.bottomRight.ySpeed;
    };
    public void moveDown(){
        this.topLeft.y = this.topLeft.y - this.topLeft.ySpeed;
        this.bottomRight.y = this.bottomRight.y - this.bottomRight.ySpeed;
    };
    public void moveLeft(){
        this.topLeft.x = this.topLeft.x - this.topLeft.xSpeed;
        this.bottomRight.x = this.bottomRight.x - this.bottomRight.xSpeed;
    };
    public void moveRight(){
        this.topLeft.x = this.topLeft.x + this.topLeft.xSpeed;
        this.bottomRight.x = this.bottomRight.x + this.bottomRight.xSpeed;
    };
}
