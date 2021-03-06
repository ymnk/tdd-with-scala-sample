/* -*-mode:scala; c-basic-offset:2; indent-tabs-mode:nil -*- */
package sample

object WikiEngineImpl {
  private val pattern = "^(=+) .* (=+)$".r
  private val HEADER_MAX_LEVEL = 6
}
class WikiEngineImpl extends WikiEngine {
  import WikiEngineImpl._

  def toHtml(input: String): String = {
    Option(input).map{
      case input@pattern(start, end) if start.length == end.length && 
                                        start.length <= HEADER_MAX_LEVEL =>
        val level = start.length
        val body = input.substring(level+1, input.length-level-1)
        "<h%d>%s</h%d>".format(level, body, level)
      case input => input
    }getOrElse{
      throw new IllegalArgumentException("input == null");
    }
  }
}
