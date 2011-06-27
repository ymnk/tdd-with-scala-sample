/* -*-mode:scala; c-basic-offset:2; indent-tabs-mode:nil -*- */
package sample

class WikiEngineImpl extends WikiEngine {
  def toHtml(input: String): String = {
    Option(input).map{ input =>
      if(input.startsWith("= ") && input.endsWith(" ="))
        "<h1>%s</h1>".format(input.substring(2, input.length-2))
      else if(input.startsWith("== ") && input.endsWith(" =="))
        "<h2>%s</h2>".format(input.substring(3, input.length-3))
      else
        input
    }getOrElse{
      throw new IllegalArgumentException("input == null");
    }
  }
}
