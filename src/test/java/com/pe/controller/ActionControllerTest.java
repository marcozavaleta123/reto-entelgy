package com.pe.controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActionControllerTest {

    @Autowired
    ActionController actionController;

    @Test
    void shouldFindAllEmployees() {
        Map<String, Object> data = actionController.convert();
        assertThat(data).isNotNull();
        
        List<String> list = (List<String>) data.get("data");
        assertThat(list.size()).isPositive();
    }

}
