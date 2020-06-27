// Item class
package  obs;
package obs.order;

import javax.ejb.*;
import javax.naming.*;
import javax.sql.*;
import java.sql.*;
import java.util.*;
import obs.*;

public class Item 
   implements java.io.Serializable
{

   private String isbn,title;
   private int price;
   private int qty;

}
