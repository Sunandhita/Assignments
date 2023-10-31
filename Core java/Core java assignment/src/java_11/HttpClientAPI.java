package java_11;

//Question 6

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientAPI 
{
	public static void main(String args[]) throws IOException, InterruptedException
	{
		String uri="https://httpbin.org/get";
		
		// Build HTTP request object
		HttpRequest req = (HttpRequest) HttpRequest.newBuilder().uri(URI.create(uri)).GET().version(Version.HTTP_2).build();
		
		// Build client
		HttpClient client = HttpClient.newBuilder().build();
		
		// Launch the request
		HttpResponse<String> resp = client.send(req, BodyHandlers.ofString());
		
		// Print response
		System.out.println(resp.headers());
		System.out.println(resp.statusCode());
		System.out.println(resp.body());
	}
}
