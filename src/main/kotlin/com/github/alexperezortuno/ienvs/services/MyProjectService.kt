package com.github.alexperezortuno.ienvs.services

import com.intellij.openapi.project.Project
import com.github.alexperezortuno.ienvs.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
