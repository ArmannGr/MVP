import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TodoListController {
    private TodoListView view;
    private List<TodoItem> model;

    public TodoListController() {
        view = new TodoListView();
        model = new ArrayList<>();

        // Set action listeners
        view.setAddButtonActionListener(new AddButtonActionListener());
        view.setRemoveButtonActionListener(new RemoveButtonActionListener());

        // Initialize view
        view.updateTodoList(model);
    }

    private class AddButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String title = JOptionPane.showInputDialog(view, "Enter title:");
            if (title != null && !title.isEmpty()) {
                TodoItem item = new TodoItem(title, false);
                model.add(item);
                view.addTodoItem(item);
            }
        }
    }

    private class RemoveButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.removeSelectedTodoItem();
            model.remove(view
        }
    }

    public static void main(String[] args) {
        TodoListController controller = new TodoListController();
    }
}
