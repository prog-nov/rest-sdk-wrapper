package com.paymentcomponents.libraries.rest.sdk.wrapper.integration;

import com.paymentcomponents.libraries.rest.sdk.wrapper.TestConstants;
import com.paymentcomponents.libraries.rest.sdk.wrapper.Constants;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class SepaIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void givenValidSepaMessage_whenSepaValidate_thenReturnSepaAsJson() throws Exception {
        //GIVEN

        //WHEN
        mvc.perform(post("/sepa/validate")
                .content(TestConstants.VALID_SEPA_EPC_PACS_002)
                .contentType(MediaType.APPLICATION_XML))

        //THEN
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json(TestConstants.VALID_JSON_SEPA_EPC_PACS_002))
                .andExpect(header().string(Constants.REQUEST_LOG_ID, Matchers.anything()));

    }

    @Test
    public void givenInValidSepaMessage_whenSepaValidate_thenReturnValidationErrors() throws Exception {
        //GIVEN

        //WHEN
        mvc.perform(post("/sepa/validate")
                .content(TestConstants.INVALID_SEPA_EPC_PACS_002)
                .contentType(MediaType.APPLICATION_XML))

        //THEN
                .andExpect(status().isBadRequest())
                .andExpect(header().string(Constants.REQUEST_LOG_ID, Matchers.anything()))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0]", is("Line: 5 -- cvc-complex-type.2.4.a: Invalid content was found starting with element 'CreDtTm'. One of '{\"urn:iso:std:iso:20022:tech:xsd:pacs.002.001.03\":MsgId}' is expected.")));

    }

}