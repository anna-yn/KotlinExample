package com.example.annayan.kotlinexample

import android.content.Context
import android.util.AttributeSet
import android.view.View

// inheritance https://kotlinlang.org/docs/reference/classes.html
class MyView(context: Context, attrs: AttributeSet) : View(context, attrs) {
  init {
    // View.inflate(...)
    // can use context, attrs here
  }

  override fun onFinishInflate() {
    super.onFinishInflate()
    // to use attrs here, add "val" in front of it in the constructor
  }
}