package com.codecool.app;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class App 
{
    public static void main( String[] args ) {

        // create a server on port 8000
        HttpServer server = HttpServer.create(new InetSocketAddress(8001), 0);

        // set routes
        server.createContext("/manager", new ManagerControler());
        server.setExecutor(null); // creates a default executor

        // start listening
        server.start();
    }
}
