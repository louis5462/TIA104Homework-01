package homework_01;

public class HW2{
	public static void main(String[] args) {
		calcEvenNumSum(1,1000);
		calcEvenNumProduct(1,10);
		calcEvenNumProductW(1,10);
		calcSquareList();
		lotterySelect(1,49);
		drawNumTri(10);
		drawABCTri('A','F');
		testNineNine ();
	}
//		• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	public static void calcEvenNumSum(int start, int end) {
		if (start >= end) {
			System.out.println("起始值小於等於結束值，請重新輸入");
		}else {
			int sum = 0 ;
			if ( start%2 !=0 ) start++;
			if ( end%2 != 0 ) end--;
			for ( ; start <= end ; start+=2) {
				sum += start;
			}
			System.out.println(sum);
		}
	}
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
	public static void calcEvenNumProduct(int start, int end) {
		if (start >= end) {
			System.out.println("起始值小於等於結束值，請重新輸入");
		}else {
			int product = 1 ; 
			for ( ; start <= end ; start++) product*=start ;
			System.out.println(product);
		}
	}
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
	public static void calcEvenNumProductW(int start, int end) {
		if (start >= end) {
			System.out.println("起始值小於等於結束值，請重新輸入");
		}else {
			int product = 1 ; 
			while(start <= end) {
				product*=start ;
				start++;
			}
			System.out.println(product);	
		}
	}
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
	public static void calcSquareList() {
		String list = "" ;
		for (int i = 1; i <=10 ; i++ ) list += String.format("%d ",(int)Math.pow(i, 2));
		System.out.println(list);
	}
//		• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
	public static void lotterySelect (int start, int end) {
		if (start >= end) {
			System.out.println("起始值小於等於結束值，請重新輸入");
		}else {
			String list = "";
			int numList = 0 ;
			for ( ; start <= end; end--) {
				boolean with4 = false;
				int testNum = end;
					for (int i = 2 ; i > 0 ; i--) {
						if(testNum >= Math.pow(10, i)
							//判斷是否有該位數（依序由百位往下測試）
							&& testNum/(int)Math.pow(10, i) == 4){
							with4 = true;
							break;
						}else if (testNum % (int)Math.pow(10, i) == 4){
							//判斷測試個位數是否為4
							with4 = true;
							break;
						}
						testNum = testNum % (int)Math.pow(10, i);
						//去除最大位數，再繼續比較
					}
					if (!with4) {
						list += end+" ";
						numList++;
					}
				}
			System.out.println("共有"+list+"這些數字可以選，一共有"+numList+"個");
			}
		}	

//		• 請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
	public static void drawNumTri (int triNum) {
		for (int i = triNum ; i >= 1 ; i--) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}
//		• 請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
	public static void drawABCTri (char letterSt, char letterEnd) {
		for (char i = letterSt ; i <= letterEnd ; i++) {
			for(char j = letterSt ; j <= i ; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
//		• 請建立一個TestNineNine.java程式，可輸出九九乘法表
	public static void testNineNine () {
		int i = 1 , j = 1 ;
//		• 一：使用for迴圈 + while迴圈
		System.out.println("==== First Round ====");
		for ( ; i <= 9 ; i++ ) {
			while (j <= 9 ) {
				System.out.printf(i+"*"+j+"="+i*j+" ") ;
				j++ ;
			}
			System.out.println("");
			j = 1 ;
		}
//		• 二：使用for迴圈 + do while迴圈
		System.out.println("==== Second Round ====");
		i = 1; 
		j = 1;
		for ( ; i <= 9 ; i++ ) {
			 do{
				 j++ ;
				System.out.printf(i+"*"+j+"="+i*j+" ") ;
			}while (j < 9 );
			System.out.println("");
			j = 1 ;
		}
//		• 三：使用while迴圈 + do while迴圈		
		System.out.println("==== Third Round ====");
		i = 1; 
		j = 1;
			while(i <= 9) {
			 do{
				 j++ ;
				System.out.printf(i+"*"+j+"="+i*j+" ") ;
			}while (j < 9 );
			System.out.println("");
			j = 1 ;
			i ++ ;
		}
		
	}
}