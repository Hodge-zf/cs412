import java.util.*;
import java.time.*;

public class MergeSortArrayThread{

  public static void main(String[] args){

    Instant separateStartParallel = Instant.now();

    Random random = new Random();

    int n = random.nextInt(100000);

    int[] testArray = random.ints(1000, 1, n).toArray();

    Arrays.parallelSort(testArray);

    Instant separateEndParallel = Instant.now();

    System.out.printf("Parallel ran in: %d%n%n",Duration.between(separateStartParallel, separateEndParallel).toMillis());

//    System.out.printf("%s",Arrays.toString(testArray));

  }
}
