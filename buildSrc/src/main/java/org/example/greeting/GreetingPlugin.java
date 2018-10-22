package org.example.greeting;

import groovy.lang.Closure;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class GreetingPlugin implements Plugin<Project> {
    public void apply(Project project) {
        project.getTasks().create("helloGreetingPluginTask", Greeting.class, (task) -> {
            task.setGroup("test");
            task.setDescription("GreetingPlugin buildsrc java");
            task.setMessage("Hello");
            task.setRecipient("World");
        });
    }
}