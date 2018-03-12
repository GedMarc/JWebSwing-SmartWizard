# Smart Wizard

Smart Wizard is a flexible and heavily customizable jQuery step wizard plugin with Bootstrap support. 
It is easy to implement and gives a neat and stylish interface for your forms, checkout screen, registration steps etc. 
Based on the feedback from our users over the past years we have come up with the best ever built jQuery wizard plugin of all time

```
SmartWizard sw = new SmartWizard("test");
sw.getSteps()
        .add(new SmartWizardStep(new Div<>().add("Content 1"), new SmartWizardStepItem("Header", new SmallText("Description 1"))));
sw.getSteps()
        .add(new SmartWizardStep(new Div<>().add("Content 2"),
                                 new SmartWizardStepItem("Header 2", new SmallText("Description 2"))));
sw.getSteps()
        .add(new SmartWizardStep(new Div<>().add("Content 3"),
                                 new SmartWizardStepItem("Header 3", new SmallText("Description 3"))));
add(sw);


SmartWizard sw2 = new SmartWizard("testme");
sw2.getFeature()
        .getOptions()
        .setContentCache(true);
sw2.getFeature()
        .getOptions()
        .setCycleSteps(true);
sw2.getFeature()
        .getOptions()
        .getLang()
        .setNext("Next Text");
sw2.getFeature()
        .getOptions()
        .setContentCache(true);

sw2.getFeature()
        .getOptions()
        .setTheme(SmartWizardThemes.Circles);
sw2.getFeature()
        .getOptions()
        .setTransitionEffect(SmartWizardTransitionEffects.slide);

sw2.getSteps()
        .add(new SmartWizardStep(new Div<>().add("Content 1"), new SmartWizardStepItem("Header", new SmallText("Description 1"))));
sw2.getSteps()
        .add(new SmartWizardStep(new Div<>().add("Content 2"),
                                 new SmartWizardStepItem("Header 2", new SmallText("Description 2"))));
sw2.getSteps()
        .add(new SmartWizardStep(new Div<>().add("Content 3"),
                                 new SmartWizardStepItem("Header 3", new SmallText("Description 3"))));

add(sw2);
```

# jwebswing-smart-wizard

smart-wizard

Smart Wizard is a flexible and heavily customizable jQuery step wizard plugin with Bootstrap support. It is easy to implement and gives a neat and stylish interface for your forms, checkout screen, registration steps etc. Based on the feedback from our users over the past years we have come up with the best ever built jQuery wizard plugin of all time, All new Smart Wizard 4. The plugin is been completely rewritten from scratch, made it more powerful, robust, scalable and customizable. We have added a lot of features not limited to Bootstrap support, themes, customizable toolbars, customizable options, public methods, event support and a lot more. See the list of features, demos and documentation for more details. 

http://techlaboratory.net/smartwizard

