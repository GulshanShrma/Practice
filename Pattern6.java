import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int temp=1;
		for (int i=n;i>=1;i--) {
			for (int j=n;j>=1;j--) {
				System.out.printf("%2d ",temp++);
			}
			System.out.println();
	}
		s.close();

}
}
