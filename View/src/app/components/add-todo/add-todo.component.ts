import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import {TodoService} from '../../services/todo.service';

@Component({
  selector: 'app-add-todo',
  templateUrl: './add-todo.component.html',
  styleUrls: ['./add-todo.component.css']
})
export class AddTodoComponent implements OnInit {
  @Output() addTodo: EventEmitter<any> = new EventEmitter();

  title: string;

  constructor(private todoService: TodoService) { }

  ngOnInit() {
  }

  onSubmit() {
    const todo = {
      title: this.title,
      completed: false
    };
    this.addTodo.emit(todo);
    setTimeout(() => {
      window.location.reload();
    }, 500); // 5000 milliseconds = 5 seconds
  }

}
