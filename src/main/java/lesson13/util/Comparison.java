package lesson13.util;

import lesson13.entity.Dog;

public class Comparison {

    public static int compareByAge(Dog dog1, Dog dog2) {
        return dog1.getAge().compareTo(dog2.getAge());
    }

    public int compareByName(Dog dog1, Dog dog2) {
        return dog1.getName().compareTo(dog2.getName());
    }
}