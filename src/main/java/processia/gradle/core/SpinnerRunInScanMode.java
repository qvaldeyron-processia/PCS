
package processia.gradle.core;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class SpinnerRunInScanMode extends DefaultTask {

    @TaskAction
    public void generateEnoviaWar() {
        System.out.println("Hello from SpinnerRunComplete");
    }

}