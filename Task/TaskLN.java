/**
* Program Name:        TaskLN.java
* Program Purpose:     TaskLN class blueprint
* Date Created:        11/28/2016
* Last Modified:       11/29/2016
*
* @author     Liam Nickell
* @version    1.0.0
*/

public class TaskLN implements PriorityLN, ComplexityLN, Comparable {

    private String name;
    private String description;
    private int priority; // priority on scale of 0-10
    private int complexity; // complexity on scale of 0-10

    /**
    * Method purpose: Default onstructor for PairOfDiceLN object
    *
    * @return void
    */
    public TaskLN() {
        name = "";
        description = "";
        priority = 0;
        complexity = 0;
    }

    /**
    * Method purpose: Constructor for PairOfDiceLN object
    *
    * @param name         name of task (String)
    * @param description  description of task (String)
    * @param priority     priority of task from 0-10 (int)
    * @param complexity   complexity of task from 0-10 (int)
    *
    * @return void
    */
    public TaskLN(String name, String description, int priority, int complexity) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.complexity = complexity;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getPriority() { return priority; }
    public void setPriority(int priority) { this.priority = priority; }

    public int getComplexity() { return complexity; }
    public void setComplexity(int complexity) { this.complexity = complexity; }

    /**
    * Method purpose: CompareTo method for Task class
    * How Method Compares Tasks: first priority is compared, then complexity, 
    *                            then alphebetically by name (the greater the number for 
    *                            priority and the lower the complexity, the higher it is 
    *                            ranked, i.e. higher priority and less complex tasks come first)
    *
    * @return int (-1, 0, or 1); -1 if task passed as a parameter is ranked above the 
    *         task it is being compared to, 0 if task passed is the same (priority, 
    *         complexity, and name), and 1 if task passed as a parameter is ranked below 
    *         the task it is being compared to
    */
    public int compareTo(Object obj) {
        TaskLN task = (TaskLN) obj;
        if(task.getPriority() > this.priority) {
            return -1;
        } else if(task.getPriority() < this.priority) {
            return 1;
        } else {
            if(task.getComplexity() < this.complexity) {
                return -1;
            } else if(task.getComplexity() > this.complexity) {
                return 1;
            } else {
                if(this.name.compareTo(task.getName()) > 0) {
                    return -1;
                } else if(this.name.compareTo(task.getName()) < 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

}