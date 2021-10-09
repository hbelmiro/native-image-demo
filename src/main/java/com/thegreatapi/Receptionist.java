package com.thegreatapi;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
class Receptionist {

    String greet(String name) {
        return "Hello dear " + name;
    }
}
