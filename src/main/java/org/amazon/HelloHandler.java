package org.amazon;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String resp = "this is get response "+Thread.currentThread().getName();
        exchange.sendResponseHeaders(200,resp.length());

        OutputStream outputStream = exchange.getResponseBody();
        outputStream.write(resp.getBytes(StandardCharsets.UTF_8));
        outputStream.flush();
        outputStream.close();

    }
}
