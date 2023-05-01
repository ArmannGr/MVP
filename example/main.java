public class Main {
    public static void main(String[] args) {
        TodoListModel model = new TodoListModel();
        TodoListView view = new TodoListView();
        TodoListPresenter presenter = new TodoListPresenter(model, view);
    }
}
