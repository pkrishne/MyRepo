package com.rest;

import org.glassfish.jersey.server.ResourceConfig;

public class JerseyResourceInitializer extends ResourceConfig {

	public JerseyResourceInitializer() {
		packages(true, "com.rest");
	}

}
