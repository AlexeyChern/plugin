package forms;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class act1 extends AnAction {
    public act1() {

        }


    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        form1 frm = new form1(e.getProject(), true);
        frm.show();
    }
}