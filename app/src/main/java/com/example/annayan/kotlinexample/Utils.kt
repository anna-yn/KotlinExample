package com.example.annayan.kotlinexample

import android.widget.TextView
import com.example.annayan.kotlinexample.Job.HR
import com.example.annayan.kotlinexample.Job.SOFTWARE_ENGINEER

fun getContacts(): List<Contact> {
  return listOf(
      Contact(0, "Alice", HR),
      Contact(1, "Bob"),
      Contact(job = SOFTWARE_ENGINEER, id = 2, name = null)
  )
}

// extension functions
// https://kotlinlang.org/docs/reference/extensions.html
fun TextView.addManager(manager: String) {
  text = "${text} ${manager}"
}
