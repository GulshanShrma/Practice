import java.util.Scanner;
public class Pattern13 {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int add1=9,add2=1;
		for(int i=1;i<=n;i++) {
			int temp=i;
			for(int j=1;j<=n;j++) {
				if(j==1) {
					System.out.printf("%2d ",temp);
					temp+=add1;
				}
				else if (j%2==0) {
					System.out.printf("%2d ",temp);
					temp+=add2;
				}
				else {
					System.out.printf("%2d ",temp);
					temp+=add1;
				}
				
			}
			System.out.println();
			add1-=2;
			add2+=2;
		}
		
		s.close();
	}

}
