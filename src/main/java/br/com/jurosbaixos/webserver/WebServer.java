package br.com.jurosbaixos.webserver;

import br.com.jurosbaixos.controller.FizzBuzzController;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class WebServer {


    public static void init(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/v1/fizzbuzz", new FizzBuzzController());

        server.setExecutor(null);
        server.start();

    }

}
