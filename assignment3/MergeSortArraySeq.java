import java.util.*;
import java.time.*;

public class MergeSortArraySeq{

  public static void main(String[] args){

    Instant separateStartSequential = Instant.now();
    
    Random random = new Random();

    int n = random.nextInt(100000);

    int[] testArray = random.ints(1000, 1, n).toArray();



    Arrays.sort(testArray);

    Instant separateEndSequential = Instant.now();

    System.out.printf("Sequential ran in: %d%n%n",Duration.between(separateStartSequential, separateEndSequential).toMillis());

//    System.out.printf("%s",Arrays.toString(testArray));
  }
}
