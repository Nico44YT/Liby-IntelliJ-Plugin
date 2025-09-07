package nazario.liby_templates;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public interface LibyPluginIcons {
    Icon LIBY_ICON = IconLoader.getIcon("/icons/liby_icon.svg", LibyPluginIcons.class);
    Icon BLOCK_ICON = IconLoader.getIcon("/icons/cube.svg", LibyPluginIcons.class);
    Icon BLOCK_ENTITY_ICON = IconLoader.getIcon("/icons/blockentity.svg", LibyPluginIcons.class);
    Icon ENTITY_ICON = IconLoader.getIcon("/icons/entity.svg", LibyPluginIcons.class);
    Icon ITEM_ICON = IconLoader.getIcon("/icons/item.png", LibyPluginIcons.class);

    static void update() {

    }
}
