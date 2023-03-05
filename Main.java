import java.util.Scanner;
import java.util.Arrays;

import javax.sound.sampled.Line;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputValues = sc.nextLine();

        // ectracting values
        String []array = inputValues.split("#");
    
        int numberOfElements = Integer.parseInt(array[0]);
        int searchElement = Integer.parseInt(array[1]);
        int []arrayInt = Arrays.stream(array[2].split(",")).mapToInt(Integer::parseInt).toArray();

        // searching given element in array
        System.out.println(LinearSearch.searchInArray(numberOfElements, searchElement, arrayInt));

        // closing resource
        sc.close();
    }
}