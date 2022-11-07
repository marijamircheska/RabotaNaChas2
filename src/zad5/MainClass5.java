package zad5;

public class MainClass5 {

	public static void main(String[] args) {
		Predmet p1 = new Predmet();
		p1.ime = "Objektno orientirano programiranje";
		p1.profesor = "Ilija Jolevski";
		p1.brKrediti = 6;
		p1.semestar = "3ti semestar";
		
		System.out.println(p1.ime + ", " + p1.profesor + ", " + p1.brKrediti + " krediti, " + p1.semestar + ".");
		
		Predmet p2 = new Predmet ("Web programiranje");
		System.out.println(p2.ime);
		
		Predmet p3 = new Predmet ("MSP", "Ilija Jolevski", 6);
		System.out.println(p3.ime + ", " + p3.profesor + ", " + p3.brKrediti + " krediti.");
	}

}
