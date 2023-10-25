package kadai_017;

public abstract class Kato_Chapter17 {

			
	//フィールドの設定
	public String familyName;
	public String givenName;
	public String adress;
	
	//givennameをコンストラクタ
	public Kato_Chapter17(String givenName) {
		this.givenName=givenName;

		
	}
	      
	      
	      
	      
	      
	      
	
	//共通紹介メソッド
	public void commonIntroduce() {
		String familyName = "加藤";
		String adress="東京都中野区〇";
		
		
		System.out.println("名前は"+familyName+givenName+"です。");
		System.out.println("住所は"+adress+"です。");
		
	}
	
	//抽象個別紹介メソッド
	abstract void eachIntroduce();
		
	
	//趣味紹介メソッド
    public void execIntroduce() {
    	commonIntroduce();
    	eachIntroduce();
    	
    	
    	
    	
	}
	
	
		

	}


