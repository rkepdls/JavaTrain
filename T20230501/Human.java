package T20230501;

public class Human {
	private String name;
	private int height;
	private int weight;
	private Day birthday;
	
	public Human(String n, int h, int w, Day birthday) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.birthday = new Day(birthday);
	}
	
	public String getName() {return name;}
	public int getHeight() {return height;}
	public int getWeight() {return weight;}
	public Day getBirthDay() {return new Day(birthday);}
	
	public void gainWeight(int w) {weight +=w;}
	public void reduceWeight(int w) {weight -=w;}
	
	public void putDate() {
		System.out.println("이름: "+name);
		System.out.println("신장: "+height+"cm");
		System.out.println("체중: "+weight+"kg");
	}

	public String toString() {
		return "{"+name+": "+height+"cm"+weight+"kg"+birthday+"출생}";
	}
}
