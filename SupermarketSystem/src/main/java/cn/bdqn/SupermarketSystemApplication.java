package cn.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.bdqn.sys.mapper")

@SpringBootApplication
public class SupermarketSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupermarketSystemApplication.class, args);
	}

}

