package model;

public class Vector {

    private Double x;
    private Double y;
    private Double z;

    public Vector(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public void setX(Double x){
        this.x = x;
    }

    public Double getX(){
        return x;
    }

    public void setY(Double y){
        this.y = y;
    }

    public Double getY(){
        return y;
    }

    public void setZ(Double z){
        this.z = z;
    }

    public Double getZ(){
        return z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public Double length(){
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public String sumOfVec(Vector vec){
        String str = String.format("(%.1f, %.1f, %.1f)", this.x + vec.x, this.y + vec.y, this.z + vec.z);
        return str;
    }

    public String difOfVec(Vector vec){
        String str = String.format("(%.1f, %.1f, %.1f)", this.x - vec.x, this.y - vec.y, this.z - vec.z);
        return str;
    }
}
