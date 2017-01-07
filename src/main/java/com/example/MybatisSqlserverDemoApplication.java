package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@MapperScan("com.example")
public class MybatisSqlserverDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSqlserverDemoApplication.class, args);
	}

	private final TestMapper mapper;

	public MybatisSqlserverDemoApplication(TestMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		Test test = new Test();
		test.setCol2("val1");
		test.setCol3(10);
		mapper.insert(test);
		System.out.println(test.getId());
	}

}
