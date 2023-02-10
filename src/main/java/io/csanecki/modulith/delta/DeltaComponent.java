package io.csanecki.modulith.delta;

import io.csanecki.modulith.gamma.GammaComponent;

public class DeltaComponent {

    private static final String DELTA = "delta";

    private final GammaComponent gammaComponent;

    public DeltaComponent(GammaComponent gammaComponent) {
        this.gammaComponent = gammaComponent;
    }

    public void callAll() {
        gammaComponent.doSomething(DELTA);
    }

    public void doSomething(String component) {
        System.out.println("calling delta from " + component);
    }
}
