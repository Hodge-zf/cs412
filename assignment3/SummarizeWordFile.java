import java.io.*;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.time.*;

public class SummarizeWordFile{

  public static void main(String[] args) throws IOException {

      File inputFile = new File("test.txt");
      File outputFile = new File("output1.txt");

      PrintStream stdout = System.out;
      PrintStream fileStream = new PrintStream("output2.txt");
      System.setOut(fileStream);

      Instant separateStartSequential = Instant.now();

      FileInputStream inputStream = new FileInputStream(inputFile);
      FileOutputStream outputStream = new FileOutputStream(outputFile);

      int i;

      while ((i = inputStream.read()) != -1) {
        outputStream.write(i);
      }

      inputStream.close();
      outputStream.close();

      Instant separateEndSequential = Instant.now();

      Stream<String> text = Files.lines(inputFile.toPath());

      Instant separateStartParallel = Instant.now();

      text.parallel().forEach(System.out::println);
      text.close();

      Instant separateEndParallel = Instant.now();

      System.setOut(stdout);

      System.out.printf("Sequential ran in: %d%n%n",Duration.between(separateStartSequential, separateEndSequential).toMillis());
      System.out.printf("Parallel ran in: %d%n%n",Duration.between(separateStartParallel, separateEndParallel).toMillis());

  }
}
