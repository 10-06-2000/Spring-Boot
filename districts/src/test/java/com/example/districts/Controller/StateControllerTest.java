package com.example.districts.Controller;

import com.example.districts.entity.State;
import com.example.districts.service.StateService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(SpringExtension.class)
@WebMvcTest(StateController.class)
class StateControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StateService mockStateService;

    @Test
    void testGetAllDistricts() throws Exception {
        // Setup
        when(mockStateService.getDistricts()).thenReturn(List.of(new State("state", "district")));

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/api/state/district")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testGetAllDistricts_StateServiceReturnsNoItems() throws Exception {
        // Setup
        when(mockStateService.getDistricts()).thenReturn(Collections.emptyList());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/api/state/district")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("[]");
    }

    @Test
    void testGetDistrictByState() throws Exception {
        // Setup
        when(mockStateService.getDistrictByState("state")).thenReturn(new State("state", "district"));

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/api/state/district/{state}", "state")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }
}
