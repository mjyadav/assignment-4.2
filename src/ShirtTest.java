/*  class  */
public class ShirtTest {
	/* main method */
	public static void main(String[] args) {
		/* creating object */
		Shirt obj = new Shirt();
		Shirt obj1=new Shirt(12,45);
		/* calling set method */
		obj.setshirtcollarsize(2);
		obj.setshirtsleevlength(4);
		obj.setshirtmaterial("cotton");
		/* output */
		System.out.println("The shirtcollersize is  " + obj.getShirtcollarsize());
		System.out.println("The shirtsleevlength " + obj.getshirtsleevlength());
		System.out.println("The material is " + obj.getshirtmaterial());

	}

}
