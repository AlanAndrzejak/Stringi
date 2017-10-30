package palindromy;

import java.util.Scanner;

public class Palindrom extends Funkcje implements Wybor, Przywitanie {

	public static void main(String[] args) {
		Palindrom s=new Palindrom();
		Scanner wczytane= new Scanner(System.in);
		s.poczatek();
		boolean zamkniecie=false;
		do {
		s.konsola();
		String zmiana=wczytane.nextLine();
		switch(zmiana)
		{
		case ("1"):{
			podaj(); // static funkcja z klasy abstrakcyjnej
			if (!s.compare_to(wczytane.nextLine().trim())) 
			{
				System.out.println("False :( ");
			}
			else 
				System.out.println("True :)  !! ");
			break;
		}
		case ("2"):{
			podaj(); // static funkcja z klasy abstrakcyjnej
			s.rekurencja(wczytane.nextLine().trim());
			break;
		}
		case("3"):{
			System.out.println(":(");
			zamkniecie=true;
			break;			
		}
		default:{
			System.out.println("Nie ma takiej opcji :( ");
		}
		}}while(!zamkniecie);
		wczytane.close();
	}

	@Override
	public void poczatek() {
		System.out.println("Program sprawdza czy wpisane slowo przez uzytkownika jest palindromem");
		
	}

	@Override
	public void konsola() {
		System.out.print("Prosze wybierz rodzaj sposobu rozwiazania problemu gdzie: \n"
				+ " [1] Metoda compareTo \n"
				+ " [2] Metoda rekurencji \n"
				+ " [3] Wyjscie z programu\n"
				+ "Twoj wybor: ");
		
	}

	@Override
	boolean compare_to(String s) {
		String z="";
		System.out.println("Taki string wskoczyl :)"+s);
		for (int i=s.length()-1; i>=0;i--) 
		{
			z+=s.charAt(i); // stworzenie odwroconego stringa
		}
		return (z.compareTo(s)==0); // porownanie czy jest palindromem

	}

	@Override
	void rekurencja(String s) {
		
		if (s.length()==0 || s.length()==1) // jezeli palindrom ma 1 znak badz ich nie posiada to jest palindromem
		{
			System.out.println("Jest Palindromem :)");
			
		}
		else if (s.charAt(0)==s.charAt(s.length()-1))// jezeli pierwszy i ostatni znak sa takie same idz dalej
		{
			rekurencja(s.substring(1,s.length()-1));
		}
		else {System.out.println("Nie jest Palindromem :)");}
		
	}

}
