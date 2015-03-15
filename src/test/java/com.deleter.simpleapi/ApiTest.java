package com.deleter.simpleapi;


import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Application;

public class ApiTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(RestApi.class);
    }

    @Test
    public void test() {
        final String hello = target("v1/resource").request().get(String.class);
        Assert.assertEquals("{\"thing\":\"value\"}", hello);
    }
}