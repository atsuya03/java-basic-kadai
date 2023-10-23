package kadai_017;

public abstract class Kato_Chapter17 {

			
	private static final String String = null;
	//フィールドの設定
	public String familyName;
	public String givenName;
	public String adress;
	
	//givennameをコンストラクタ
	public Kato_Chapter17(String familyName,String givenName, String adress) {
		this.familyName = familyName;
		this.givenName=givenName;
		this.adress=adress;
		
	}
	
	
	//共通紹介メソッド
	public void commonIntroduce(String familyName,String givenName,String adress) {
		this.familyName = familyName;
		this.givenName=givenName;
		this.adress=adress;
		
		System.out.println("名前は"+familyName+givenName);
		System.out.println(adress);
		
	}
	
	//抽象個別紹介メソッド
	abstract void eachIntroduce();
		
	
	//趣味紹介メソッド
    public void execIntroduce() {
    	commonIntroduce(familyName,givenName,adress);
    	eachIntroduce();
    	
    	
    	
    	
	}
	
	
		

	}


