package cl.cs.su.core.hello.controller;

import cl.cs.su.core.hello.Default;
import cl.cs.su.core.hello.repository.HelloRepository;


public class DefaultHelloController implements Default {
    HelloRepository service;

    public DefaultHelloController(HelloRepository repo) {
        this.service = repo;
    }

    @Override
    public String geMessage() {
        return service.getHelloMessage();
    }
}
