public class SnakeAndLadderUC1 {

	public static void main(String[] args) {
		int position = 0;
		int roll = 0;
		int rolls_till_now = 0;
		int option =0;
		/*          Option 1 = No play  |  option 2 = Ladder  |   option 3 = Snake      */
		System.out.println("Initial position = 0");
		Random random = new Random();
			while(true) {
			roll = random.nextInt(7);
			if(roll!=0)
			break;
		}
		System.out.println("Your roll is :"+roll);
	}
}
