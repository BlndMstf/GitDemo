package studentlist;
import java.util.Scanner;

/**
 * This class +++ Insert class description here +++
 *
 * @author Blend Mustafa
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int a;
        //int[] a1 = new int[5];
        Student[] sList = new Student[5];
        Scanner kb = new Scanner(System.in);
        
        for (int i = 0; i<sList.length; i++){
            System.out.println("Enter Student ID: ");
            int id = kb.nextInt();
            
            System.out.println("Enter Student name: ");
            String name = kb.next();
            
            Student s1 = new Student(id, name);
            sList[i] = s1;
        }
        
        for (Student sList1 : sList) {
            System.out.println(sList1.getStudentID() + sList1.getStudentName());
        }
    }
}
