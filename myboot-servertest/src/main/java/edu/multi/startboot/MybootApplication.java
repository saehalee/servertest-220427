package edu.multi.startboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import product.ProductController;
import product.ProductDAO;
import spring.mybatis.MemberDAO;
import spring.mybatis.MemberMybatisController;
import upload.UploadController;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackageClasses = UploadController.class)
@ComponentScan(basePackageClasses = ProductController.class)
@ComponentScan(basePackageClasses = MemberMybatisController.class)
@MapperScan(basePackageClasses = ProductDAO.class)
@ComponentScan(basePackageClasses = ProductDAO.class)
@MapperScan(basePackageClasses = MemberDAO.class)
@ComponentScan(basePackageClasses = MemberDAO.class)
public class MybootApplication {
	public static void main(String[] args) {
		SpringApplication.run(MybootApplication.class, args);
	}

}
