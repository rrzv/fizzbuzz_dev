package alfresco.variation.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import alfresco.variation.impl.FizzBuzzImpl;

public class FizzBuzzRestApiTest {

	public FizzBuzzImpl fizzBuzzImpl = new FizzBuzzImpl();
	public static final String RANGE_2_3 = "\"2 alfresco\"";

	@Test
	public void Should_ReturnApplicationJsonMimeType_IfRange2_3() throws ClientProtocolException, IOException {
		String jsonMimeType = "application/json";

		HttpUriRequest request = new HttpGet("http://localhost:8085/buzzdev/rest/fizzbuzz/2-3");
		HttpResponse response = HttpClientBuilder.create().build().execute(request);

		String mimeType = ContentType.getOrDefault(response.getEntity()).getMimeType();
		assertEquals(jsonMimeType, mimeType);
	}
	
	@Test
	public void Should_CallRestAndConvert3ToAlfresco_IfRange2_3() throws ClientProtocolException, IOException {
		HttpUriRequest request = new HttpGet("http://localhost:8085/buzzdev/rest/fizzbuzz/2-3");
		HttpResponse response = HttpClientBuilder.create().build().execute(request);

		 String jsonFromResponse = EntityUtils.toString(response.getEntity());
		 assertEquals(RANGE_2_3, jsonFromResponse);
	}

}
