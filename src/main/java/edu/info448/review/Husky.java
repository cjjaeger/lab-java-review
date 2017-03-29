package edu.info448.review; //package declaration (needed)

public class Husky extends Dog implements Huggable {
  /* class body goes here */
  public Husky(String name){
    super(name);
  }
  public Husky() {
    super();
	}
  public void pullSled(){
    System.out.println("Sled is being pulled");
  }
  public void hug(){
    System.out.println("you got hugged");
  }
  @Override
  public void bark(){
    System.out.println(this+" barks like a Husky!");
  }

}
