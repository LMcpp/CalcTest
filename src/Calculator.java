import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

class Calculator {
    private static final Map<String, BiFunction<Integer, Integer, Integer>> operations = new HashMap<>() {{
        put("+", (a, b) -> a + b);
        put("-", (a, b) -> a - b);
        put("*", (a, b) -> a * b);
        put("/", (a, b) -> a / b); //обрабатывать деление на 0 смысла нет, числа >1;
    }};

    public static int calculation (int leftOperand, int rightOperand, String operator){
        BiFunction<Integer, Integer, Integer> operation = operations.get(operator);
        if (operation == null) throw new IllegalArgumentException("Wrong operation");
        return operation.apply(leftOperand, rightOperand);
    }
}
