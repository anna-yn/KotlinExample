package com.example.annayan.kotlinexample

import com.example.annayan.kotlinexample.Job.HR
import com.example.annayan.kotlinexample.Job.SOFTWARE_ENGINEER

enum class Job {
  SOFTWARE_ENGINEER,
  HR
}

// data class does nothing but holding data
// methods like equals()/hashCode() come for free
// https://kotlinlang.org/docs/reference/data-classes.html
data class Contact (
    // put the "val" or "var" keyword in front of the param to make it a property of the class
    val id: Int,
    // question mark means this field can be null
    val name: String?,
    // set a default value to a field, then you don't have to pass anything in for this
    val job: Job = SOFTWARE_ENGINEER,
    val manager: String = when (job) {
      SOFTWARE_ENGINEER -> "Bob"
      HR -> "Adam"
    }
)