package com.github.tingshi2015.d23recap4todapp2ndtry.todo;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class TodoServiceUnitTest {

    //-----for the Test 'private final' isn't necessary!!!!
    TodoRepository mockRepository = mock(TodoRepository.class);
    TodoService todoService = new TodoService(mockRepository);




    @Test
    void getAllTodos() {

        //GIVEN
        Todo todo1 = new Todo("id1");
        Todo todo2 = new Todo("id2");
        List<Todo> testData = List.of(todo1,todo2);
        when(mockRepository.findAll()).thenReturn(testData);

        //WHEN
        List<Todo> actual = todoService.getAllTodos();

        //THEN

        //wrong Bracket------ verify(mockTodoRepository.findAll());
        verify(mockRepository).findAll();

        //Test for success!------
        assertEquals(testData, actual);

        //Test for fail!-------
//        List<Todo> expected = List.of(new Todo("1"), new Todo("2"));
//        assertEquals(expected, actual);

    }
}