package io.csanecki.modulith;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;
import org.springframework.modulith.docs.Documenter.DiagramOptions;
import org.springframework.modulith.docs.Documenter.DiagramOptions.DiagramStyle;

@SpringBootTest
class ModulithDocumentationTest {

    ApplicationModules modules = ApplicationModules.of(ModulithDocDemoApplication.class);

    @Test
    void createDocumentation() {
        new Documenter(modules)
            .writeModulesAsPlantUml()
            .writeIndividualModulesAsPlantUml();
    }

    @Test
    void createOldStyleDocumentation() {
        DiagramOptions oldStyleUml = DiagramOptions.defaults()
            .withStyle(DiagramStyle.UML);
        new Documenter(modules)
            .writeModulesAsPlantUml(oldStyleUml)
            .writeIndividualModulesAsPlantUml(oldStyleUml);
    }

}
