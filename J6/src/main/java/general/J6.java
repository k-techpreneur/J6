package general;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class J6 {

	public static void main(String[] args) {
//		tt1();
//		tt2();
//		tt3();
		tt4();
	}
	
	static void tt1() {
		BigDecimal value1 = new BigDecimal(2000.00);
		BigDecimal value2 = new BigDecimal(2000.30);
		BigDecimal value3 = new BigDecimal(2000.50);
		BigDecimal value4 = new BigDecimal(2000.55);
		BigDecimal value5 = new BigDecimal(2000);
		BigDecimal value6 = new BigDecimal(2000000000000.4545345);
		
		/*System.out.println("value1: " + value1.setScale(0));
		System.out.println("value2: " + value2.setScale(0)); //arithmeticexception
		System.out.println("value3: " + value3.setScale(0));
		System.out.println("value4: " + value4.setScale(0));*/
		
		System.out.println("value1: " + value1.setScale(0, BigDecimal.ROUND_HALF_UP));
		System.out.println("value2: " + value2.setScale(0, BigDecimal.ROUND_HALF_UP));
		System.out.println("value3: " + value3.setScale(0, BigDecimal.ROUND_HALF_UP));
		System.out.println("value4: " + value4.setScale(0, BigDecimal.ROUND_HALF_UP));
		System.out.println("value5: " + value5.setScale(0, BigDecimal.ROUND_HALF_UP));
		System.out.println("value6: " + value6.setScale(0, BigDecimal.ROUND_HALF_UP));
	}
	
	static void tt2() {
		System.out.println("simpledateformat(null) : " + new SimpleDateFormat("dd/MM/yy HH:mm").format(null)); //NPE
	}
	
	static void tt3() {
		String s1 = null;
		String s2 = "test";
		System.out.println(String.format("%s %s", s1,s2));
	}
	
	static void tt4() {
		DateFormat df = new SimpleDateFormat("ddMMyyyy");
		
		System.out.println(String.format("df %s", df));
	}
	
	static void tt5() {
		long long1 = 100;
		long long2 = 100l;
		
		//int int1 = 100l; //invalid
		int int2 = (int) 100l;
		
		float float1 = 100f;
		//float float2 = 100d; //invalid
		float float4 = 100;
		//float float3 = 100.0;//invalid
		float float5 = 100.0f;
		float float6 = (float) 100.0;
		
		double double1 = 100d;
		double double2 = 100.0f;
		double double4 = 100;
		double double3 = 100.0;
	}

}
