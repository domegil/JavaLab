import java.util.Random;
public class Arrays{

    public static void main(String[] args) {


        int [] array = new int[6];

        Random random = new Random();

        //System.out.println(numbers)//

        for (int i = 0; i<array.length; i++){
            int numbers = random.nextInt(50);
            array[i]=numbers;
            System.out.println(array[i]);
        }
    }

}

