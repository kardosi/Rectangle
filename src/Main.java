import java.util.Random;
import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		
		Rectangle a=new Rectangle(6,4);
		Rectangle b=new Rectangle(3);
		Rectangle c=a;
		System.out.println(a + "\n"+ b + "\n"+c);
		a.setSides(5,6);
		System.out.println(a + "\n"+ b + "\n"+c);
		a.setBothSided(3);
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a.hasSameSideLenght(b));
		Rectangle[] rectangleArray = new Rectangle[10];
		Random random = new Random();
		for (int i = 0; i < rectangleArray.length; i++) {
			rectangleArray[i]=new Rectangle(random.nextInt(8) + 2, random.nextInt(8)+2);
			System.out.println(rectangleArray[i]);
		}
		int min=0;
		for (int i = 0; i < rectangleArray.length; i++) {
			if(rectangleArray[i].getArea()<rectangleArray[min].getArea()){
				min=i;
			}
		}
		System.out.println(rectangleArray[min]);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a and b side!");
		int aside=scanner.nextInt();
		int bside=scanner.nextInt();
		Rectangle userRectangle = new Rectangle(aside, bside);
		int counter=0;
		for (Rectangle rectangle : rectangleArray) {
			if(userRectangle.hasBiggerAreaThan(rectangle)){
				counter++;
			}
		}
		System.out.println("There where "+ counter+  " smaller rectangles than the user's ");
		int matchindex =-1;
		for (int i = 0; i < rectangleArray.length; i++) {
			if((userRectangle.hasSameSideLenght(rectangleArray[i])) && matchindex==-1){
				matchindex=i;
			}
			
		}
		if(matchindex!=-1){
			System.out.println(matchindex+1);
		}
		else System.out.println("No matching rectangles!");

	}

}
