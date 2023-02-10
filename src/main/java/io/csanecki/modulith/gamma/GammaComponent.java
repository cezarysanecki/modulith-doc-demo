package io.csanecki.modulith.gamma;

import io.csanecki.modulith.epsilon.EpsilonComponent;
import org.springframework.stereotype.Component;

@Component
public class GammaComponent {

    private static final String GAMMA = "gamma";

    private final EpsilonComponent epsilonComponent;

    public GammaComponent(EpsilonComponent epsilonComponent) {
        this.epsilonComponent = epsilonComponent;
    }

    public void callAll() {
        epsilonComponent.doSomething(GAMMA);
    }

    public void doSomething(String component) {
        System.out.println("calling gamma from " + component);
    }
}
