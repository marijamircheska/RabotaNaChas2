package zad4;

public class MainClass4{

	public static void main(String[] args) {
		Avtomobil avtomobil1 = new Avtomobil();
		avtomobil1.marka = "Renault";
		avtomobil1.model = "Megane";
		avtomobil1.pominatiKm = 24000;
		
		Avtomobil avtomobil2 = new Avtomobil ("Toyota", "Corolla",27000);
		
		System.out.println(avtomobil1.marka + " " + avtomobil1.model + " " + avtomobil1.pominatiKm);
		System.out.println(avtomobil2.marka + " " + avtomobil2.model + " " + avtomobil2.pominatiKm);
	}

}