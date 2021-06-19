package com.github.abueide.ideachialisp.services

import com.github.abueide.ideachialisp.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
