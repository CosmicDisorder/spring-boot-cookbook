package persistCustomerForm;
/*
    Combined concepts from accessingDataJPA and handlingFormSubmission with
    Spring Data JDBC stack we used in LC101 unit 3
    Goal is to save a customer to a sql table as simply as possible.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
