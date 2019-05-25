package KarateApiTesting;

import static org.testng.AssertJUnit.assertTrue;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import com.intuit.karate.cucumber.CucumberRunner;
import com.intuit.karate.cucumber.KarateStats;
import com.intuit.karate.junit4.Karate;

import cucumber.api.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
@RunWith(Karate.class)
@CucumberOptions
        (plugin = { "pretty", "html:target/cucumber-html-report","json:target/cucumber-json-report/cucumber-json.json","junit:target/cucumber-junit-report",},

                features = {"src/test/java/KarateApiTesting/KarateApi.feature"})
public class TestRunner {
    @Test
    public void testParallel() {
        String karateOutputPath = "target/cucumber-html-reports";
        KarateStats stats = CucumberRunner.parallel(getClass(), 1, karateOutputPath);
        generateReport(karateOutputPath);
        assertTrue("there are scenario failures", stats.getFailCount() == 0);
    }

    private static void generateReport(String karateOutputPath) {
        Collection<File> jsonFiles = FileUtils.listFiles(new File(karateOutputPath), new String[]{"json"}, true);
        List<String> jsonPaths = new ArrayList (jsonFiles.size());
        for (File file : jsonFiles) {
            jsonPaths.add(file.getAbsolutePath());
        }
        Configuration config = new Configuration(new File("target"), "Hardwareandro.com");
        ReportBuilder reportBuilder = new ReportBuilder(jsonPaths, config);
        reportBuilder.generateReports();
    }
}


