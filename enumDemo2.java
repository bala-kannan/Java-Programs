enum DayOfWeek {

SUNDAY(10), MONDAY(20), TUESDAY(30), WEDNESDAY(40), THURSDAY(50), FRIDAY(60), SATURDAY(70);

int value;

private DayOfWeek(int v) { value = v;}

public int getValue() { return value;}

}

class enumDemo2 {

public static void main(String[] args) {


for (DayOfWeek d: DayOfWeek.values())

  System.out.println("value of " + d + " is " + d.getValue() + " ordinal is:" + d.ordinal());


DayOfWeek dw = DayOfWeek.SUNDAY;

DayOfWeek dw1 = DayOfWeek.MONDAY;

if (dw.compareTo(dw1) > 0) System.out.println (dw + ">" + dw1);

else if (dw.compareTo(dw1) < 0) System.out.println(dw + "<" + dw1);

else System.out.println(dw + "==" + dw1);

switch(dw) {

case SUNDAY: System.out.println("Sunday"); break;

}

//System.out.println(dw.ordinal());

 }
}