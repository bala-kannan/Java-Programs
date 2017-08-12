import java.io.*;

class FileDemo {

public static void main (String args[])  throws java.io.IOException {

int i;
FileInputStream fin = null;
FileOutputStream fout = null;

try {

fin = new FileInputStream(args[0]);
fout = new FileOutputStream(args[1]);

do {

i = fin.read();

if (i != -1) fout.write(i);

}
while(i != -1);
}

catch (IOException exc) {

System.out.println("IO Exception" + exc);

} 

finally {

try {

if (fin != null) fin.close();

}

catch (FileNotFoundException exc) {

System.out.println("Input file not found");

}

try {

if (fout != null) fout.close();

}

catch (FileNotFoundException exc) {

System.out.println("Input file not found");

   }
  }
 }
}