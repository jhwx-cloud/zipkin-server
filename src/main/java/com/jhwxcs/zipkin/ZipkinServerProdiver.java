package com.jhwxcs.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@EnableZipkinServer //表示Zipkin是服务器
@SpringBootApplication
public class ZipkinServerProdiver {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerProdiver.class,args);
    }
}

