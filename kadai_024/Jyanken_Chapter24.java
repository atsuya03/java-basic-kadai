package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

//じゃんけんクラス
public class Jyanken_Chapter24 {
	Scanner choice = new Scanner(System.in);
	HashMap<String, String> jyankenn = new HashMap<String, String>( );
	String playerChoice;
	String computerChoice;

	//じゃんけんの手を入力
	public String getMyChoice() {

		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		while (true) {
			playerChoice = choice.next();

			//正しい手かどうか確認
			if (playerChoice.equals("r") || playerChoice.equals("p") || playerChoice.equals("s")) {
				return playerChoice;

			} else {
				System.out.println("正しい手を入力してください");
				;
				continue;
			}

		}
	}

	public String getRandom() {
		String[] enemy = { "r", "s", "p" };
		int enemyChoice = (int) Math.floor(Math.random() * enemy.length);
		
		
		if (enemyChoice == 0) {
			return enemy[0];
		} else if (enemyChoice == 1) {
			return enemy[1];
		} else if (enemyChoice == 2) {
			return enemy[2];

		};
		
		return "";
		
		
		

	}
	
	public void playGame() {
		jyankenn.put("r","グー");
		jyankenn.put("s","チョキ");
		jyankenn.put("p","パー");
		
		String playerChoice = getMyChoice();
	    String computerChoice = getRandom();

	    System.out.println("自分の手は" + jyankenn.get(playerChoice));
	    System.out.println("相手の手は" + jyankenn.get(computerChoice));

	    // 勝敗を判定
	    if (playerChoice.equals(computerChoice)) {
	        System.out.println("結果: 引き分け");
	    } else if ((playerChoice.equals("r") && computerChoice.equals("s"))
	            || (playerChoice.equals("s") && computerChoice.equals("p"))
	            || (playerChoice.equals("p") && computerChoice.equals("r"))) {
	        System.out.println("あなたの勝ち");
	    } else {
	        System.out.println("あなたの負け");
	    }
		
		
		
		
		
	}

}
