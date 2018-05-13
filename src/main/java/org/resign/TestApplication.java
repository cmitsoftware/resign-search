package org.resign;

import org.resign.repo.Resource;
import org.resign.repo.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class TestApplication implements CommandLineRunner {

	@Autowired
	private ResourceRepository repository;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of resource
//		repository.save(new Resource("Cerri"));

		// fetch all resource
		System.out.println("Resources found with findAll():");
		System.out.println("-------------------------------");
		for (Resource r : repository.findAll()) {
			System.out.println(r);
		}
		System.out.println();

		// fetch an individual customer
//		System.out.println("Customer found with findByFirstName('Alice'):");
//		System.out.println("--------------------------------");
//		System.out.println(repository.findByFirstName("Alice"));
//		System.out.println();
//
//		System.out.println("Customers found with findByLastName('Smith'):");
//		System.out.println("--------------------------------");
//		for (Customer customer : repository.findByLastName("Smith")) {
//			System.out.println(customer);
//		}
//		System.out.println();
//
//		System.out.println("Customers found with findAll, sorted by firstName desc:");
//		System.out.println("--------------------------------");
//		for (Customer customer : repository.findAll(new Sort(Sort.Direction.DESC, "firstName"))) {
//			System.out.println(customer);
//		}
//		System.out.println();
//
//		System.out.println("Customers found with findAll with paging, sorted by firstName desc:");
//		System.out.println("--------------------------------");
//		Pageable pageableRequest = PageRequest.of(1, 2, Sort.Direction.DESC, "firstName");
//		Page<Customer> pages = repository.findAll(pageableRequest);
//		List<Customer> pagedCustomers = pages.getContent();
//		for (Customer customer : pagedCustomers) {
//			System.out.println(customer);
//		}
//		System.out.println();
//
//		System.out.println("Customers found with findByAccountNumber(12345)");
//		System.out.println("--------------------------------");
//		for (Customer customer : repository.findByAccountNumber(12345)) {
//			System.out.println(customer);
//		}
//		System.out.println();
//
//		//			System.out.println("Customers found with findByAddressLike('cr')");
//		//			System.out.println("--------------------------------");
//		//			for (Customer customer : repository.findByAddressLike("*cr*")) {
//		//				System.out.println(customer);
//		//			}
//		//			System.out.println();
//
//		System.out.println("Customers found with findByAddressRegex('cr')");
//		System.out.println("--------------------------------");
//		for (Customer customer : repository.findByAddressRegex("cr")) {
//			System.out.println(customer);
//		}
//		System.out.println();
//
//		System.out.println("Customers found with findByAddressRegexOrAccountNumberGreater('cr',123)");
//		System.out.println("--------------------------------");
//		//			for (Customer customer : repository.findByAddressRegexOrAccountNumberGreater("cr", 123)) {
//		//				System.out.println(customer);
//		//			}
//		repository.findByAddressRegexOrAccountNumberGreater("cr", 123).forEach(c->System.out.println(c));
//		System.out.println();
//
//		System.out.println("Customers found with streamByAddressRegexOrAccountNumberGreater('cr',123)");
//		System.out.println("--------------------------------");
//		try (Stream<Customer> stream = repository.streamByAddressRegexOrAccountNumberGreater("cr", 123)) {
//			stream.forEach(customer->System.out.println(customer));
//		}
//		System.out.println();

	}

}

