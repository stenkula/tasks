package no.ninni.logikk;

import java.math.BigInteger;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import no.ninni.logikk.tasks.LargestPrimeFactorTask;



@RestController
public class Controller {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/largestPrimeFactor")
public String getLargestPrimeFactor(@RequestParam BigInteger param) {
        LargestPrimeFactorTask task = new LargestPrimeFactorTask();
        return String.valueOf(task.getLargestPrimeFactor(param));
    }
    
}
