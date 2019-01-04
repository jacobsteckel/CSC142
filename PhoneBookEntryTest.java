/*
Jacob Steckel
CSC 142
Lab 3
*/
import java.util.ArrayList;

public class PhoneBookEntryTest
{
   public static void main (String[]args)
   {
      ArrayList <PhoneBookEntry> entries = new <PhoneBookEntry> ArrayList();
      
      PhoneBookEntry entry1 = new PhoneBookEntry();
      entry1.setName("Jake");
      entry1.setPhoneNumber(3693515);
      entries.add(entry1);
      
      PhoneBookEntry entry2 = new PhoneBookEntry();
      entry2.setName("Dan");
      entry2.setPhoneNumber(6567890);
      entries.add(entry2);
      
      PhoneBookEntry entry3 = new PhoneBookEntry();
      entry3.setName("James");
      entry3.setPhoneNumber(2163648);
      entries.add(entry3);
      
      PhoneBookEntry entry4 = new PhoneBookEntry();
      entry4.setName("Rick");
      entry4.setPhoneNumber(4602167);
      entries.add(entry4);
      
      PhoneBookEntry entry5 = new PhoneBookEntry();
      entry5.setName("Sean");
      entry5.setPhoneNumber(9774918);
      entries.add(entry5);
      
      System.out.println(entry1.getName()+","+entry1.getPhoneNumber());
      System.out.println(entry2.getName()+","+entry2.getPhoneNumber());
      System.out.println(entry3.getName()+","+entry3.getPhoneNumber());
      System.out.println(entry4.getName()+","+entry4.getPhoneNumber());
      System.out.println(entry5.getName()+","+entry5.getPhoneNumber());
   }
}