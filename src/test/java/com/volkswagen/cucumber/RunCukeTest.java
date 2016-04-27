package com.volkswagen.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by ivan.cheung on 4/26/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty"},features="src/test/resources")
public class RunCukeTest {
}