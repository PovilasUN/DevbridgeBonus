import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("input.txt");
        Scanner scanner = new Scanner(inputFile);

        while(scanner.hasNextLine()) {
            String data = scanner.nextLine();
            String[] intValue = data.split("[^0-9]");
            for(int i=0;i<intValue.length;i++) {
                if (intValue[i].isEmpty()) {
                    continue;
                } else {
                    if (Integer.parseInt(intValue[i]) >= 10) {
                        System.out.println(data);
                    }
                }
            }
        }
        scanner.close();
    }
}
