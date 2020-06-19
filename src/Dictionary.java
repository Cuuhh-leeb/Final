import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        int num;
        int i;
        int j;
        String temp;


        Scanner input = new Scanner(System.in);


        System.out.println("Enter the number of words :");
        num = input.nextInt();

        String[] array = new String[num];


        System.out.println("Enter " + num + " words: ");
        Scanner words = new Scanner(System.in);
        String str;
        // str = words.nextLine();
        System.out.println("Entered words");

        for (i = 0; i < num; i++) {
            array[i] = input.next();
        }
        System.out.println("Alphabetical order");


        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j].compareToIgnoreCase(array[j + 1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                for (i = 0; i < num; i++)
                    System.out.println(array[i]);


                System.out.println("Reverse order");

                for (i = 0; i < (num - 1); i++) {
                    for (j = 0; j < num - i - 1; j++) {
                        if (array[j].compareToIgnoreCase(array[j + 1]) < 0) {
                            temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;

                        }
                    }
                }

                for (i = 0; i < num; i++)
                    System.out.println(array[i]);
            }
        }
    }
}



