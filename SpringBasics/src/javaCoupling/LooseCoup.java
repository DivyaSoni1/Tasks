package javaCoupling;

interface vehicle{
	
	void move();
}

class Car1 implements vehicle{
	public void move(){
		System.out.println("move by car");
	}
}

class Bike implements vehicle{
	public void move(){
		System.out.println("move by bike");
	}
}

class traveller1{
	
	vehicle v;

	public void setV(vehicle v) {
		this.v = v;
	}
	void journey(){
		v.move();
	}
}

public class LooseCoup {
public static void main(String args[]){
	traveller1 t=new traveller1();
	//t.journey();null pointer
	Car1 c=new Car1();
	t.setV(c);
	t.journey();
	Bike b=new Bike();
	t.setV(b);
	t.journey();
	
	
}
}