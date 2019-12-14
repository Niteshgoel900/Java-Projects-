import java.security.SecureRandom;
import java.util.Scanner;

public class problem1 {

    static double rand_int1 = 0, rand_int2 = 0;
    public static void main(String[] args) {

        int num_correct=0, choice, session = 1, difficulty;
        Scanner scnr = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        while(session==1)
        {
            System.out.printf("Enter a difficulty level(1-4):");
            difficulty = scnr.nextInt();
            System.out.printf("Difficulty:%d\n",difficulty);

            choice = typeQuestions();

            switch(choice)
            {
                case 1:
                    num_correct = addition(difficulty);
                    break;
                case 2:
                    num_correct = multiplication(difficulty);
                    break;
                case 3:
                    num_correct = subtraction(difficulty);
                    break;
                case 4:
                    num_correct = division(difficulty);
                    break;
                case 5:
                    num_correct = mixture(difficulty);
                    break;
                default:
                    System.out.println("DEFAULT");
                    break;
            }
            System.out.printf("\nNumber of correct: %d\n", num_correct);
            System.out.printf("Number of wrong: %d", (10-num_correct));
            System.out.printf("\nThe percentage of correct answers was %d%c\n", (num_correct*10), '%');

            if((num_correct*10) < 75)
            {
                System.out.printf("Please ask your teacher for extra help.\n\n");
            }
            else
            {
                System.out.printf("Congratulations, you are ready to go to the next level!\n\n");
            }

            System.out.printf("Would you like to start a new session? (Enter 1 for yes or 0 for no)");
            session = scnr.nextInt();
            System.out.println();
        }
        System.out.println("Session has been ended");
    }

    private static int typeQuestions(){
        int choice;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Choose: (1) for addition ");
        System.out.println("Choose: (2) for multiplication ");
        System.out.println("Choose: (3) for subtraction ");
        System.out.println("Choose: (4) for division (Enter answer rounded 2 decimal places!");
        System.out.println("Choose: (5) for mixture ");

        choice = scnr.nextInt();
        return choice;
    }

    public static void question(int difficulty){
        SecureRandom rand = new SecureRandom();
        switch(difficulty)
        {
            case 1:
                rand_int1 = rand.nextInt(10);
                rand_int2 = rand.nextInt(10);
                break;
            case 2:
                rand_int1 = rand.nextInt(100);
                rand_int2 = rand.nextInt(100);
                break;
            case 3:
                rand_int1 = rand.nextInt(1000);
                rand_int2 = rand.nextInt(1000);
                break;
            case 4:
                rand_int1 = rand.nextInt(10000);
                rand_int2 = rand.nextInt(10000);
        }
    }

