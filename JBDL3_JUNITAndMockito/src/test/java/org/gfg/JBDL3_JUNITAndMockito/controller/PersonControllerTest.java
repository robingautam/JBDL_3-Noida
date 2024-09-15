package org.gfg.JBDL3_JUNITAndMockito.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest
class PersonControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void createPerson() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/person/create/person"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}