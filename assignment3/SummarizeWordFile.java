import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.io.PrintStream;
import java.time.*;

public class SummarizeWordFile{

  public static void main(String[] args) throws IOException {

      File inputFile = new File("test.txt");

      PrintStream stdout = System.out;
      PrintStream fileStream = new PrintStream("output.txt");
      System.setOut(fileStream);

      Stream<String> text = Files.lines(inputFile.toPath());

      Instant separateStartParallel = Instant.now();

      text.parallel().forEach(System.out::println);
      text.close();

      Instant separateEndParallel = Instant.now();

      System.setOut(stdout);
      System.out.printf("Parallel ran in: %d%n%n",Duration.between(separateStartParallel, separateEndParallel).toMillis());

  }
}
