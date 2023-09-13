package training;

public class TrainerMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer("John Doe", 1980);
        System.out.println(trainer.getName());
        System.out.println(trainer.getYearOfBirth());


        //System.out.println(trainer.getName());
        //System.out.println(trainer.getYearOfBirth());
        /*//trainer.name= "John Doe";
        trainer.setName("John Doe");
        //trainer.yearOfBirth=1983;
        trainer.setYearOfBirth(1983);
       // System.out.println(trainer.name);
        System.out.println(trainer.getName());
        //System.out.println(trainer.yearOfBirth);
        System.out.println(trainer.getYearOfBirth());

        Trainer anotherTrainer = new Trainer();
       //anotherTrainer.name = "Jack Doe";
        anotherTrainer.setName("Jack Doe");
        //anotherTrainer.yearOfBirth=1981;
        anotherTrainer.setYearOfBirth(1981);
       // System.out.println(anotherTrainer.name);

        System.out.println(anotherTrainer.getName());
        System.out.println(anotherTrainer.getYearOfBirthAndName());
        anotherTrainer.changeName("Viktor");
        System.out.println(anotherTrainer.getName());
        anotherTrainer.setName("Jack Doe");
        System.out.println(anotherTrainer.getName());*/
    }
}
