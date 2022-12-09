package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
        
        features = ".\\Features\\addCity.feature",
        glue="addcityStepDefination",
        dryRun=false,
        monochrome=true
        
        )

public class cityRunner {

}