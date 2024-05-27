import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Errologg {
    private static final Logger logger = Logger.getLogger(Errologg.class.getName());
    private static final Path LOG_DIR = Paths.get(System.getProperty("user.home"), "Documents", "logs");
    private static final Path LOG_FILE = LOG_DIR.resolve("error.log");
    private static final Path TARGET_DIR = Paths.get(System.getProperty("user.home"), "Documents", "Logerro"); 
    
    // Lembrando que ele vai pros "Documentos", e la vai criar uma pasta "Logs", e lá tera um arquivo em txt que pode ser aberto no bloco de notas!

    public static void main(String[] args) {
        configureLogger();

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(TARGET_DIR)) {
            for (Path entry : stream) {
                try {
                    processFile(entry);
                } catch (Exception e) {
                    logger.log(Level.SEVERE, "An error occurred while processing file: " + entry.getFileName(), e);
                }
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to read directory: " + TARGET_DIR, e);
        }

        System.out.println("Program continues...");
    }

    private static void configureLogger() {
        try {
            Files.createDirectories(LOG_DIR);

            FileHandler fileHandler = new FileHandler(LOG_FILE.toString(), true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            System.err.println("Failed to set up logger: " + e.getMessage());
        }
    }

    private static void processFile(Path file) throws Exception {
        
        // Simular alguma excecão para demonstração!
        if (file.getFileName().toString().contains("error")) {
            throw new Exception("Simulated exception for file: " + file.getFileName());
        }
        
        // Caso queira adicionar o processamento real do arquivo:
        System.out.println("Processing file: " + file.getFileName());
    }
}
