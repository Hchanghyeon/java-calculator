package org.programmers.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.programmers.java.console.Console;
import org.programmers.java.validator.FormulaCountValidator;
import org.programmers.java.validator.FormulaSplitValidator;
import org.programmers.java.validator.Validator;

import java.util.Arrays;
import java.util.List;


public class ValidaionTest {

    FormulaSplitValidator formulaSplitValidator = new FormulaSplitValidator();
    FormulaCountValidator formulaCountValidator = new FormulaCountValidator();

    @Test
    @DisplayName("연산식 검증: 연산식 분해 검증")
    void formulaSplitValidation(){
        // given
        String inputMsg = "10 + 4 / 20 * 3 - 2";
        List<String> formulaTest = Arrays.asList("10", "+", "4", "/", "20", "*", "3", "-", "2");

        // when
        List<String> formulaList = formulaSplitValidator.validate(inputMsg);

        // then
        Assertions.assertEquals(formulaList, formulaTest);
    }

    @Test
    @DisplayName("연산식 검증: 연산자와 피연산자의 전체 개수 검증 및 위치 검증")
    void checkFormulaValidation(){
        // given
        List<String> formulaList = Arrays.asList("10", "+", "4", "/", "20", "*", "3", "-", "2");

        // when
        Boolean checkedFormulaValidation = formulaCountValidator.validate(formulaList);

        // then
        Assertions.assertEquals(checkedFormulaValidation, true);
    }
}