    private static void displayMessage(int i){
        SecureRandom rand = new SecureRandom();
        int a = rand.nextInt(4)+1;
        if(i == 0)
        {
            switch(a)
            {
                case 1:
                    System.out.println("No. Keep trying.");
                    break;
                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 3:
                    System.out.println("Don’t give up!");
                    break;
                case 4:
                    System.out.println("No. Please try again.");
                    break;
            }
        }

        if(i == 1)
        {
            switch(a)
            {
                case 1:
                    System.out.println("Nice work!");
                    break;
                case 2:
                    System.out.println("Very good!");
                    break;
                case 3:
                    System.out.println("Excellent!");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
        }
    }

    private static int multiplication(int difficulty) {
        int sw_choice,i=0, num_correct=0;
        double temp, user_answer;
        Scanner scnr = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        question(difficulty);

        System.out.printf("\nQuestion Number 1\n");
        System.out.printf("How much is %.2f times %.2f?",rand_int1, rand_int2);
        user_answer = scnr.nextInt();
        temp = rand_int1 * rand_int2;


        while (i<=9)
        {
            if(user_answer == temp)
            {
                sw_choice = rand.nextInt(5);
                if(sw_choice == 0)
                    sw_choice+=1;

                displayMessage(1);
                num_correct++;

                if(i!=9)
                {
                    question(difficulty);
                    System.out.printf("\nQuestion Number %d\n",i+2);
                    System.out.printf("How much is %.2f times %.2f?",rand_int1, rand_int2);
                    user_answer = scnr.nextInt();
                    temp = rand_int1 * rand_int2;
                }
            }

            else
            {
                sw_choice = rand.nextInt(5);
                if(sw_choice == 0)
                    sw_choice+=1;

                displayMessage(0);

                if(i!=9)
                {
                    question(difficulty);
                    System.out.printf("\nQuestion Number %d\n",i+2);
                    System.out.printf("How much is %.2f times %.2f?",rand_int1, rand_int2);
                    user_answer = scnr.nextInt();
                    temp = rand_int1 * rand_int2;
                }
            }
            i++;
        }
        return num_correct;

    }

    private static int addition(int difficulty) {
        int sw_choice,i=0, num_correct=0;
        double temp, user_answer;
        Scanner scnr = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        question(difficulty);

        System.out.printf("\nQuestion Number 1\n");
        System.out.printf("How much is %.2f plus %.2f?",rand_int1, rand_int2);
        user_answer = scnr.nextFloat();
        temp = rand_int1 + rand_int2;


        while (i<=9)
        {
            if(user_answer == temp)
            {
                sw_choice = rand.nextInt(5);
                if(sw_choice == 0)
                    sw_choice+=1;

                displayMessage(1);
                num_correct++;

                if(i!=9)
                {
                    question(difficulty);
                    System.out.printf("\nQuestion Number %d\n",i+2);
                    System.out.printf("How much is %.2f plus %.2f?",rand_int1, rand_int2);
                    user_answer = scnr.nextFloat();
                    temp = rand_int1 + rand_int2;
                }
            }

            else
            {
                sw_choice = rand.nextInt(5);
                if(sw_choice == 0)
                    sw_choice+=1;

                displayMessage(0);

                if(i!=9)
                {
                    question(difficulty);
                    System.out.printf("\nQuestion Number %d\n",i+2);
                    System.out.printf("How much is %.2f plus %.2f?",rand_int1, rand_int2);
                    user_answer = scnr.nextFloat();
                    temp = rand_int1 + rand_int2;
                }
            }
            i++;
        }
        return num_correct;
    }

    private static int subtraction(int difficulty) {
        int sw_choice,i=0, num_correct=0;
        double temp, user_answer;
        Scanner scnr = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        question(difficulty);

        System.out.printf("\nQuestion Number 1\n");
        System.out.printf("How much is %.2f subtracted %.2f?",rand_int1, rand_int2);
        user_answer = scnr.nextFloat();
        temp = rand_int1 - rand_int2;


        while (i<=9)
        {
            if(user_answer == temp)
            {
                sw_choice = rand.nextInt(5);
                if(sw_choice == 0)
                    sw_choice+=1;

                displayMessage(1);
                num_correct++;

                if(i!=9)
                {
                    question(difficulty);
                    System.out.printf("\nQuestion Number %d\n",i+2);
                    System.out.printf("How much is %.2f subtracted %.2f?",rand_int1, rand_int2);
                    user_answer = scnr.nextFloat();
                    temp = rand_int1 - rand_int2;
                }
            }

            else
            {
                sw_choice = rand.nextInt(5);
                if(sw_choice == 0)
                    sw_choice+=1;

                displayMessage(0);

                if(i!=9)
                {
                    question(difficulty);
                    System.out.printf("\nQuestion Number %d\n",i+2);
                    System.out.printf("How much is %.2f subtracted %.2f?",rand_int1, rand_int2);
                    user_answer = scnr.nextFloat();
                    temp = rand_int1 - rand_int2;
                }
            }
            i++;
        }
        return num_correct;
    }


    private static int division(int difficulty) {
        int  sw_choice,i=0, num_correct=0;
        String temp1;
        double temp, user_answer;
        Scanner scnr = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        question(difficulty);

        while(rand_int2 == 0)
        {
            rand_int2 = rand.nextInt(10);
        }

        System.out.printf("\nQuestion Number 1\n");
        System.out.printf("How much is %.2f dvided %.2f?",rand_int1, rand_int2);

        user_answer = scnr.nextFloat();
        temp = rand_int1 / rand_int2;
        temp1 = String.format("%.2f", temp);
        temp = Float.parseFloat(temp1);


        while (i<=9)
        {
            if(user_answer == temp)
            {
                sw_choice = rand.nextInt(5);
                if(sw_choice == 0)
                    sw_choice+=1;

                displayMessage(1);
                num_correct++;

                if(i!=9)
                {
                    question(difficulty);
                    while(rand_int2 == 0)
                    {
                        rand_int2 = rand.nextInt(10);
                    }
                    System.out.printf("\nQuestion Number %d\n",i+2);
                    System.out.printf("How much is %.2f divided %.2f?",rand_int1, rand_int2);
                    user_answer = scnr.nextFloat();
                    temp  = rand_int1 / rand_int2;
                    temp1 = String.format("%.2f", temp);
                    temp = Float.parseFloat(temp1);

                }
            }

            else
            {
                sw_choice = rand.nextInt(5);
                if(sw_choice == 0)
                    sw_choice+=1;

                displayMessage(0);

                if(i!=9)
                {
                    question(difficulty);
                    while(rand_int2 == 0)
                    {
                        rand_int2 = rand.nextInt(10);
                    }
                    System.out.printf("\nQuestion Number %d\n",i+2);
                    System.out.printf("How much is %.2f divided %.2f?",rand_int1, rand_int2);
                    user_answer = scnr.nextFloat();
                    temp  = rand_int1 / rand_int2;
                    temp1 = String.format("%.2f", temp);
                    temp = Float.parseFloat(temp1);
                }
            }
            i++;
        }

        return num_correct;
    }


    private static int mixture(int difficulty) {

        int i = 0, selector, num_correct=0, sw_choice;
        double temp, user_answer;
        String temp1;
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);
        question(difficulty);
        while(i != 10)
        {
            selector = rand.nextInt(4);
            switch(selector)
            {
                case 0:
                    System.out.printf("\nQuestion Number %d\n", i+1);
                    System.out.printf("How much is %.2f times %.2f?",rand_int1, rand_int2);
                    user_answer = scnr.nextInt();
                    temp = rand_int1 * rand_int2;
                    if(user_answer == temp)
                    {
                        sw_choice = rand.nextInt(5);
                        if(sw_choice == 0)
                            sw_choice+=1;

                        displayMessage(1);
                        num_correct++;
                    }
                    else
                    {
                        sw_choice = rand.nextInt(5);
                        if(sw_choice == 0)
                            sw_choice+=1;

                        displayMessage(0);
                    }
                    break;
                case 1:
                    System.out.printf("\nQuestion Number %d\n", i+1);
                    System.out.printf("How much is %.2f minus %.2f?",rand_int1, rand_int2);
                    user_answer = scnr.nextInt();
                    temp = rand_int1 - rand_int2;
                    if(user_answer == temp)
                    {
                        sw_choice = rand.nextInt(5);
                        if(sw_choice == 0)
                            sw_choice+=1;

                        displayMessage(1);
                        num_correct++;
                    }
                    else
                    {
                        sw_choice = rand.nextInt(5);
                        if(sw_choice == 0)
                            sw_choice+=1;

                        displayMessage(0);
                    }
                    break;
                case 2:
                    System.out.printf("\nQuestion Number %d\n", i+1);
                    System.out.printf("How much is %.2f plus %.2f?",rand_int1, rand_int2);
                    user_answer = scnr.nextInt();
                    temp = rand_int1 + rand_int2;
                    if(user_answer == temp)
                    {
                        sw_choice = rand.nextInt(5);
                        if(sw_choice == 0)
                            sw_choice+=1;

                        displayMessage(1);
                        num_correct++;
                    }
                    else
                    {
                        sw_choice = rand.nextInt(5);
                        if(sw_choice == 0)
                            sw_choice+=1;

                        displayMessage(0);
                    }
                    break;
                case 3:
                    while(rand_int2 == 0)
                    {
                        rand_int2 = rand.nextInt(10);
                    }

                    System.out.printf("\nQuestion Number %d\n", i+1);
                    System.out.printf("How much is %.2f dvided %.2f?",rand_int1, rand_int2);

                    user_answer = scnr.nextFloat();
                    temp = rand_int1 / rand_int2;
                    temp1 = String.format("%.2f", temp);
                    temp = Float.parseFloat(temp1);
                    if(user_answer == temp)
                    {
                        sw_choice = rand.nextInt(5);
                        if(sw_choice == 0)
                            sw_choice+=1;

                        displayMessage(1);
                        num_correct++;
                    }
                    else
                    {
                        sw_choice = rand.nextInt(5);
                        if(sw_choice == 0)
                            sw_choice+=1;

                        displayMessage(0);
                    }
                    break;
            }
            question(difficulty);
            i++;
        }
        return num_correct;

    }

}
