package aplicacao;



import device.ComboDevice;
import device.ConcretePrinter;
import device.ConcreteScanner;

public class Programa {

	public static void main(String[] args) {
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My email");
		System.out.println("Scan result: " + s.scan());

		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("Meu Scanner");
		c.print("Minhai impressora");
		System.out.println("Scan resultado " + c.scan());
				
	}

}
