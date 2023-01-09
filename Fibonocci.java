package week1.day1;

public class Fibonocci {

	public static void main(String[] args)
	{
		int firstnum =0;
		int secNum =1;
		int sum =0;
		
		System.out.println("firstnumber is - " +firstnum);
		System.out.println("Secoundnumber is -" +secNum);
		
		for (int i=0;i<=11;i++)
		{   sum =firstnum+secNum;
			firstnum=secNum;
			secNum=sum;
			System.out.println(sum);
		}
			

	}

}
