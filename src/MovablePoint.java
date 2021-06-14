public class MovablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MovablePoint(){
    }

    public MovablePoint(float x, float y){
        this.x = x;
        this.y = y;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public float[] getSpeed(){
        return new float[]{this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x= " + super.x +
                "y= " + super.y +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public MovablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
