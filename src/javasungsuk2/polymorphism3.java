

class Product {
	int price;
	int bonusPoint;
	
	Product (int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product{
	Tv1(){ super(100);}
	public String toString() { return "TV";}
}

class Buyer {	
	int money = 1000;	 
	int bonusPoint = 0; 

	void buy(Product p) {
		if(money < p.price) {
			System.out.println(".");
			return;
		}

		money -= p.price;            
		bonusPoint += p.bonusPoint; 
		System.out.println(p + ".");
	}
}
public class polymorphism3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();

		b.buy(new Tv1());
		//b.buy(new Computer());

		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
	}

}
