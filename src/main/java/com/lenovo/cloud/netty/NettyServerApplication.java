package com.lenovo.cloud.netty;

import com.lenovo.cloud.netty.server.NettyServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NettyServerApplication implements CommandLineRunner {

    @Value("${netty.server.port}")
    private int port;

    @Value("${netty.server.uploadPath}")
    private String uploadPath;

    @Override
    public void run(String... args) {
        new NettyServer().run(port, uploadPath);
    }

    public static void main(String[] args) {
        SpringApplication.run(NettyServerApplication.class, args);
    }
}
