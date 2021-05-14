package com.paymentcomponents.libraries.rest.sdk.wrapper.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paymentcomponents.libraries.rest.sdk.wrapper.exception.InvalidMessageException;
import gr.datamation.swift.translator.cbpr.CbprTranslator;
import gr.datamation.swift.translator.cbpr.exceptions.InvalidMtMessageException;
import gr.datamation.swift.translator.cbpr.exceptions.InvalidMxMessageException;
import org.springframework.stereotype.Service;

@Service
public class CbprTranslatorService {

    public String translateMtToMx(String mtMessage) throws InvalidMessageException, JsonProcessingException {
        try {
            return CbprTranslator.translateMtToMx(mtMessage);
        } catch (InvalidMtMessageException ex) {
            throw new InvalidMessageException(
                    new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(ex.getValidationErrorList()));
        } catch (InvalidMxMessageException ex) {
            throw new InvalidMessageException(
                    new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(ex.getValidationErrorList()));
        } catch (Exception ex) {
            throw new InvalidMessageException(
                    new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString("Message could not be translated"));
        }
    }

    public String translateMxToMt(String mxMessage) throws InvalidMessageException, JsonProcessingException {
        try {
            return CbprTranslator.translateMxToMt(mxMessage);
        } catch (InvalidMxMessageException ex) {
            throw new InvalidMessageException(
                    new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(ex.getValidationErrorList()));
        } catch (InvalidMtMessageException ex) {
            throw new InvalidMessageException(
                    new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(ex.getValidationErrorList()));
        } catch (Exception ex) {
            throw new InvalidMessageException(
                    new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString("Message could not be translated"));
        }
    }

}
