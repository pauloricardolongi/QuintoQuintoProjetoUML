package device;

public class Printer  extends Device{

	public Printer(String serialNumber) {
		super(serialNumber);
		
	}

	@Override
	public void processDoc(String doc) {
		
		
	}
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}
	

}
