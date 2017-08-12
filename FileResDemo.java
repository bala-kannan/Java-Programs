import java.io.*;

class FileResDemo {

public static void main (String args[])  throws java.io.IOException {

int i;

try (FileInputStream fin = new FileInputStream(args[0]); FileOutputStream fout = new FileOutputStream(args[1])) {

do {

i = fin.read();

if (i != -1) fout.write(i);

}
while(i != -1);
}

catch (IOException exc) {

System.out.println("IO Exception" + exc);

 } 

 }
}