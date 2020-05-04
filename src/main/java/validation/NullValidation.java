package validation;

@FunctionalInterface
public interface NullValidation<T> {
    Boolean validate(T t);
}
