// final

class ErrMsg {

static final int OUTERR = 0;
static final int INERR = 1;
static final int DISKERR = 2;
static final int UNKERR = 3;

String[] msg = {
"Output Error",
"Input Error",
"Disk Error",
"Unknown Error"};

String getErrMsg(int i) {

if (i >=0 & i < msg.length) 
  return msg[i];
else
  return "Invalid";
 }
}

class ErrMsgDemo {

public static void main(String args[]) {

ErrMsg err = new ErrMsg();

System.out.println(err.getErrMsg(ErrMsg.OUTERR));

 }
}