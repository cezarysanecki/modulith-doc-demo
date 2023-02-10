package io.csanecki.modulith.dzeta;

import io.csanecki.modulith.epsilon.EpsilonComponent;

public class DzetaComponent {

    private static final String DZETA = "dzeta";

    private final EpsilonComponent epsilonComponent;

    public DzetaComponent(EpsilonComponent epsilonComponent) {
        this.epsilonComponent = epsilonComponent;
    }

    public void callAll() {
        epsilonComponent.doSomething(DZETA);
    }

    public void doSomething(String component) {
        System.out.println("calling dzeta from " + component);
    }
}
