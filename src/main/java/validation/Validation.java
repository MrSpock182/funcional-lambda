package validation;

import java.util.ArrayList;
import java.util.List;

public class Validation<T> {
    public List<T> filter(List<T> list, NullValidation<T> validation) {
        List<T> ts = new ArrayList<>();
        list.forEach(v -> {
            if(validation.validate(v)) {
                ts.add(v);
            }
        });
        return ts;
    }
}
