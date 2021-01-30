package upgradegugudan;
import java.util.Scanner;
public class Gugudan {
	public static int[] gugudantimes(int first,int second) {
		int[] result= new int[second];
		for(int i=0;i<first;i++) {
			for(int j=1;j<second+1;j++) {
				result[i]=(i+1)*j;
				System.out.println(result[i]);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("숫자 입력");
		String inputValue=scanner.nextLine();
		String[] splitedValue=inputValue.split(",");
		int first=Integer.parseInt(splitedValue[0]);
		int second=Integer.parseInt(splitedValue[1]);
		gugudantimes(first,second);
	}	
}
