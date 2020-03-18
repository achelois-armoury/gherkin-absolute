package io.github.achelois;

import io.cucumber.testng.CucumberFeatureWrapper;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleEventWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@CucumberOptions(
    tags = "not @ignore",
    strict = true,
    plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/json-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun-reports/rerun.txt"
    },
    features = "src/test/resources/features",
    glue = {"io.github.achelois.stepdefs"})
public class TestRunner {

  private TestNGCucumberRunner testNGCucumberRunner;

  @BeforeClass(alwaysRun = true)
  public void setUpClass() {
    testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
  }

  @DataProvider
  public Object[][] scenarios() {
    return this.testNGCucumberRunner.provideScenarios();
  }

  @Test(
      groups = {"cucumber"},
      description = "Runs Cucumber Scenarios",
      dataProvider = "scenarios"
  )
  public void runScenario(PickleEventWrapper pickleWrapper, CucumberFeatureWrapper featureWrapper) throws Throwable {
    this.testNGCucumberRunner.runScenario(pickleWrapper.getPickleEvent());
  }

  @AfterClass(alwaysRun = true)
  public void tearDownClass() {
    testNGCucumberRunner.finish();
  }
}
