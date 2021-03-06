package org.asciidoc.intellij.actions.asciidoc;

/**
 * @author Erik Pragt
 */
public class MakeStrikethrough extends FormatAsciiDocAction {
  @Override
  public String getName() {
    return "MakeStrikethrough";
  }

  @Override
  public String updateSelection(String selection) {
    return "[line-through]#" + selection + "#";
  }
}
