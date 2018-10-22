package org.example.greeting

import org.example.greeting.Greeting
import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPluginGroovy implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.tasks.create("helloGreetingPluginGroovyTask",Greeting.class, {Greeting greeting->
            greeting.setGroup('test')
            greeting.setDescription("GreetingPlugin buildsrc groovy")
            greeting.message = 'here is groovy'
            greeting.recipient = 'groovy Hi'
            println("helloGreetingPluginGroovyTask closure")
        })
        project.tasks.create("helloGreetingPluginGroovyTask2",Greeting.class)
    }
}