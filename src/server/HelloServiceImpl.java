package server;

import socketrpc.IHello;

public class HelloServiceImpl implements IHello {

    @Override
    public String sayHello(String string) {
        return "helloimp:".concat ( string );
    }
}
