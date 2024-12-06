package btvn5_2;

public class Employee extends Person {
    private double experience ;
    private String placeWork ;

    public Employee(int id, String name, String address, int age, String placeWork, double experience) {
        super(id, name, address, age);
        this.placeWork = placeWork;
        this.experience = experience;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    @Override
    public String toString() {
        return getId()+" - "+super.getName()+" - "+super.getAddress()+" - "+super.getAge()+" - "+getPlaceWork()+" - "+getExperience();
    }
}
