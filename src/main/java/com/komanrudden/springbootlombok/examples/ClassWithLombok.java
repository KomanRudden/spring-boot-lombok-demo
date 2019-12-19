package com.komanrudden.springbootlombok.examples;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClassWithLombok {
    public String firstName;
    public String surname;

    public void letsDemoLogging() {
        log.info("Logging using the @Slf4j annotation : " + firstName + " " + surname);
    }
}