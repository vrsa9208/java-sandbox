package com.vrsa9208.frameworks.javalin;

import io.javalin.Javalin;

public class HelloWorld {

	public static void main(String[] args) {
		Javalin app = Javalin.create().start(7000);
		app.get("/", ctx -> ctx.result("Hello World"));

		app.get("/response", ctx -> ctx.json(new Response("OK", "A message")));
	}

}

class Response {
	private String status;
	private String message;

	public Response(String status, String message) {
		this.status = status;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
