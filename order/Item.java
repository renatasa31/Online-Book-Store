//Item
//Book
//class

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
   
   //untuk Memperoleh ISBN
   public String getIsbn()
   {
      return  isbn;
   }
   
   //Untuk memperoleh judul
   public String getTitle()
   {
      return  title;
   }
   
   //Untuk memperoleh jumlah buku
   public int getQty()
   {
      return  qty;
   }
   
   //Untuk memilih jumlah buku
   public void setQty(int qty)
   {   this.qty = qty; }
   
   //Untuk menambahkan jumlah buku
   public void addQty(int qty)
   {   this.qty += qty;  }
   
   //Untuk memperoleh harga
   public int getPrice()
   {
      return  price;
   }
  } 
// end 
//of 
//class
//item
//of
//book




}
