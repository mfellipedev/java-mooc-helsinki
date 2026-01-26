
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

public class ExerciseManagementTest {
    
    @Before
    public void initialize() {
        ExerciseManagement management = new ExerciseManagement();
    }
    
    @Test
    public void exercisesListEmptyAtBeginning() {
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
        
    }
    
    @Test
    public void addingExerciseGrowListByOne() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("Test");
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("Some exercise"));
    }
}
