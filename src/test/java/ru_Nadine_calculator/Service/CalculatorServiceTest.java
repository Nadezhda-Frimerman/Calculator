//package ru_Nadine_calculator.Service;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import java.util.stream.Stream;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//class CalculatorServiceTest {
//    private final CalculatorService calculatorService = new CalculatorService();
//
//    @ParameterizedTest
//    @MethodSource("provideNumbersForTest")
//    void shouldReturnCorrectResultWenParamsAreCorrectForSummary(Double num1,Double num2) {
//        Double expect = num1+num2;
//        Double actual = calculatorService.getSummary(num1,num2);
//        assertThat(actual).isEqualTo(expect);
//    }
//    private static Stream<Arguments> provideNumbersForTest (){
//        return Stream.of(Arguments.of(2.25,8.3),
//                Arguments.of(-6.3,4.0),
//                Arguments.of(0.0,6.2),
//                Arguments.of(6.2,0.0),
//                Arguments.of(1000000.3684,200000.0002));
//    }
//
//    @Test
//    void getSubtraction() {
//    }
//
//    @Test
//    void getMultiplication() {
//    }
//
//    @Test
//    void getDivision() {
//    }
//}