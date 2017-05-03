package javaCoupling;

public class Coupling {
	car c=new car();
	
void journey(){
		c.move();
			}

public static void main(String[] args) {
	Coupling c1=new Coupling();
	c1.journey();
}
}

class car{
	void move(){
		System.out.println("move by car");
		}
}