package training;

public class Trainer2 {
    private String name;
    private int yearOfBirth;

    public Trainer2(String name, int yearOfBirth){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

     /*public Trainer(){
         name="John Doe";
         yearOfBirth=1980;
     }*/

    public String getName() {
        return name;
    }

    public String getYearOfBirthAndName() {
        return name + ": " + yearOfBirth;
    }

    public void changeName(String newName){
        name = newName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
