
import java.io.*;

interface IOAction {

boolean ioActionTest (Reader rdr)throws IOException;

}

class IOActionDemo {

public static void main (String args[]) {

double[] values = {1.0,2.0,3.0,4.0};

IOAction myIOAction = (rdr) -> {

int ch = rdr.read();

//..

return true;

  };
 }
}