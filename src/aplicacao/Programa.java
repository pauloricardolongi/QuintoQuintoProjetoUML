package aplicacao;



import device.Printer;
import device.Scanner;

public class Programa {

	public static void main(String[] args) {
		Printer p = new Printer("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		Scanner s = new Scanner("2003");
		s.processDoc("My email");
		System.out.println("Scan result: " + s.scan());

	}

}
