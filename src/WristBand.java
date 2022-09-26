public class WristBand {
    public static void main(String[] args) {

        System.out.println("Enter your age");
        int userAge = 26;

        System.out.println("Your age is " + userAge);

        if (userAge >= 21){
            System.out.println("You get a wristband");
        } else if (userAge < 21) {
            System.out.println("You do not get a wristband");
        }

    }
}
