package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();
		Dog[] pups = Dog.createPuppies(3);
		System.out.println(Arrays.toString(pups));
		//Dog.bark();
		Husky husky = new Husky("BOB");
		husky.bark();
		husky.pullSled();
		Dog v1 = new Husky();
		//Husky v2 = new Dog();
		Huggable v2 = new Husky();
		Huggable v3 = new TeddyBear();
		//Husky v4 = new TeddyBear();
		ArrayList<Huggable> hugList = new ArrayList<Huggable>(); //a list of huggable things
		hugList.add(new Husky()); //a Husky is Huggable
		hugList.add(new TeddyBear()); //so are Teddybears!

		//enhanced for loop ("foreach" loop)
		//read: "for each Huggable in the hugList"
		for(Huggable thing : hugList) {
		    thing.hug();
		}
		new GiftBox<Husky>(husky);
	}
}
