package com.geishatokyo

import org.junit.runner.RunWith
import org.specs._
import org.specs.runner.{ JUnitSuiteRunner, JUnit }

@RunWith(classOf[JUnitSuiteRunner])
class AppTest extends Specification with JUnit{

  "apptest" should{
    "pass test" in{
      true must_== true
    }
  }

}