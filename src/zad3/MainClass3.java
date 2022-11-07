package zad3;

public class MainClass3 {

	public static void main(String[] args) {
		Covek c = new Covek ();
		c.ime = "Marija";
		c.prezime = "Mircheska";
		c.embg = "220900017485";
		
		System.out.println("Imeto na covekot e: " + c.ime);
		System.out.println("Prezimeto na covekot e: " + c.prezime);
		System.out.println("Covekot ima maticen broj: " + c.embg);
	}

}