package cl.cs.su.rest;

public interface WFMEndpointPaths {
    String ROOT = "rest/wfm";
    interface Hello {
        String HELLO = WFMEndpointPaths.ROOT + "/hello";
    }
}
