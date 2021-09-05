import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		for (int i=n;i>=1;i--) {
			for (int j=n;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
	}
		s.close();

}
}
