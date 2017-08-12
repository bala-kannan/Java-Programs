import java.io.*;

class RWData{ 

public static void main (String args[]) throws java.io.IOException {

int i = 10;

boolean b = true;

double d = 12.34;

try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {

dataOut.writeInt(i);
dataOut.writeBoolean(b);
dataOut.writeDouble(d);
dataOut.writeDouble(12.2 * 13.2);

System.out.println("Write completed");

}
catch (IOException exc) {
System.out.println("Write Error" + exc);
}

try (DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata"))) {

i = dataIn.readInt();
System.out.println(i);
b = dataIn.readBoolean();
System.out.println(b);
d = dataIn.readDouble();
System.out.println(d);
d = dataIn.readDouble();
System.out.println(d);
}

catch (IOException exc) {
System.out.println("Read Error" + exc);
  }
 }
}
