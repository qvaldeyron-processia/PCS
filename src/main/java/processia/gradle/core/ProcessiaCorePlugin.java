package processia.gradle.core;




import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class ProcessiaCorePlugin implements Plugin<Project> {

    @Override
    public void apply(Project target) {
    	 // add 
        target.getTasks().create("generateEnoviaWar", GenerateWarTask.class);
    }
}
