CREATE TABLE todo_items (
                            id SERIAL PRIMARY KEY,
                            description VARCHAR(255) NOT NULL,
                            due_date DATE NOT NULL,
                            completed BOOLEAN NOT NULL DEFAULT FALSE
);