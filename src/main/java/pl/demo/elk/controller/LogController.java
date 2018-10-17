package pl.demo.elk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogController {

    @GetMapping("/")
    public void logSomething() {
        if (Math.random() > 0.5) {
            log.info("Successful");
        } else if (Math.random() > 0.5) {
            log.warn("Be careful");
        } else {
            log.error("Failure");
        }
    }
}
