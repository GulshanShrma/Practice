import java.util.Scanner;
public class Pattern11 {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(i+" "+j+" ");
			}
			System.out.println();
		}
		
		s.close();
	}

}
