package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//家族データを出力
		
		KatoTaro_Chapter17 Taro = new KatoTaro_Chapter17("加藤", "太郎", "住所は東京都中野区〇×です");
		KatoIchiro_Chapter17 Ichirou = new KatoIchiro_Chapter17("加藤", "一郎", "住所は東京都中野区〇×です");
		KatoIHanako_Chapter17 Hanako = new KatoIHanako_Chapter17("加藤", "花子", "住所は東京都中野区〇×です");
		
		Taro.execIntroduce();
		
		Ichirou.execIntroduce();
		
		Hanako.execIntroduce();
		

	}

}
