package cl.cs.su.repository.hello;

import cl.cs.su.core.hello.repository.HelloRepository;

public class DefaultHelloRepository implements HelloRepository {

    @Override
    public String getHelloMessage() {
        return "message from repo";
    }
}
