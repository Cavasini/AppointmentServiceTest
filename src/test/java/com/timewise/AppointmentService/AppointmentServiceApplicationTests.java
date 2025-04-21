package com.timewise.AppointmentService;

import com.timewise.AppointmentService.controller.AppointmentController;
import com.timewise.AppointmentService.dto.ResponseDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class AppointmentServiceApplicationTests {

    @InjectMocks
    private AppointmentController controller;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testThatEndpoint(){

        String expected = "<200 OK OK,ResponseDTO[message=Deu Bom!],[]>";

        var result = controller.getTest();

        System.out.println(expected);
        System.out.println(result);

        assertNotNull(result);
    }

}
