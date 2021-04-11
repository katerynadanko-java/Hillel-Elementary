package lesson12.funktionalInterfaceHomeWork;

@FunctionalInterface
public interface FunctionHomeWork<U, T> {
    U numberToString(T t);
}
