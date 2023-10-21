package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		boolean[] judge = new boolean[101];
		
		
		for(int i =2; i<judge.length;i++) {
			judge[i]=true;
			
		}
		
		for(int i = 2; i<judge.length; i++) {
			if(judge[i]) {
				for(int j= i+1;j<judge.length;j++) {
					judge[j]=(j%i!=0)&&judge[j];
				}
			}
		}
		
		for(int i = 0;i<judge.length;i++) {
			if(judge[i]) {
				System.out.println(i);
			}
		}
	System.out.println();
		

		}
		

	}


