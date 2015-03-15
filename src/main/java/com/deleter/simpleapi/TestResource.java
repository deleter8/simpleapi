package com.deleter.simpleapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.fasterxml.jackson.annotation.JsonProperty;

@Path("resource")
public class TestResource {

    @JsonProperty
    private String thing;

    public TestResource() {
        thing = "value";
    }
}
