package homework_01;

public class HW1 {
	public static void main(String[] args) {
		calcSumAndProudct(12,6);
		calcEggs(200);
		calcTimeIntoDate(256559);
		circleAreaAndCircumference(5);
		calcRate(1_500_000,0.02,10);
		typeChange ();
	}
//		請設計一隻Java程式,計算12,6這兩個數值的和與積
	public static void calcSumAndProudct(int i,int j) {
		 System.out.println(i+"跟"+j+"的和為:"+(i+j)+"，積為:"+i*j);
	}
//		• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
	public static void calcEggs(int i) {
		System.out.println(i+"顆的雞蛋是，"+i/12+"打又"+i%12+"顆");
}
//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	public static void calcTimeIntoDate(int i) {
		int days = i/(60*60*24) ; 
		int hours = i/(60*60) - days*24 ; 
		int minutes = i/60 - hours*60 - days*(24*60) ;
		int sec = i - minutes*60 - hours*(60*60) - days*(24*60*60) ;
		System.out.println(i+"秒是"+days+"天又"+hours+"小時又"+minutes+"分又"+sec+"秒。");
	}
//		• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
	 public static void circleAreaAndCircumference(double i){
		 double pi =3.1415;
		 System.out.println("半徑為"+i+"的圓，其圓周長為"+String.format("%.4f",2*i*pi,4f)+"，面積為"+String.format("%.4f",pi*Math.pow(i, 2)));
	}
//		• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
	 public static int calcRate(int value ,double rate, int year){
		 System.out.println(year+"年後，本金加利息為"+Math.round(value*(float)Math.pow((1+rate),year))+"元");
		 return Math.round(value*(float)Math.pow((1+rate),year));
	 }
//		• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
	 public static void typeChange () {
		 System.out.println(5 + 5);
		 //結果為10，會直接印出兩個整數相加（int + int）
		 System.out.println(5 + '5'); 
		 //結果為58, '5'為char型別，跟int型別相加後，晉升為53（unicode對應，5十進位值為53），故相加後為58
		 System.out.println(5 + "5");
		 //結果為"55"（String型別），數字與字串相加時，會轉為字串型別
	 }
	 	
}
