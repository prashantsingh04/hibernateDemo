package com.practice.hibernateDemo;

import com.github.javafaker.Faker;
import com.practice.hibernateDemo.models.Author;
import com.practice.hibernateDemo.models.Video;
import com.practice.hibernateDemo.repositories.AuthorRepository;
import com.practice.hibernateDemo.repositories.VideoRepository;
import com.practice.hibernateDemo.specification.AuthorSpecification;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

@SpringBootApplication
public class HibernateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository,
			VideoRepository videoRepository
	){
		return  args -> {
//			System.out.println(repository.findAllByFirstNameStartsWithIgnoreCase("a").get(0).getFirstName());

//			for(int i =0; i<50; i++){
//				Faker faker = new Faker();
//				var author = Author.builder()
//						.firstName(faker.name().firstName())
//						.lastName(faker.name().lastName())
//						.age(faker.number().numberBetween(19,50))
//						.email("prashant"+i+"@gmail.com")
//						.build();
//				repository.save(author);
//			}
//			var author = Author.builder()
//					.id(1)
//					.firstName("Prashant")
//					.lastName("Singh")
//					.age(26)
//					.email("prashant@gmail.com")
//					.build();
//			repository.save(author);

//			var video = Video.builder()
//					.name("abc")
//					.length(5)
//					.build();
//			videoRepository.save(video);

//			repository.updateAuthor(15,1);

//			repository.findByNamedQuery(10).forEach(System.out :: println);
//			repository.updateByNamedQuery(12);

//			Specification<Author> spec = Specification
//					.where(AuthorSpecification.hasAge(12))
//					.and(AuthorSpecification.firstNameContains("J"));
//
//			repository.findAll(spec).forEach((System.out :: println));


		};
	}

}
