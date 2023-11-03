package trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Encapsulates complexity of flyweight creation
 */
public class TreeFactory {
  static Map<String, TreeType> treeTypes = new HashMap<>();

  public static TreeType getTreeType(String name, Color color, String otherTreeData) {
    TreeType result = treeTypes.get(name);

    if (null == result) {
      result = new TreeType(name, color, otherTreeData);
      treeTypes.put(name, result);
    }

    return result;
  }
}
