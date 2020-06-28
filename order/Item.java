// Item class
package  obs;

public class Item 
   implements java.io.Serializable
{

   private String isbn,title;
   private int price;
   private int qty;
   
   //Untuk Item
   public Item(String isbn,String title, int price)
   {
      this.isbn = isbn;
      this.title = title;
      this.price = price;
      this.qty = 1;
   }
   
   public String getIsbn()
   {
      return  isbn;
   }

   public String getTitle()
   {
      return  title;
   }
   public int getQty()
   {
      return  qty;
   }
}
