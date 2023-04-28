package T20230428;


class T0428_a {
	
	public static void main(String[] args) {
		//사람 클래스(ver.1) 사용 예
		HumanV1 gildong = new HumanV1();
		HumanV1 chulsu = new HumanV1();
				
		gildong.name = "길동";
		gildong.height = 170;
		gildong.weight = 60;
			
		chulsu.name = "철수";
		chulsu.height = 166;
		chulsu.weight = 72;		
				
		System.out.println("이름: " + gildong.name);
		System.out.println("신장: " + gildong.height + "cm");
		System.out.println("체중: " + gildong.weight + "kg");
		System.out.println();
				
		System.out.println("이름: " + chulsu.name);
		System.out.println("신장: " + chulsu.height + "cm");
		System.out.println("체중: " + chulsu.weight + "kg");

	}

}
