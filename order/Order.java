// tag::baseClass[]
package tacos.web;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
//end::baseClass[]
import org.springframework.web.bind.annotation.PostMapping;
//tag::baseClass[]
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import tacos.Order;
public class OrderBean implements SessionBean {

  public void ejbActivate() {
  }
  public void ejbRemove()   {}    
  // end of remove

  public void ejbPassivate() {}
  public void setSessionContext(SessionContext ctx) {}

  public void ejbCreate  () throws CreateException {}

}
