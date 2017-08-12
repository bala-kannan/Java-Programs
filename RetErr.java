// Error Return		

class Err {

String msg = "";
int severity = 0;

Err(String m, int s) {

msg = m;
severity = s;
 }
}

class ErrInfo {

String[] msgs = {

 "Input Error",
 "Output Error",
 "Out Of Space",
 "Runtime error"
 };

int[] sev = {3,4,4,2}; 

Err getErrInfo (int i) {

if (i >= 0 & i < msgs.length) 
  return new Err(msgs[i], sev[i]);
else
  return new Err("Invalid Error", 0);
 }
}

class RetErr {

public static void main (String args[]) {

ErrInfo err = new ErrInfo();
Err e;

for (int i=0; i < 4; i++) {

 e = err.getErrInfo(i);
 System.out.println (e.msg + " " + e.severity);
  }
 }
}
