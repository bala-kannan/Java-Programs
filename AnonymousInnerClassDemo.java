import java.applet.*;

import java.awt.event.*;

/*

<applet code="AnonymousInnerClassDemo" width=200 height=100>
</applet>

*/

public class AnonymousInnerClassDemo extends Applet {

public void init() {

  addMouseListener(new MouseAdapter() {

    public void mouseClicked(MouseEvent me) {
       showStatus ("Mouse Clicked");
    }
  });
 }
}