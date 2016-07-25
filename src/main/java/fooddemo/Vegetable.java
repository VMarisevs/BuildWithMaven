package fooddemo;

public class Vegetable {

	private String myName;
	private String definition = "not set";
	


	public String getDefinition() {
		return definition;
	}



	public void setDefinition(String definition) {
		this.definition = definition;
	}



	public String getMyName() {
		return myName;
	}



	public void setMyName(String myName) {
		this.myName = myName;
	}



	public String talkAboutYourself(){
		String speech = "Hi, I am a vegetable. I am a plant that is eaten as food.";
		
		if (myName != null && myName != "") speech += "My name is " + myName;
		return speech;
	}
}
