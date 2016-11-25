package pl.a21z.gitwf.foo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FooApp {
  public static void main(String[] args) {
    new SpringApplication(FooApp.class).run(args);
  }
}
