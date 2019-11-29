package com.spartaglobal.BbcTests;

import static org.junit.Assert.assertTrue;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Unit test for simple App.
 */


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin ={"pretty"},
            features = "classpath:features",
            glue = "com.spartaglobal.StepDefs"

            )

    public class CucumberTestRunner
    { }
