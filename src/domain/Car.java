
package domain;


public class Car {
    
    //attributes
    private String name;
    private int year, sequence;
    private float mileage;
    private boolean isAmerican;

    //Constructors
    public Car() {
        this.name = "";
        this.year = 0;
        this.mileage = 0;
        this.isAmerican = true;
        this.sequence = 0;
    }

    public Car(String name, int year, int sequence, float mileage, boolean isAmerican) {
        this.name = name;
        this.year = year;
        this.sequence = sequence;
        this.mileage = mileage;
        this.isAmerican = isAmerican;
    }
    
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public boolean isIsAmerican() {
        return isAmerican;
    }

    public void setIsAmerican(boolean isAmerican) {
        this.isAmerican = isAmerican;
    }
    
    //toString method

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", year=" + year + ", sequence=" + 
                sequence + ", mileage=" + mileage + ", isAmerican=" + isAmerican + '}';
    } 
    
    public int sizeInBytes(){
        //long: necesita dos bytes
        //String: necesita 2 bytes de espacio.
        return this.getName().length() * 2 + 8;
    }
}
    

