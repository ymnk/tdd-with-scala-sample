/* -*-mode:java; c-basic-offset:2; indent-tabs-mode:nil -*- */
package sample

import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.{Test, Before}
import org.junit.Assert._
import org.hamcrest.CoreMatchers._

@RunWith(classOf[JUnit4])
class WikiEngineImplTest_JUnit {
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
    assertThat(actual, is(expected))
  }

  @Test
  def toHtml_TDD_Bootcamp = {
    val input = "TDD Bootcamp"
    val expected = "TDD Bootcamp"
    val actual = target.toHtml(input)
    assertThat(actual, is(expected)) 
  }

  @Test
  def implements_WikiEngine = {
    assertTrue(target.isInstanceOf[WikiEngine])
  }

  @Test ( expected = classOf[IllegalArgumentException] )
  def toHtml_null: Unit = {
    target.toHtml(null)
  }

}
