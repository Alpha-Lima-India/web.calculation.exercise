package web.ce.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculation {
    @GetMapping("/calc/sum/{num1}/{num2}")
    public String SumHandler(@PathVariable Integer num1, @PathVariable Integer num2){
        int sum = num2 + num1;
        return num1 + " + " + num2 + " = " + sum;
    }

    @GetMapping("/calc/subtract/{num1}/{num2}")
    public String SubHandler(@PathVariable Integer num1, @PathVariable Integer num2) {
        int subtract = num1 - num2;
        return num1 + " - " + num2 + " = " + subtract;
    }

    @GetMapping("/calc/div/{num1}/{num2}")
    public String DivHandler(@PathVariable Integer num1, @PathVariable Integer num2) {

        double num_1 = num1;
        double num_2 = num2;
        double div = num_1/num_2;
        return num1 + " / " + num2 + " = " + div;
    }

    @GetMapping("/calc/mult/{num1}/{num2}")
    public String MultHandler(@PathVariable Integer num1, @PathVariable Integer num2) {
        int mult  = num1 * num2;
        return num1 + " * " + num2 + " = " + mult;
    }
}
