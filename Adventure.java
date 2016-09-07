import java.util.Scanner;


public class Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String name;
		String question1;
		String question2;
		String question3;
		String question4;
		String question5;
		String question6;
		
		//Say Welcome to the Player
		System.out.println("Welcome to the Game!");
		
		//Ask user for their name
		System.out.println("What is your name? (enter your name)" );
			name = input.nextLine();
		
		//Ask them do they want to play the game
		System.out.println("Would you like to play a game?");
			question1 = input.nextLine();
			
			if(question1.equalsIgnoreCase("yes")){
				System.out.println("Excellent\n");
			}else{
				System.out.println("Ok! Please come back and play again!");
				System.exit(0);
			}
		
		//Ask the user if they want to face the best or run away
			System.out.println("You are walking  across a field and you encounter a fire-breathing dragon!\n"  
					+ "What would you do? (enter 'face the beast' or 'run away'): ");
				question2 = input.nextLine();
				
			if(question2.equalsIgnoreCase("face the beast")){
				System.out.println("You approached the Dragon!\n");
				System.out.println("You see that he has _ heads! (enter '1' , '2' , or '3')");
					question3 = input.nextLine();
					
					//Ask the user if they want to chose 1, 2, or 3
				switch (question3){
					case "1": 
						System.out.println("No one has ever faced a 1-headed dragon before!\n");
					break;
					case "2":
						System.out.println("No one has ever faced a 2-headed dragon before!\n");
					break;
					case "3" :
						System.out.println("No one has ever faced a 3-headed dragon before!\n");
					break;
				}
				
				//Let them chose between slingshot, sword, bow and arrow
					System.out.println("Choose your weapon. (enter 'slingshot' or 'sword' or 'bow and arrow')");
					question4 = input.nextLine();
					
					switch(question4){
						case "slingshot":
							System.out.println("Armed with your slingshot, you approach the dragon. \n You can feel its fiery breath get closer\n");
						break;
						case "sword":
							System.out.println("Armed with youe sword, you approach the dragon. \n You can feel its fiery breath get closer\n");
						break;
						case "bow and arrow":
							System.out.println("Armed with your bow and arrow, you approach the dragon. \n You can feel its fiery breath get closer\n");
						break;
					}
				
				//Let the user chose between red or blue
				System.out.println("It stares at you with its_ eyes. (enter 'red' or 'blue')");
					question5 = input.nextLine();
					
					if(question5.equalsIgnoreCase("red")){
						System.out.println("Oh thank goodness! Red-eyed dragons are friendly.\n");
					}else{
						System.out.println("Run fool its a blue-eyed dragon!!!");
					}
				
				//Ask the user to put in a name(string)
				System.out.println("You pet it and become friends. You name the dragon _. (enter a name)");
					question6 = input.nextLine();
					
				System.out.println(name + " and " + question6 + " live happily ever after");
				
				//Put in a final Game Over message
				System.out.println("Thank you for playing!!");
				
						
				}
			//Close the Game
			else if(question2.equalsIgnoreCase("run away")){
				System.out.println("Your are a loser. Why did you run away? /n Game Over....");
					}
		
			
				
				
				
			
		
				
				
				
				//Put in a final Game Over message
		
		
		
        

	}

}
