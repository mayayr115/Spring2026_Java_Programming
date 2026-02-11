package InClassActivity.Week4;

public class Driver {
  public static void main(String[] args){
    Person person1 = new Person();
    Person person2 = new Person();

    person1.setInfo("Maya", 20, "Binghamton University", "000-000-0000");
    person2.setInfo("Amisha", 19, "Binghamton University", "111-111-1111");

    person1.displayInfo();
    person2.displayInfo();

    person1.introduceFriend(person2);
    person2.introduceFriend(person1);

    Person person3 = new Person();
    person3.changeInfo(person2);
    person3.displayInfo();

    Person person4 = new Person();
    person4.changeInfo(person1);
    person4.displayInfo();
  }
}
