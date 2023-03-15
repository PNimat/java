package hw2;

public class Vector {
    private Double x;
    private Double y;
    private Double z;

    public Vector(Double x, Double y, Double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String sumOfVec(Vector vec){
        String str = String.format("Сумма векторов: (%.1f, %.1f, %.1f)",
                this.x + vec.x, this.y + vec.y, this.z + vec.z);
        return str;
    }

    public String defOfVec(Vector vec){
        String str = String.format("Разность векторов: (%.1f, %.1f, %.1f)",
                this.x - vec.x, this.y - vec.y, this.z - vec.z);
        return str;
    }
}
