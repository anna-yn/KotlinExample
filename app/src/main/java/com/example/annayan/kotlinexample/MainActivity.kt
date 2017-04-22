package com.example.annayan.kotlinexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.nameText

class MainActivity : AppCompatActivity() {

  // https://kotlinlang.org/docs/reference/delegated-properties.html
  val lateContacts: List<Contact> by lazy {
    getContacts()
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    nameText.text = "kotlin"

    // "it" is the implicit name of a single parameter
    // https://kotlinlang.org/docs/reference/lambdas.html
    val contacts = lateContacts.filter { it.name != null }
        .sortedBy { it.id }
        .map { Pair(it.name, it.manager) }.iterator()

    nameText.setOnClickListener {
      if (!contacts.hasNext()) return@setOnClickListener
      val contact = contacts.next()
      (it as TextView).text = contact.first
      it.addManager(contact.second)
    }
  }

}
