package fooddemo;

public class Apple extends Fruit {

	private String name;
	private String description = "not set.";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String talkAboutYourself(){
		String result = super.talkAboutAll();
		
		if (description != null) result += description;
		
		return result;
	}
}
