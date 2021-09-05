import java.util.Scanner;
public class Pattern12 {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			int temp=i;
			for(int j=1;j<=n;j++) {
				System.out.printf("%2d ",temp);
				temp+=5;
			}
			System.out.println();
		}
		
		s.close();
	}

}
