import java.util.Scanner;

public class Dictionary {
    public static void main(String []args) {
        int num, i, j;
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the number of words :");
        num = input.nextInt();

        String[] array = new String[num];


        System.out.println("Enter " + num + " words: ");
        String temp;
        for (i = 0; i < num; i++)
            array[i] = input.nextLine();

        for (i = 0; i < ( num - 1 ); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j].compareToIgnoreCase(array[j+1]) < 0)
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted list of words:");

        for (i = 0; i < num; i++)
            System.out.println(array[i]);
    }
}



