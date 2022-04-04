import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

class Student{
    private final int id;
    private final String name;
    private final double cgpa;
    
    public Student(int id,String name,double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getCGPA(){
        return this.cgpa;
    }
}

class Priorities{
    
    public List<Student> getStudents(List<String> events){
        PriorityQueue pq = new PriorityQueue<>(events.size(),new StudentComparator());
        
        for(String event:events){
            String parts[] = event.split(" ");
            if(parts[0].equals("ENTER")){
                String nama = parts[1];
                double nilaiKomulatif = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                Student siswa = new Student(id,nama,nilaiKomulatif);
                pq.add(siswa);
            }else if(parts[0].equals("SERVED")){
                if(!pq.isEmpty()){
                    pq.poll();
                }
            }
        }
        
        List<Student> students = new ArrayList<>();
        while(!pq.isEmpty()) {
            students.add((Student)pq.poll());
        }
        return students;
    }
}

class StudentComparator implements Comparator<Student>{
    
    public int compare(Student s1,Student s2){
        if(s1.getCGPA()==s2.getCGPA()){
            if(s1.getName().equals(s2.getName())){
                return Integer.compare(s2.getID(),s1.getID());
            }else{
                return s1.getName().compareTo(s2.getName());
            }
        }
        return Double.compare(s2.getCGPA(),s1.getCGPA());
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
