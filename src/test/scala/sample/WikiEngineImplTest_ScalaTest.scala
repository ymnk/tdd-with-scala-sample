/* -*-mode:scala; c-basic-offset:2; indent-tabs-mode:nil -*- */
package sample

import org.scalatest.junit.JUnitSuite
import org.scalatest.junit.ShouldMatchersForJUnit._
import org.junit.{Test, Before}

class WikiEngineImplTest_ScalaTest extends JUnitSuite {
  var target: WikiEngineImpl = _

  @Before
  def setUp = {
    target = new WikiEngineImpl()
  }

  @Test
  def toHtml_HelloWorld = {
    val input = "Hello World"
    val expected = "Hello World"
    val actual = target.toHtml(input)
    actual should be (expected)
  }

  @Test
  def toHtml_TDD_Bootcamp = {
    val input = "TDD Bootcamp"
    val expected = "TDD Bootcamp"
    val actual = target.toHtml(input)
    actual should be (expected)
  }

  @Test
  def implements_WikiEngine = {
    target.isInstanceOf[WikiEngine] should be (true)
  }

  @Test
  def toHtml_null: Unit = {
    intercept[IllegalArgumentException]{ target.toHtml(null) }
  }
}
