package lesson10.service;

import lesson10.exception.WrongValueException;

public class ValidationService {
    public boolean checkValue(int value) throws WrongValueException {

        if (value == 0){
            throw new WrongValueException();
    }
            return value > 0;
    }
}
