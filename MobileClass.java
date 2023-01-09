package week1.day1;

public class MobileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Mobilemodel = "OPPO-V4";
		int MobileRAMGB = 4;
		boolean frontcamera = true;
		char MobileSeriesType ='V';
		float Mobilesize = 6.4f;
		
		System.out.println("The Mobilemodel - " + Mobilemodel);
		System.out.println("The MobileRAMGB - " + MobileRAMGB);
		System.out.println("The frontcamera - " + frontcamera);
		System.out.println("The MobileSeriesType - " + MobileSeriesType);
		System.out.println("The Mobilesize - " + Mobilesize);
		
		if(frontcamera == true)
		{
			System.out.println("This mobile has frontcamera " + frontcamera);
			
		}
		else
		{
			System.out.println("This mobile doesnt have frontcamera  " + frontcamera);

		}
	}

}
