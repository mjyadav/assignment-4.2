/* Create a class named Shirt
 * 
 */
/* Main Class */
public class Shirt {
	/* declaretion */
	private int shirtcollarsize;
	private int shirtsleevlength;
	private String shirtmaterial;

	/* creating constructor */
	public Shirt() {
		int shirtcollarsiz = 11;
		int shirtsleevlhengt = 41;
		final String shirtmaterial = "cottan"; // final
		// output
		System.out.println("default constructor shirtlength " + shirtsleevlhengt);
		System.out.println("default costructor collarsize " + shirtcollarsiz);
		System.out.println("The material is " + shirtmaterial);

	}

	/* constructor */
	public Shirt(int shirtsleevlength, int shirtcollarsize) {
		System.out.println("parametrised shirtlength " + shirtsleevlength);
		System.out.println("parametrised collarlength " + shirtcollarsize);

	}

	/* get method */
	public int getShirtcollarsize() {
		return shirtcollarsize;
	}

	/* get method */
	public int getshirtsleevlength() {
		return shirtsleevlength;
	}

	/* get method */
	public String getshirtmaterial() {
		return shirtmaterial;
	}

	/* set method */
	public void setshirtcollarsize(int newvalue) {
		shirtcollarsize = newvalue;
	}

	/* set method */
	public void setshirtsleevlength(int newvalue) {
		shirtsleevlength = newvalue;
	}

	/* set method */
	public void setshirtmaterial(String newvalue) {
		shirtmaterial = newvalue;
	}

}
