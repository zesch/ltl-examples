package de.unidue.ltl.lab.example.task;

import java.io.File;

import org.dkpro.lab.engine.TaskContext;
import org.dkpro.lab.storage.StorageService.AccessMode;
import org.dkpro.lab.task.Discriminator;
import org.dkpro.lab.task.impl.ExecutableTaskBase;

public class AnalysisTask 
	extends ExecutableTaskBase
{

	@Discriminator
	private int number;
	
	@Discriminator
	private String character;
		
	public void execute(TaskContext context) throws Exception {
	    File preprocessingFolder = context.getFolder(PreprocessingTask.OUTPUT_FOLDER, AccessMode.READONLY);

	    System.out.println(preprocessingFolder.getAbsolutePath());
		System.out.println(number + " - " + character);
	}
}