/**
 * 
 */
package csci3444.generics;

/**
 * @author tcont
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		MyGenInterface<Integer, String> mgi1;
		MyGenInterface<Integer, Integer> mgi2;
		
		mgi1 = new MyGenClass<Integer, String>(1, "Thomas");
		mgi2 = new MyGenClass<Integer, Integer>(1, 2017);
		
		Integer i1 = MyRegularClass.getSum(10, 20);
		Float f1 = MyRegularClass.getSum(100f, 200f);
		
		System.out.println("mgi1: " + mgi1.getKey() + " " + mgi1.getValue());
		System.out.println("mgi2: " + mgi2.getKey() + " " + mgi2.getValue());
		
		System.out.println("i1: " + i1);
		System.out.println("f1: " + f1);
	}

}
