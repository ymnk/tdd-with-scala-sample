/* -*-mode:scala; c-basic-offset:2; indent-tabs-mode:nil -*- */
package sample

trait WikiEngine {
  /**
   * Converting text in Wiki format to html.
   * @param text input text
   * @return converted html
   */ 
  def toHtml(text: String): String
}
