package br.com.jurosbaixos;

import br.com.jurosbaixos.webserver.WebServer;

import java.io.IOException;
import java.util.logging.Logger;

public class JurosBaixosCodeTestApplication {

    private static final Logger log = Logger.getLogger(JurosBaixosCodeTestApplication.class.getName());

    public static void main(String[] args) {
        try {
            WebServer.init(args);
        } catch (IOException e) {
            log.severe("Was impossible up the webserver: " + e.getMessage());
        }
    }
}
