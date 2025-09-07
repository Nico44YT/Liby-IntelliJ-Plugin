package nazario.liby_templates;

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class LibyGenericAction extends CreateFileFromTemplateAction {
    @Override
    protected void buildDialog(@NotNull Project project, @NotNull PsiDirectory directory, CreateFileFromTemplateDialog.@NotNull Builder builder) {
        builder.setTitle("Liby Generic Templates")
                .addKind("Block", LibyPluginIcons.BLOCK_ICON, "Block")
                .addKind("Block Entity", LibyPluginIcons.BLOCK_ENTITY_ICON, "BlockWithEntity")
                .addKind("Item", LibyPluginIcons.ITEM_ICON, "Item")
                .addKind("Entity", LibyPluginIcons.ENTITY_ICON, "Entity");
    }

    @Override
    protected @NlsContexts.Command String getActionName(PsiDirectory directory, @NonNls @NotNull String newName, @NonNls String templateName) {
        return "";
    }

    @Override
    protected PsiFile createFile(String name, String templateName, PsiDirectory dir) {
        if(templateName.equals("BlockWithEntity")) {
            super.createFile(name, "BlockEntity", dir);
        }
        return super.createFile(name, templateName, dir);
    }
}
