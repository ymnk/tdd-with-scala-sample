/* -*-mode:scala; c-basic-offset:2; indent-tabs-mode:nil -*- */
package sample

class WikiEngineImpl extends WikiEngine {
  def toHtml(input: String): String = {
    Option(input).getOrElse{
      throw new IllegalArgumentException("input == null");
    }
  }
}
