/* -*-mode:java; c-basic-offset:2; indent-tabs-mode:nil -*- */
package sample

import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.junit.{Test, Before}
import org.junit.Assert._
import org.hamcrest.CoreMatchers._

@RunWith(classOf[JUnit4])
class WikiEngineImplTest_JUnit {

  @Test
  def toHtml_HelloWorld = {
    val target = new WikiEngineImpl()
    val input = "Hello World"
    val expected = "Hello World"
    val actual = target.toHtml(input)
    assertThat(actual, is(expected))
  }
}
