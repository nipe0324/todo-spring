package com.example.todo.repository;

import com.example.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    // 完了状態でタスクを検索
    List<Todo> findByCompleted(boolean completed);

    // タイトルにキーワードを含むタスクを検索
    List<Todo> findByTitleContainingIgnoreCase(String keyword);
}
