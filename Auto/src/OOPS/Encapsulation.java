package OOPS;

import java.util.Scanner;

// Encapsulation : Wrapping up of data into a single unit

class user {
				  private int id;
				  private String name;
				  private long contact;
				  user() {
					  
				  }
				  user(int id,String name,long contact) {
					  this.id=id;
					  this.name=name;
					  this.contact=contact;
				  }
				  public void setId(int id) {
					  this.id=id;
				  }
				  public int getId() {
					  return id;
				  }
				  public void setName(String name) {
					  this.name=name;
				  }
				  public String getName() {
					  return name;
				  }
				  public void setContact(long contact) {
					  this.contact=contact;
				  }
				  public long getContact() {
					  return contact;
				  }
				  @Override
				public String toString() {
					return "id : "+id+ ", name : "+name+ ", contact : "+contact;
				}
}

public class Encapsulation {
            public static void main(String[] args) {
		              user u = new user(1,"Sara",758941369);
		  		      user u1 = new user(2,"Sarika",874591369);
		  		      System.out.println(u);
		  		      System.out.println(u1);
		  		      
		  		      Scanner sc = new Scanner(System.in);
		  		      System.out.println("Enter id : ");
		  		      int id = sc.nextInt();
		  		      System.out.println("Enter name : ");
		  		      String name = sc.next();
		  		      System.out.println("Enter contact number : ");
		  		      long contact = sc.nextLong();
		  		      user u2 = new user();
		  		      u2.setId(id);
		  		      u2.setName(name);
		  		      u2.setContact(contact);
		  		      System.out.println(u2.getId());
		  		      System.out.println(u2.getName());
		  		      System.out.println(u2.getContact());
			}
}
