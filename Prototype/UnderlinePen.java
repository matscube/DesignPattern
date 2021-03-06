import framework.*;

public class UnderlinePen implements Product {
	private char ulchar;
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}
	public void use(String s) {
		System.out.println("\"" + s + "\"");
		int length = s.getBytes().length;
		for (int i = 0; i < length + 2; i++) {
			System.out.print(ulchar);
		}
		System.out.println("");
	}
	public Product createClone() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}