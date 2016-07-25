package fooddemo;

public class Meal {

	private Fruit fruit;
	private Dairy dairy;
	private Grain grain;
	private Meat meat;
	private Vegetable veg;
	
	
	public Meal() {
		super();
	}

	public Meal(Fruit fruit, Dairy dairy, Grain grain, Meat meat, Vegetable veg) {
		super();
		this.fruit = fruit;
		this.dairy = dairy;
		this.grain = grain;
		this.meat = meat;
		this.veg = veg;
	}
	
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public Dairy getDairy() {
		return dairy;
	}
	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}
	public Grain getGrain() {
		return grain;
	}
	public void setGrain(Grain grain) {
		this.grain = grain;
	}
	public Meat getMeat() {
		return meat;
	}
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	public Vegetable getVeg() {
		return veg;
	}
	public void setVeg(Vegetable veg) {
		this.veg = veg;
	}
	
	
	public String whatsInThisMeal(){
		
		String answer = "This meal contains: ";
		if (fruit != null) answer += "\t" + fruit.talkAboutYourself() + "\n";
		if (dairy != null) answer += "\t" +  dairy.talkAboutYourself() + "\n";
		if (grain != null) answer += "\t" +  grain.talkAboutYourself() + "\n";
		if (meat != null) answer += "\t" +  meat.talkAboutYourself() + "\n";
		if (veg != null) answer += "\t" +  veg.talkAboutYourself() + "\n";

		return answer;
	}
	
}
