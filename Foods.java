package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Foods {
	public ArrayList<Food> foods = new ArrayList<Food>(); 
	private Food [] foodsArr = new Food[16];
	String [] unhealthy = {"Pizza", "Burgers", "Fries", "Hot Dogs", "Dried fruits", "Candy",
			"Granola", "Peanut Butter"};
	String [] wrongFact4Unhealthy = {"A slice of cheese pizza contains approximately 272 calories, "
			+ "12.7 grams of protein, 1.8 grams of fiber, and 9.8 grams of fat.", "A burger with no "
			+ " veggies have 240 calories, 8 grams fat, 3 grams saturated fat", "Fries have 41.8 Calories "
			+"6.6g Carbs (6.1g net carbs) 1.4g Fat 0.6g Protein", "Hot dogs are made of processed meat and they're "
			+ "loaded with cholesterol-raising saturated fat and sodium.", "Dried Fruit is High in Natural Sugar "
			+ "and Calories", "One serving of Skittles (about 38 pieces) provides 160 calories and 37 "
			+ "grams of carbohydrate.","These typically amount to several hundred per serving size", "Many"
			+ " commercial brands of peanut butter that contain various added ingredients, "
			+ "such as sugar, vegetable oils and even trans fat"};
	String [] correctFact4Unhealthy = {"Approximately 251,770,000 lbs. of pepperoni are consumed "
			+ "each year", "McDonalds sells 75 hamburgers every second.", "There are 18 different cuts of fires", 
			"Hot dog's orgin is a mystery", "When fruit is dried, the caloric content remains the same", "Less "
			+ "than two percent of the calories in the American diet are supplied by candy.", "January 21st is "
			+ "National Granola Bar Day." , "Americans consume 700 million pounds of peanut butter annually, about three pounds per person."};
	String [] healthy = {"apple", "popcorn", "orange", "dark chocolate", "eggs", "broccoli", "strawberry", "tomato"};
	String [] wrongFact4Healthy = {"A single medium-sized apple contains about 4 grams of fiber, about 17% of the recommended daily intake.",
	"Popcorn is a whole grain", "Oranges are a good source of potassium.", "chocolate is one of the best sources of antioxidants on the planet.", "eggs contain the highest biological value for protein", "Half a cup of raw broccoli (45 grams) provides almost 70% of the recommended daily intake of vitamin C.","Strawberries are loaded with antioxidants and beneficial plant compounds.", "tomato contains vitamin K which is important for blood coagulation and bone health"};
	String [] correctFact4Healthy = {"The science of apple growing is called pomology.", "Sugar shortages during WWII made candy hard to come by, catapulting popcorn consumption to three times its pre-war levels.", "Orange is a type of berry (hesperidia to be exact)", "It wasn’t until the 19th century that the first chocolate bar was created in Britain.", "Because older eggs have larger air cells, they’re much easier to peel than fresh eggs.", "According to a survey in 2009, broccoli is the sixth most commonly misspelt word in English. ", "There are about 200 seeds on an average strawberry.", "The Aztecs used tomatoes not only as a food, but also as a powerful and dangerous hallucinogenic."};

	/**
	 * makes all the food objects and puts it into an array
	 */
	public void makeFood()
	{
		for(int i = 0; i < 8 ; i++)
		{
			Food temp = new Food(false, unhealthy[i], wrongFact4Unhealthy[i], correctFact4Unhealthy[i]);
			foodsArr[i] = temp;
			Food temp1 = new Food(true, healthy[i], wrongFact4Healthy[i], correctFact4Healthy[i]);
			foodsArr[8+i] = temp1;
		}
	}
	
	/**
	 * shuffles the array of foods and puts it into an Array list
	 */
	public void makeArray()
	{
		Collections.shuffle(Arrays.asList(foodsArr));
		for(int i = 0; i < 16; i ++)
		{
			foods.add(foodsArr[i]);
		}
	}

	public ArrayList<Food> getFoods() {
		return foods;
	}

	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}
}
