package kadai_014;

public class CarExec_Chapter14 {
	
	//フィールド(内部データ)
	private int gear=1;
	private int speed=10;
	
	//コンストラクタ
//	public CarExec_Chapter14 (int gear,int speed) {
		//this.gear=gear;
		//this.speed=speed;
		
	//}
	
	//ギアチェンジメソッド
	//aftarGear=変更後のギア
	public void gearChage(int aftarGear) {
		System.out.println("ギア"+this.gear+"から"+aftarGear+"に切り替えました。");
		
		switch(aftarGear) {
		
		case 1 -> speed=10;
		case 2 -> speed=20;
		case 3 ->speed=30;
		case 4 ->speed=40;
		case 5 ->speed=50;
		default ->speed=10;
		
		};
	

	
			
	
			
			}
	
	//ギアチェンジ後の速度を表示
	public void run() {
		System.out.println("速度は時速"+speed+"kmです");
		
		
	}

}
