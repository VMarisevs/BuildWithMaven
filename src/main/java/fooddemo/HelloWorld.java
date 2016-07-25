package fooddemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorld {
	public static void main(String[] args) {
		
		//Fruit f = new Fruit();
		//Vegetable v = new Vegetable();
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("./src/main/java/contextClassPath/appContext.xml");
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("contextClassPath/appContext.xml");
		
		Meal springMeal = appContext.getBean("meal", Meal.class);
		System.out.println("Spring Meal:" + springMeal.whatsInThisMeal() + "\n\n\n");
		
		Meal refMeal = appContext.getBean("mealWithRefs", Meal.class);
		System.out.println("Ref Meal:" + refMeal.whatsInThisMeal() + "\n\n\n");
		
		
		
		
		Meal innerBeanAppleMeal = appContext.getBean("mealOuterBean", Meal.class);
		System.out.println("Spring meal: " + innerBeanAppleMeal.whatsInThisMeal());
		
		//Meal autowireByTypeMeal = appContext.getBean("mealAutowired", Meal.class);
		//System.out.println("Autowired meal: " + autowireByTypeMeal.whatsInThisMeal());
		
		Meal autowiredByName = appContext.getBean("mealAutowiredByName",Meal.class);
		System.out.println("Autowired by name : "  + autowiredByName.whatsInThisMeal());
		
		Meal autowiredByConstructor =  appContext.getBean("autowiredByConstructor",Meal.class);
		System.out.println("Autowired by constructor : " + autowiredByConstructor.whatsInThisMeal());
		
		
		Fruit f = (Fruit) appContext.getBean("fruit");
		System.out.println(f.talkAboutYourself());
		
		Vegetable v = (Vegetable) appContext.getBean("externalVeg");
		System.out.println(v.talkAboutYourself() + "\nDefinition: " + v.getDefinition());
		
		Fruit otherFruit = (Fruit) appContext.getBean("fruitWithName");
		System.out.println(otherFruit.talkAboutYourself());
		
		Vegetable otherVegetable = (Vegetable) appContext.getBean("vegWithName");
		System.out.println(otherVegetable.talkAboutYourself());
		
		
		System.out.println(((Vegetable) appContext.getBean("vegWithPNamespace")).talkAboutYourself());
		
		
		
		Fruit fruitColleciton = (Fruit) appContext.getBean("fruitWithListAndMap");		
		System.out.println("\n\n\n" + fruitColleciton.talkAboutAll());
		
		
		((FileSystemXmlApplicationContext) appContext).close();
	}
}
 