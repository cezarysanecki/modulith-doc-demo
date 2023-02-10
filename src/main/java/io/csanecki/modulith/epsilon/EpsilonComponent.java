package io.csanecki.modulith.epsilon;

import org.springframework.stereotype.Component;

@Component
public class EpsilonComponent {

    public void doSomething(String component) {
        System.out.println("calling epsilon from " + component);
    }
}
