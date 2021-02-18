package com.pe.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.pe.service.impl.ActionServiceImpl;

@ExtendWith(MockitoExtension.class)
class ActionServiceTest {

    @InjectMocks
    private ActionServiceImpl actionService;

    @Test
    void shouldFindPersonByDocumentNumber() {
        List<String> dataList = actionService.convert();
        assertThat(dataList).isNotNull();
        assertThat(dataList.size()).isPositive();

    }

}
