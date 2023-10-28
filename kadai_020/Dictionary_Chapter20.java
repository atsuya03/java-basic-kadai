package kadai_020;

import java.util.HashMap;
import java.util.Set;

public class Dictionary_Chapter20 {
	String searchWord;
	
	HashMap<String,String> dicMap = new HashMap<>();
	
	//単語の追加
		public void addWord() {
		
		dicMap.put("apple", "りんご");
		dicMap.put("peach", "桃");
		dicMap.put("banana", "バナナ");
		dicMap.put("lemon", "レモン");
		dicMap.put("pear", "梨");
		dicMap.put("kiwi", "キウイ");
		dicMap.put("strawberry", "いちご");
		dicMap.put("grape", "ぶどう");
		dicMap.put("muscat", "マスカット");
		dicMap.put("cherry", "さくらんぼ");
		
		}
		
	//単語の検索
		 public  void getMeaning(String searchWord) {
			 Set<String> words =dicMap.keySet();
			 
			 for(String key:words) {
				 if(key.equals(searchWord)) {
				 String meaning = dicMap.get(key);

				System.out.println(searchWord+"意味は"+meaning+"です。");
				return;
				 }
			 }
					 System.out.println(searchWord+"は辞書に存在しません。");
				 }
			 
		 }

				
		    
		
		//単語
//		public void research() {
//		for(String key : dicMap.keySet()) {
//			if(dicMap.containsKey(key)) {
//			
//			System.out.println(key+"の意味は"+dicMap.get(key)+"です");
//	
//			}else {
//				System.out.println(key+"は存在しません");
//			}
//			
//			}
//		
//			
//		}
//		public String getMeaning(String word) {
//			return dicMap.get(word);
			
	
//			System.out.println("peachの意味は"+dicMap.get("peach")+"です");
//			System.out.println("bananaの意味は"+dicMap.get("banana")+"です");
//			System.out.println("lemonの意味は"+dicMap.get("lemon")+"です");
//			System.out.println("pearの意味は"+dicMap.get("pear")+"です");
//			System.out.println("kiwiの意味は"+dicMap.get("kiwi")+"です");
//			System.out.println("strawberryの意味は"+dicMap.get("strawberry")+"です");
//			System.out.println("grapeの意味は"+dicMap.get("grape")+"です");
//			System.out.println("muscatの意味は"+dicMap.get("muscat")+"です");
//			System.out.println("cherryの意味は"+dicMap.get("cherry")+"です");
			
			
			
			
			
		
		
		



