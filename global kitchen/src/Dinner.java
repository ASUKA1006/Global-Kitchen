import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class Dinner {
	
	static final int Bad_Answer = -1;
	
	//for first question
	public static void Start(String rep) {
		if (rep.equals("yes")|| rep.equals("y")) {

		}else if (rep.equals("no")|| rep.equals("n")) {
			System.out.println("oh, ok");
			
			//Anything is ok but -1,0,1
			//already used there three
			System.exit(2);
		}
						
	}
	
	public static int answerCheck(String answer) {
		if (answer.equals("yes") || answer.equals("y")) {
			return 1;
		}
			
		if (answer.equals("no") || answer.equals("n")) {
			return 0;	
		}
		
		System.out.println("Answer must be 'yes' or 'no'");
		return Bad_Answer;
	}
	
	public static void result(int sum) {
		switch (sum) {		
		case 10:
			//American 
			System.out.println("What about American food?");
			System.out.println("You can get a big humberger meal and hot dogs");
			System.out.println("If you don't want to move, you can always get delivered stuff like chicago pizza");
			System.out.println("What the heck is 'American food' anyways?");
			System.out.println("I dunno");
			
			break;
		case 9:
		case 8:			
			//Mexican
			System.out.println("What about Mexican food?");
			System.out.println("Like tacos and burrito");
			System.out.println("Various kind of vegitable and beans, fish and meat there");
			System.out.println("well-balanced. Hungry? Dom't worry, you'll be full.");
			 
			break;
		case 7:
		case 6:
			//Indian 
			System.out.println("What about Indian food?");
			System.out.println("Speaking of curry, ingredients vary from the region to region");
			System.out.println("Many types of spice and taste will make you satisfied");
			System.out.println("Try them all!");
			
			break;
		case 5:
		case 4:
			//Italian
			System.out.println("What about Italian food?");
			System.out.println("Pasta, lasagna, margherita... Look good, taste good and quantity good.");
			System.out.println("Not only eating all by yourself but sharing is great");
			System.out.println("Recommended for families, groups of friends and couples");
			
			break;
		case 3:
			//French
			System.out.println("What about French food?");
			System.out.println("'That's expensive!' you say? You can make casual ones like pot-au-feu and bouillabaisse" );
			System.out.println("Of course, it's good for anniversaries and girls' parties");
			System.out.println("Enjoy cooking and admire people you know!");
			
			break;
		case 2:
		case 1:
			//Taiwanese
			System.out.println("What about Taiwanese food?");
			System.out.println("Braised pork rice, beef noudle and so on... With a la carte or meal!");
			System.out.println("You can enjoy your dinner either way!");
			System.out.println("If you have enough time to cook, try making dumplings, and it will look gorgeous and casual.");
			
			break;
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("I can help you for dinner. Ready to start? yes/no: ");
		Scanner input = new Scanner (System.in);
		String rep = input.next();
		Start(rep);
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		hashmap.put(1,"Are you hungry so much?: ");
		hashmap.put(2, "Tired?: ");
		hashmap.put(3, "When you hear \"food\", do you think of the color 'brown'?: ");
		hashmap.put(4, "Do you have any plansÅ@(including work) tomorrow?: ");
		hashmap.put(5, "Are you interested in having a tough body?: ");
		hashmap.put(6, "You want to be lazy right now: " );
		hashmap.put(7, "If you could be on the food channel, would you?: ");
		hashmap.put(8, "Will you upload the best shot on Instagram? ");
		hashmap.put(9, "You obviously support quantity over quality, right?: ");
		hashmap.put(10,"Do you think human life is mechanical?: ");
		
		int sum = 0;
		for(Entry<Integer, String> kv : hashmap.entrySet()) {
			int point;
			do {
				
				System.out.println(kv.getValue());
				String answer = input.next();
				point = answerCheck(answer);
				
			}while(point == Bad_Answer);
			sum += point;
		}		
		
		System.out.println("your total is " + sum);
		System.out.println();
		
		
		input.close();
		
		result(sum);
		
	}	

}