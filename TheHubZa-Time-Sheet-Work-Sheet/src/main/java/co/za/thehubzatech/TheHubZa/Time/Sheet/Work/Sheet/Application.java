package co.za.thehubzatech.TheHubZa.Time.Sheet.Work.Sheet;

import co.za.thehubzatech.TheHubZa.Time.Sheet.Work.Sheet.model.Employee;
import co.za.thehubzatech.TheHubZa.Time.Sheet.Work.Sheet.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee =new Employee();
		employee.setFirstName("Tshitso");
		employee.setLastName("Makunyane");
		employee.setEmail("tmakunyane@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 =new Employee();
		employee1.setFirstName("Molefe");
		employee1.setLastName("Sefatsa");
		employee1.setEmail("molefe.sefatsa@gmail.com");
		employeeRepository.save(employee1);


	}
}
