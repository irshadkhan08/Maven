package org.amazon;

import com.mysql.cj.x.protobuf.MysqlxNotice;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class HttpServerDemo {
    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress("localhost",8080),0);

        httpServer.createContext("/b",new HelloHandler());
        httpServer.setExecutor(Executors.newFixedThreadPool(4));
        httpServer.start();

    }
}
