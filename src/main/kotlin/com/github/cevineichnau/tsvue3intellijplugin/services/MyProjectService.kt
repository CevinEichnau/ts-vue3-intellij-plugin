package com.github.cevineichnau.tsvue3intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.cevineichnau.tsvue3intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
