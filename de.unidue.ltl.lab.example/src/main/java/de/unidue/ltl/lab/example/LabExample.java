package de.unidue.ltl.lab.example;

import org.dkpro.lab.Lab;
import org.dkpro.lab.task.Dimension;
import org.dkpro.lab.task.ParameterSpace;

import de.unidue.ltl.lab.example.task.BatchTask;

public class LabExample {
	
	public final static String DIM_NUMBER = "number";
	public final static String DIM_CHAR = "character";
	
	public static void main(String[] args) 
		throws Exception
	{
		
        ParameterSpace pSpace = new ParameterSpace(
                Dimension.create(DIM_NUMBER, new Integer[] { 1, 2, 3 }),
                Dimension.create(DIM_CHAR, new String[] { "a", "b", "c" })
        );
        
        BatchTask batch = new BatchTask();
        batch.setParameterSpace(pSpace);
        
        Lab.getInstance().run(batch);
	}
	
}
