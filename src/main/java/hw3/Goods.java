package hw3;

public class Goods {
    private String name;
    private int prise;
    private String grade;
    private String country;
    private Double weight;

    public Goods(String name, int prise, String grade) {
        this.name = name;
        this.prise = prise;
        this.grade = grade;
    }

    public Goods(String name, String country, Double weight, int prise, String grade){
        this.name = name;
        this.prise = prise;
        this.country = country;
        this.weight = weight;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
