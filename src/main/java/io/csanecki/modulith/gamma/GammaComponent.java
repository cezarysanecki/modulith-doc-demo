package io.csanecki.modulith.gamma;

import io.csanecki.modulith.alfa.AlfaEvent;
import io.csanecki.modulith.epsilon.EpsilonComponent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class GammaComponent {

    private static final String GAMMA = "gamma";

    private final ApplicationEventPublisher applicationEventPublisher;
    private final EpsilonComponent epsilonComponent;

    public GammaComponent(
        ApplicationEventPublisher applicationEventPublisher,
        EpsilonComponent epsilonComponent) {
        this.applicationEventPublisher = applicationEventPublisher;
        this.epsilonComponent = epsilonComponent;
    }

    public void callAll() {
        epsilonComponent.doSomething(GAMMA);
        applicationEventPublisher.publishEvent(new AlfaEvent());
    }

    public void doSomething(String component) {
        System.out.println("calling gamma from " + component);
    }
}
