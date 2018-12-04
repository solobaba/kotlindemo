package com.nuturetech.kotlindemo

data class CourseInfo (var courseId: String, val title: String) {
    override fun toString(): String {
        return title
    }
}

data class NoteInfo (var course: CourseInfo? = null, var title: String? = null, var text: String? = null)