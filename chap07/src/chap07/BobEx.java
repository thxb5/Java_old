package chap07;

public class BobEx {

	public static void main(String[] args) {
		Bob bob = new Bob (null, 0);
		
		for(int i=1;i<=5;i++) {
			int problemLocation = bob.time();
			
			switch(problemLocation) {
			case 1:
				System.out.println("아침식사");
				break;
				
			case 2:
				System.out.println("점심식사");
				break;
			}
			System.out.println("=====================");
		}

	}

}
