package ru_Nadine_calculator.Service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideNumbersForTest")
    void shouldReturnCorrectResultWhenParamsAreCorrectForSummary(Double num1,Double num2) {
        Double expect = num1+num2;
        Double actual = calculatorService.getSummary(num1,num2);
        assertThat(actual).isEqualTo(expect);
    }
    @ParameterizedTest
    @MethodSource("provideNumbersForTest")
    void shouldReturnCorrectResultWhenParamsAreCorrectForSubtraction(Double num1,Double num2) {
        Double expect = num1-num2;
        Double actual = calculatorService.getSubtraction(num1,num2);
        assertThat(actual).isEqualTo(expect);
    }
    @ParameterizedTest
    @MethodSource("provideNumbersForTest")
    void shouldReturnCorrectResultWhenParamsAreCorrectForMultiplication(Double num1,Double num2) {
        Double expect = num1*num2;
        Double actual = calculatorService.getMultiplication(num1,num2);
        assertThat(actual).isEqualTo(expect);
    }
    private static Stream<Arguments> provideNumbersForTest (){
        return Stream.of(Arguments.of(2.25,8.3),
                Arguments.of(-6.3,4.0),
                Arguments.of(0.0,6.2),
                Arguments.of(6.2,0.0),
                Arguments.of(1000000.3684,200000.0002));
    }
    @ParameterizedTest
    @MethodSource("provideNullParam")
    void shouldThrowExceptionWhenParamsAreNullForSummary(Double num1,Double num2) {
        assertThatExceptionOfType(IllegalArgumentException.class).
                isThrownBy(()->calculatorService.getSummary(num1,num2));
    }
    @ParameterizedTest
    @MethodSource("provideNullParam")
    void shouldThrowExceptionWhenParamsAreNullForSubtraction(Double num1,Double num2) {
        assertThatExceptionOfType(IllegalArgumentException.class).
                isThrownBy(()->calculatorService.getSubtraction(num1,num2));
    }
    @ParameterizedTest
    @MethodSource("provideNullParam")
    void shouldThrowExceptionWhenParamsAreNullForMultiplication(Double num1,Double num2) {
        assertThatExceptionOfType(IllegalArgumentException.class).
                isThrownBy(()->calculatorService.getMultiplication(num1,num2));
    }
    private static Stream<Arguments> provideNullParam (){
        return Stream.of(Arguments.of(null,8.3),
                Arguments.of(-6.3,null),
                Arguments.of(null,null));
    }
    @ParameterizedTest
    @MethodSource("provideNumbersForTestForDivision")
    void shouldReturnCorrectResultWhenParamsAreCorrectForDivision(Double num1,Double num2) {
        Double expect = num1/num2;
        Double actual = calculatorService.getDivision(num1,num2);
        assertThat(actual).isEqualTo(expect);
    }
    private static Stream<Arguments> provideNumbersForTestForDivision (){
        return Stream.of(Arguments.of(2.25,8.3),
                Arguments.of(-6.3,4.0),
                Arguments.of(0.0,6.2),
                Arguments.of(1000000.3684,200000.0002));
    }
    @ParameterizedTest
    @MethodSource("provideNullParamForDivision")
    void shouldThrowExceptionWhenParamsAreNullForDivision(Double num1,Double num2) {
        assertThatExceptionOfType(IllegalArgumentException.class).
                isThrownBy(()->calculatorService.getDivision(num1,num2));
    }
    private static Stream<Arguments> provideNullParamForDivision (){
        return Stream.of(Arguments.of(null,8.3),
                Arguments.of(-6.3,null),
                Arguments.of(null,null),
                Arguments.of(6.2,0.0));
    }
}