public class QueueFullException extends Exception {

int size;

QueueFullException(int s) {size = s;}

public String toString() {

return "Queue Max Reached. Max Size is:" + size;

 }
}