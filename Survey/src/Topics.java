import java.util.Scanner;

public class Topics {
	
	public static void main(String[] args) {
		int i,j; // Counters
		int users, response;
		float max, min;
		Scanner scnr = new Scanner(System.in);
		String[] topics = new String[5];
		topics[0]= "Programming";
		topics[1]= "Global warming";
		topics[2]= "PC Games";
		topics[3]= "Math";
		topics[4]= "Science";
		int[][] responses = new int[5][10]; 
		

	    System.out.printf("How many Users are there?");
	    users = scnr.nextInt();
	    System.out.printf("\nPlease rate 1-10 (least important - most important)\n");

		for(i = 0; i < users; i++)
		{
			for(j = 0; j < 5; j++)
			{
				System.out.printf("User %d, what is your rating on the topic %s:", i+1, topics[j]); 
        response = scnr.nextInt();
        responses[j][response-1]+=1;
			}
			System.out.printf("\n");
		}
		
		
		float[] average  = new float[5];
		
		System.out.printf("1 2 3 4 5 6 7 8 9 10 | Avg");
		System.out.printf("\n------------------------------------------\n");
		for ( i = 0; i < 5; i++)
		{
			System.out.printf("%s: ", topics[i]);
			float sum = 0;
			
			for ( j = 0; j < 10; j++)
			{
				System.out.printf("%d ", responses[i][j]);
				
				if(responses[i][j] >= 1)
					sum = sum + responses[i][j]*(j+1); 
			}	
			
			System.out.printf("| %.2f", sum/users);
			average[i] = sum/users;
			System.out.printf("\n");
		}
		
		max = average[0];
		for(i = 0; i < 5; i++)
		{
			if(average[i] > max)
			{
				max = average[i];
			}	
		}
		
		min = average[0];
		for(i = 0; i < 5; i++)
		{
			if(average[i] < min)
			{
				min = average[i];
			}	
		}
		
		
		for(i = 0; i < 5; i++)
		{
			if(max == average[i])
				System.out.printf("The topic with the most points is %s\n", topics[i]);
		}
		
		for(i = 0; i < 5; i++)
		{
			if(min == average[i])
				System.out.printf("The topic with the least points is %s\n", topics[i]);
		}
		
	}
}
