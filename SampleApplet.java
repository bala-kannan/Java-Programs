import java.awt.*;

import java.applet.*;

/*

<applet code = "SampleApplet" width = 300 height = 50>
</applet>

*/

public class SampleApplet extends Applet {

String msg;

public void init() {

  setBackground(Color.cyan);
  setForeground(Color.red);
  msg = "Inside Init";

  }

public void start() {

  msg += "Inside Start";

 }

public void paint(Graphics g) {

  msg += "Inside paint";
  g.drawString(msg, 10, 30);

 }
}  