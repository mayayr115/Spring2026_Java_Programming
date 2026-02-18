package InClassActivity.ICA01;

public class Person {
  public String name;
  public int age;
  public String address;
  public String phoneNumber;

  public void setInfo(String name, int age, String address, String phoneNumber){
    this.name = name;
    this.age = age;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  public void displayInfo(){
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Address: " + address);
      System.out.println("Phone Number: " + phoneNumber + "\n");
  }

  public void introduceFriend(Person person){
    System.out.println("I am " + this.name + ", and this is my friend, " + person.name + ".");
    System.out.println("My friend " + person.name + " is " + person.age + " years old.");
    System.out.println("My friend " + person.name + " lives at " + person.address + ".");
    System.out.println("My friend " + person.name + "'s phone number is " + person.phoneNumber + ".\n");
  }

  public void changeInfo(Person person){
    this.name = person.name;
    this.age = person.age;
    this.address = person.address;
    this.phoneNumber = person.phoneNumber;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public String getAddress(){
    return this.address;
  }

  public String getPhoneNumber(){
    return this.phoneNumber;
  }
}
