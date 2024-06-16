package com.beyond.practice.model.vo;
import com.beyond.practice.model.vo.Animal.Animal;
import com.beyond.practice.model.vo.Cat.Cat;
import com.beyond.practice.model.vo.Dog.Dog;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animal = new Animal[5];
		animal[0] = new Cat("고양이1","1","1장소","흰색");
		animal[1] = new Dog("강아지2","2",10);
		animal[2] = new Cat("고양이3","3","3장소","주황");
		animal[3] = new Dog("강아지2","2",15);
		animal[4] = new Cat("고양이5","5","5장소","흰색");
		
		for (Animal ani : animal) {
			ani.speak();
		}
		
		
	}

}
