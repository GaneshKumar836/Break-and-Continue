import java.util.Scanner;

public class Continue{

	public static void main(String[] args) {
		int i,n;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter n value");
		 n=sc.nextInt();
		 for(i=1;i<=n;i++)
		 {
			 if(i==10)
			 {
				continue; 
			 }
			 System.out.println(i);
			 
		 }
		 sc.close();
		 
	}

}
