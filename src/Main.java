import java.util.Random;

public class Main {
    public static void main(String[] args) {

        user(33,3);
        int randomAge = randomGenerateAge();
        user(randomAge,45);


    }

    public static int randomGenerateAge(){
        Random random = new Random();
        return random.nextInt(90);
    }

    public static void user(int ageUser, int temperature){
        String result = userAge(22,5);
        System.out.println("Резултат:  " +result);
    }



    public static String userAge(int ageUser, int temperature) {
        if ((ageUser >= 20 || ageUser <= 45 && temperature >= -20 || temperature <= 30)
                || (ageUser <= 20 && temperature >= 0 || ageUser <= 28) ||
                (ageUser >= 45 && temperature >= -10 || temperature <= 25))
        {
            return "Можно идти гулят ";

        } else{
            return "Оставайтесь дома";
        }
    }
}