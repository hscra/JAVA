class Product2 {
	int price;
	int bonusPoint;
	
	Product2(){}
	Product2(int price){
		this.price = price ;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv2 extends Product2 {
	Tv2(){ super(100);}								// super can call parent constructor
	public String toString() {return "Tv";}
}

class Computer2 extends Product2 {
	Computer2(){ super(200); }
	public String toString() {return "Computer";}
}

class Audio2 extends Product2 {
	Audio2(){ super(50); }
	public String toString() {return "Audio";}
}

class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];  			 // array of instances
	int i = 0 ;
	
	void buy(Product2 p) {								// diversion of instance parameters
		if(money < p.price) {
			System.out.println("need more money");
			return ;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println("Bought " + p);
		System.out.println("index "  + i);
		System.out.println("my deposit "  + money);
	}
	
	void summary() {
		int sum = 0;
		String itemList="";
		
		for(int i=0; i<cart.length ; ++i) {
			if(cart[i]==null)break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("total expense : "+sum);
		System.out.println("list of items :"+itemList);
	}
}

public class polymorphism1 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}

}
