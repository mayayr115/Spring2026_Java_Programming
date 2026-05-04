package Project03;

import java.util.HashSet;

public class Member {
  String name;
  int ID;
  // HashMap

  public Member(String name, int ID){
    this.name = name;
    this.ID = ID;
    HashSet<Book> borrowedBooks = new HashSet<>();
  }
}
