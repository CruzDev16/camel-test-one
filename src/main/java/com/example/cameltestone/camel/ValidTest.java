package com.example.cameltestone.camel;

import java.io.IOException;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

@Component
public class ValidTest {

	public void setInformation(final Exchange exchange) throws IOException {

		exchange.getIn().setBody("My message for Active MQ");
	}

}
