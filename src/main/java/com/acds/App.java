package com.acds;

import static spark.Spark.get;

/**
 * Hello world!
 *
 */
public class App {
	
	public App() {
		justTest();
	}
	
    public static void main( String[] args ) {
    	new App();
    }
    
    //http://localhost:4567/hello
    //http://localhost:4567/hello/Arek
    private void justTest() {
    	get("/hello", (req, res) -> "Hello World");
    	
    	get("/hello/:name", (request, response) -> {
    	    return "Hello: " + request.params(":name");
    	});
    	
    	
	}
    
}
