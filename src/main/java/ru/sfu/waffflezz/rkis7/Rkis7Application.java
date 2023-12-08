package ru.sfu.waffflezz.rkis7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Класс, являющейся точкой входа в программу
 */
@SpringBootApplication
public class Rkis7Application {

	/**
	 * Главный метод, запускается java
	 *
	 * @param args аргументы, которые пробрасываются в приложения через командную строку при запуске
	 */
	public static void main(String[] args) {
		SpringApplication.run(Rkis7Application.class, args);
	}
}
