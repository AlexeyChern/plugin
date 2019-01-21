package forms;

import javax.swing.*;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;
import com.intellij.openapi.project.Project;

public class form1 extends DialogWrapper {

    private JButton pnh;

    private JPanel contentPane;
    private JTextArea textArea1;

    public form1(@Nullable Project project, boolean canBeParent) {
        super(project, canBeParent);
        init();
        setTitle("MyPlugin");
        pnh.addActionListener(e -> {
            textArea1.setText("ганагеча спулфрзе майло");

            });



    }



    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return contentPane;
    }
}
