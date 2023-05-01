import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodoListController {
    private TodoListModel model;
    private TodoListView view;

    public TodoListController(TodoListModel model, TodoListView view) {
        this.model = model;
        this.view = view;

        view.setAddButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String todoItem = view.getTodoItem();
                model.addTodoItem(todoItem);
                view.setTodoList(model.getTodoList());
                view.repaint();
            }
        });

        view.setRemoveButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = view.getSelectedIndex();
                if (selectedIndex != -1) {
                    model.removeTodoItem(selectedIndex);
                    view.setTodoList(model.getTodoList());
                    view.repaint();
                }
            }
        });

        view.setTodoList(model.getTodoList());
    }
}
