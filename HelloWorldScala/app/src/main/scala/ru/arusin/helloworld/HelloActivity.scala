package ru.arusin.helloworld

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ArrayBuffer

class HelloActivity extends Activity {
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_hello)
    val scalaTextView = findViewById(R.id.scala_text_view).asInstanceOf[TextView]
    scalaTextView.setText(new HelloJava().hello())
  }
}

trait Animal
private class Dog extends Animal
private class Cat extends Animal

object Animal {
  def apply(kind: String) = kind match {
    case "dog" => new Dog()
    case "cat" => new Cat()
  }
}