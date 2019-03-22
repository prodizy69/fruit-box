package com.fruitbox.online;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class FruitBoxApplication {

  private final static Logger logger = LoggerFactory.getLogger(FruitBoxApplication.class);

  public static void main(String[] args) throws UnknownHostException {
    SpringApplication app = new SpringApplication(FruitBoxApplication.class);
    Environment env = app.run(args).getEnvironment();
    logger.info(
        "Access URLs:\n----------------------------------------------------------\n\t ***** "
            + "fruit-box-online  ***** \n\n\t" + "Local: \t\thttp://127.0.0.1:{}\n\t",
        env.getProperty("server.port"), InetAddress.getLocalHost().getHostAddress());
  }

}
