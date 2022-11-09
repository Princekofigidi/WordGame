import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        String name,age, city, college,profession,pet, animal;

// takes input thus name from the user
        System.out.println("Please, your name: ");
        name = src.nextLine();

//takes input thus age from the user
        System.out.println("Please, your age: ");
        age = src.nextLine();

        System.out.println("Name of City: ");
        city = src.nextLine();

        System.out.println("Name of College: ");
        college = src.nextLine();

        System.out.println("Whats your Profession: ");
        profession = src.nextLine();

        System.out.println("Type of Animal: ");
        animal = src.nextLine();

        System.out.println("Whats the name of your pet? ");
        pet = src.nextLine();

        // Concatenate the passage with the declared variables
        System.out.println("There once was a person named " + name + " who lived in " + city + "." + " At the age of "
         + age + ", " + name + " went to college at " + college + "." + " " + name + " graduated and went to work as a " +
                profession + "." + " Then, " + name + " adopted a(n) " + animal + " named " + pet + "." +
                " They both lived happily, ever after!"
        );





        //System.out.println("Hello world!");
    }
}