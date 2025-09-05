public class Encapsulation {
    private String name;
    private int age;
    private int rollNumber;

    public void setAge(int age) {
        if(age <0){
            age = 0;
        }
        this.age = age;
    }
    public int getAge(){
       return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}