package nazario.liby_templates;

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.psi.PsiDirectory;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class LibyRegistryAction extends CreateFileFromTemplateAction {

    @Override
    protected void buildDialog(Project project, PsiDirectory directory,
                               CreateFileFromTemplateDialog.Builder builder) {
        builder.setTitle("Liby Registry Templates")
               .addKind("Block Registry", LibyPluginIcons.BLOCK_ICON, "LibyBlockRegistry")
               .addKind("Item Registry", LibyPluginIcons.ITEM_ICON, "LibyItemRegistry")
               .addKind("Entity Registry", LibyPluginIcons.ENTITY_ICON, "LibyEntityRegistry");

    }

    @Override
    protected @NlsContexts.Command String getActionName(PsiDirectory directory, @NonNls @NotNull String newName, @NonNls String templateName) {
        return "Create Liby Template: " + newName;
    }
}
