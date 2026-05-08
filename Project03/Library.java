package Project03;

import java.util.HashMap;
import java.util.HashSet;

public class Library {
  // HashMap, ArrayList, HashSet
  // HashSet is unique
  HashSet<Object> library = new HashSet<>();
  HashMap<String, Number> members = new HashMap<>();

  public void AddBook(Book book) {
    library.add(book);
  }

  public void AddMember(Member member) {
    members.put(member.name, member.ID);
  }

  public String SearchBookByTitle(String title) {
    for (int i = 0; i < library.size(); i++) {
      
    }
    return "";
  }

  public String SearchBookByAuthor(String author) {
    return "";
  }

  public String SearchBookByISBN(int ISBN) {
    return "";
  }

  public void IssueBook(Member member) {
    members.put(member.name, member.ID);
  }

  public void ReturnBook(Member member) {
    members.put(member.name, member.ID);
  }

  public void ListBorrowedBooks(Member member) {
    members.put(member.name, member.ID);
  }
}
