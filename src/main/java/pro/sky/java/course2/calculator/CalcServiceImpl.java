package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    public int addition(int number1, int number2){
        return number1 + number2;
    }

    public int subtraction(int number1, int number2){
        return number1 - number2;
    }

    public int multiplication(int number1, int number2){
        return number1 * number2;
    }

    public float division(float number1, float number2) {
        return number1 / number2;
    }
}
