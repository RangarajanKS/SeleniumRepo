/**
 * 
 */
package week1.day1;

/**
 * @author Digital Suppliers
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pnum=109;
 
		 for  (int i=2;i<pnum;i++)
		 {
			
			 if(pnum % 2 !=0)
			 {
				 System.out.println("its  a prime number");
				 
				 break;
			 }
			 else  {
				 System.out.println("its not  a prime number");
				 break;
			 }
		 }

	}

}
