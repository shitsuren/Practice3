public abstract class Shape {
    protected String color;
    protected boolean filled;
    abstract double getArea();
    abstract double getPerimeter();
    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public Shape(){
        this.filled = false;
        this.color = "purple";
    }
    public Shape(String color, boolean filled){
        this.filled = false;
        this.color = "purple";
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
