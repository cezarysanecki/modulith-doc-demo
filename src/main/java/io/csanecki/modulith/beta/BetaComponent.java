package io.csanecki.modulith.beta;

import io.csanecki.modulith.delta.DeltaComponent;
import org.springframework.stereotype.Component;

@Component
public class BetaComponent {

    private static final String BETA = "beta";

    private final DeltaComponent deltaComponent;

    public BetaComponent(DeltaComponent deltaComponent) {
        this.deltaComponent = deltaComponent;
    }

    public void callAll() {
        deltaComponent.doSomething(BETA);
    }

    public void doSomething(String component) {
        System.out.println("calling beta from " + component);
    }
}
