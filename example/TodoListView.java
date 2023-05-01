import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class TodoListView extends JFrame {
    private JList<String> todoList;
    private JButton addButton;
    private JButton removeButton;
    private JTextField todoItemField;

    public TodoListView() {
        setTitle("Todo List");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        todoList = new JList<>();
        JScrollPane scrollPane = new JScrollPane(todoList);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        addButton = new JButton("Add");
        removeButton = new JButton("Remove");
        todoItemField = new JTextField(20);

        buttonPanel.add(todoItemField);
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);

        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public void setTodoList(List<String> list) {
        todoList.setListData(list.toArray(new String[0]));
    }

    public String getTodoItem() {
        return todoItemField.getText();
    }

    public void setAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void setRemoveButtonListener(ActionListener listener) {
        removeButton.addActionListener(listener);
    }

    public int getSelectedIndex() {
        return todoList.getSelectedIndex();
    }
}
