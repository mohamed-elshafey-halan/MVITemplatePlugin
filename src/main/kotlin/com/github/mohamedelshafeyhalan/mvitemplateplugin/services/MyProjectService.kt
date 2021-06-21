package com.github.mohamedelshafeyhalan.mvitemplateplugin.services

import com.github.mohamedelshafeyhalan.mvitemplateplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
