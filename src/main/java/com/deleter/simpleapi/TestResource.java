package com.deleter.simpleapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestResource {

    @JsonProperty
    private String thing;

    public TestResource() {
        thing = "value";
    }
}
