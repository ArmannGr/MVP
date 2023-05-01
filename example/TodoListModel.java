import java.util.ArrayList;
import java.util.List;

public class TodoListModel {
    private List<String> todoList;

    public TodoListModel() {
        this.todoList = new ArrayList<>();
    }

    public void addTodoItem(String item) {
        todoList.add(item);
    }

    public void removeTodoItem(int index) {
        todoList.remove(index);
    }

    public List<String> getTodoList() {
        return todoList;
    }
}
