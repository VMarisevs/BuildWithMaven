package fooddemo;

import java.util.List;
import java.util.Map;

public class Fruit {

	private String myName;
	private List<String> fruitNameList;
	private Map<String,String> fruitNameMap;
	

	
	
	
	
	
	public Fruit() {
		super();
	}

	public Fruit(String myName) {
		super();
		this.myName = myName;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}


	public List<String> getFruitNameList() {
		return fruitNameList;
	}

	public void setFruitNameList(List<String> fruitNameList) {
		this.fruitNameList = fruitNameList;
	}

	public Map<String, String> getFruitNameMap() {
		return fruitNameMap;
	}

	public void setFruitNameMap(Map<String, String> fruitNameMap) {
		this.fruitNameMap = fruitNameMap;
	}

	public String talkAboutYourself(){
		String speech ="Hi I am a fruit. I come from plants or trees with seeds.";
		
		if (myName != null && myName != "") speech = speech + "My name is: "  + myName;
		
		return speech;
	}
	
	public String talkAboutAll(){
		String speech ="Hi I am a fruit. I come from plants or trees with seeds.";
		
		if (fruitNameList != null && fruitNameList.size() > 0){
			speech += "\nList: ";
			for (int i = 0; i < fruitNameList.size(); i++){
				speech += ". name: " + fruitNameList.get(i);
			}
		}
		
		if (fruitNameMap != null && fruitNameMap.size() > 0){
			speech +="\nMap: ";
			for (Map.Entry<String, String> mfruitName : fruitNameMap.entrySet()){
				speech += mfruitName.getKey() + " ==> " + mfruitName.getValue() + " :: ";
			}
		}
		
		if (myName != null && myName != "") speech = speech + "My name is: "  + myName;
		
		return speech;
	}
	
	public void initMethod(){
		System.out.println("The fruit bean is ready to go." + this.myName);
	}
	
	public void destroyMethod(){
		System.out.println("The fruit bean is about to be destroyed.");
	}
}
