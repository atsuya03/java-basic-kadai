package kadai_020;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Dictionary_Chapter20 search = new Dictionary_Chapter20();
		String[]meaning= {"apple","banana","grape","orange"};
		
		
		//単語を追加
		search.addWord();
		
		for(String word:meaning) {
		search.getMeaning(word);
		
		
		}
//		search.getMeaning("banana");
//		search.getMeaning("grape");
//		search.getMeaning("orange");
		
		
		
		
		

	}

}
