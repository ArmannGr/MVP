public class Main {
    public static void main(String[] args) {
        TodoListModel model = new TodoListModel();
        TodoListView view = new TodoListView();
        TodoListController controller = new TodoListController(model, view);
    }
}
