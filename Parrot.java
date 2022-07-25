class Parrot extends Bird implements Flyer, Talker {

  String className = "Parrot";
  String name;

  public Parrot(String name) {
    this.name = name;
  }
  
  @Override
  public void fly() {
    System.out.println("The " + this.className + " is flying");
  }

  @Override
  public void talk() {
    System.out.println(this.name + " wants a cracker!");
  }
}