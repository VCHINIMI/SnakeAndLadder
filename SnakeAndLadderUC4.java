import java.util.Random;


public class Main {

	public static void main(String[] args) {
		int position = 0;
		int roll = 0;
		int rolls_till_now = 0;
		int option =0;
		/*          Option 1 = No play  |  option 2 = Ladder  |   option 3 = Snake      */
		System.out.println("Initial position = 0");
		Random random = new Random();
		while(position!=100) {
			while(true) {
				roll = random.nextInt(7);
				if(roll!=0)
					break;
			}
			rolls_till_now++;
			System.out.println("Your roll is :"+roll);
			while(true) {
				option = random.nextInt(4);
				if(option!=0)
					break;
			}
			System.out.println("Your option is :" + option  );
			switch(option) {
		
			case 1:
				break;
		
			case 2 :
				position=position+roll;
				break;
			
			case 3 :
				position = position - roll;
				if(position<0)
					position =0;
				break;
			
			}
			System.out.println("Position = "+ position+" at the end of "+rolls_till_now+" rolls");
		}
	}

}
