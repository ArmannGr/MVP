import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.List;

public class TodoListView extends JFrame {
    private JList<TodoItem> todoList;
    private DefaultListModel<TodoItem> listModel;

    public TodoListView() {
        setTitle("Todo List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);

        // Initialize components
        listModel = new DefaultListModel<>();
        todoList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(todoList);
        JButton addButton = new JButton("Add");
        JButton removeButton = new JButton("Remove");

        // Layout components
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPane)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeButton))
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(scrollPane)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(addButton)
                                .addComponent(removeButton))
        );

        // Show window
        setVisible(true);
    }

    public void updateTodoList(List<TodoItem> items) {
        listModel.clear();
        for (TodoItem item : items) {
            listModel.addElement(item);
        }
    }

    public void addTodoItem(TodoItem item) {
        listModel.addElement(item);
    }

    public void removeSelectedTodoItem() {
        int selectedIndex = todoList.getSelectedIndex();
        if (selectedIndex != -1) {
            listModel.remove(selectedIndex);
        }
    }

    public void setAddButtonActionListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void setRemoveButtonActionListener(ActionListener listener) {
        removeButton.addActionListener(listener);
    }
}
