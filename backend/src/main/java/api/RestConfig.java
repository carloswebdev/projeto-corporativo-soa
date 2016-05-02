package api;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("v1")
public class RestConfig extends ResourceConfig {

	public RestConfig()
	{
		// register with Jersey (assumes all Jersey resource classes are in this package or below)
		packages(this.getClass().getPackage().getName());

		// activate Jackson-based JSON support
//		register(JacksonFeature.class);
	}
}
