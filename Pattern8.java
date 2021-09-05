import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int temp=2;
		for (int i=n;i>=1;i--) {
			for (int j=n;j>=1;j--) {
				System.out.printf("%2d ",temp);
				temp+=2;
			}
			System.out.println();
	}
		s.close();

}
}
