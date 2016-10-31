package de.unidue.ltl.lab.example.task;

import org.dkpro.lab.engine.TaskContext;
import org.dkpro.lab.task.impl.DefaultBatchTask;

public class BatchTask 
	extends DefaultBatchTask
{	

    @Override
    public void initialize(TaskContext aContext)
    {
        super.initialize(aContext);
        
        PreprocessingTask preprocessingTask = new PreprocessingTask();
        
        AnalysisTask analysisTask = new AnalysisTask();
        analysisTask.addImport(preprocessingTask, PreprocessingTask.OUTPUT_FOLDER);
        
        addTask(preprocessingTask);
        addTask(analysisTask);
    }
}
