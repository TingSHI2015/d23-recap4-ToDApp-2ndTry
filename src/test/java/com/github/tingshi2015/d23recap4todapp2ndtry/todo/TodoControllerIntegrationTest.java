package com.github.tingshi2015.d23recap4todapp2ndtry.todo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class TodoControllerIntegrationTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    TodoRepository todoRepository;

    @Test
    void getAllTodos_shouldReturnEmptyList_whenRepositoryIsEmpty() throws Exception {
        //GIVEN

        //WHEN
        mockMvc.perform(MockMvcRequestBuilders.get("/api/todo"))

        //THEN
                .andExpect(MockMvcResultMatchers.status().isOk())

                //.andExpect(MockMvcResultMatchers.content().json("[]"));
                .andExpect(MockMvcResultMatchers.content().json("""
                        []
                        """));

                //Test for fail!-----------------
//                .andExpect(MockMvcResultMatchers.content().json("""
//                        [
//                            {
//                            "id": "1"
//                            }
//                        ]
//                        """));

    }

    @DirtiesContext
    @Test
    void getAllTodos_shouldReturnListWithTwoObjects_whenTwoObjectsWereSavedInRepository() {



    }
}



