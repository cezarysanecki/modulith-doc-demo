package io.csanecki.modulith.alfa;

import io.csanecki.modulith.beta.BetaComponent;
import io.csanecki.modulith.delta.DeltaComponent;
import io.csanecki.modulith.dzeta.DzetaComponent;

public class AlfaComponent {

    private static final String ALFA = "alfa";

    private final BetaComponent betaComponent;
    private final DeltaComponent deltaComponent;
    private final DzetaComponent dzetaComponent;

    public AlfaComponent(
        BetaComponent betaComponent,
        DeltaComponent deltaComponent,
        DzetaComponent dzetaComponent) {
        this.betaComponent = betaComponent;
        this.deltaComponent = deltaComponent;
        this.dzetaComponent = dzetaComponent;
    }

    public void callAll() {
        betaComponent.doSomething(ALFA);
        deltaComponent.doSomething(ALFA);
        dzetaComponent.doSomething(ALFA);
    }

    public void doSomething(String component) {
        System.out.println("calling alfa from " + component);
    }
}
