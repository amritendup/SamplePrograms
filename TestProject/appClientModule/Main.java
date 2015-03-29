import java.util.*;
import java.io.*;


public class Main {
	
	public void method1(int a){
		
	}
	
	public int method1(int a, String b){
		return 0;
	}
	
    public void method1(int a, int b){
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			StringTokenizer st = new StringTokenizer(line);
			String token = st.nextToken();
			try {
			int a = Integer.parseInt(token);
			
			list.add(a);
			}catch(NumberFormatException e){
				System.out.println("Not valid integer "+token);
			}
			System.out.println("Line : "+sc.nextLine());
			
			
		}
		sc.close();
		// TODO Auto-generated method stub
		Collections.sort(list);
		
		int[] str = new int []{1,3, 0};
		
		
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}
	
}