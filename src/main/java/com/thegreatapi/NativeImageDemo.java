package com.thegreatapi;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import javax.inject.Inject;

@QuarkusMain
public class NativeImageDemo implements QuarkusApplication {

    @Inject
    Receptionist receptionist;

    @Override
    public int run(String... args) throws Exception {
        System.out.println(receptionist.greet(args[0]));
        return 0;
    }
}
