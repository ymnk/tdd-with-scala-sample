/* -*-mode:scala; c-basic-offset:2; indent-tabs-mode:nil -*- */
package sample

import org.scalatest.junit.JUnitSuite
import org.scalatest.junit.ShouldMatchersForJUnit._
import org.junit.{Test, Before}

class WikiEngineImplTest_ScalaTest extends JUnitSuite {

  @Test
  def toHtml_HelloWorld = {
    val target = new WikiEngineImpl()
    val input = "Hello World"
    val expected = "Hello World"
    val actual = target.toHtml(input)
    actual should be (expected)
  }
}
