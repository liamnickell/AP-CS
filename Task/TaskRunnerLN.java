/**
* Program Name:        TaskRunnerLN.java
* Program Purpose:     Runner class for task project
* Date Created:        11/28/2016
* Last Modified:       11/29/2016
*
* @author     Liam Nickell
* @version    1.0.0
*/

public class TaskRunnerLN {

    public static void main(String[] args) {
        
        TaskLN task1 = new TaskLN("Biology homework", "Finish Parkinsons and ion channels research project, finish neurophysiology lab, finish online assignment, and study for test", 8, 8);
        TaskLN task2 = new TaskLN("Chemistry homework", "Finish chemistry worksheet", 3, 1);
        TaskLN task3 = new TaskLN("Precalculus homework", "Finish worksheet and study for quiz", 7, 7);
        TaskLN task4 = new TaskLN("Computer Science homework", "Finish task project and lockable interface", 5, 3);
        TaskLN task5 = new TaskLN("English homework", "Do membean", 0, 0);
        TaskLN task6 = new TaskLN("Latin homework", "Finish research and project", 6, 5);
        TaskLN task7 = new TaskLN("World History homework", "Read textbook and finish Irish notes", 0, 7);
        TaskLN task8 = new TaskLN("Binge Watch Anime", "Spend AT LEAST 4 hours watching some sick animemes (͡° ͜ʖ ͡°)", 10, 0);

        System.out.println(task1.compareTo(task2));
        System.out.println(task2.compareTo(task8));
        System.out.println(task5.compareTo(task7));
        System.out.println(task6.compareTo(task6));
        System.out.println(task3.compareTo(task7));
        System.out.println(task8.compareTo(task1));
        System.out.println(task4.compareTo(task6));
        
    }

}