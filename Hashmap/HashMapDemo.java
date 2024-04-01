import java.util.*;
public class HashMapDemo {

    public static void main(String[] args){

        HashMap<String, Student> studentMap = new HashMap<String, Student>();

        Student stud1 = new Student();
        stud1.setStudentNo("1234");
        stud1.setLastName("Dela Cruz");
        stud1.setFirstName("Juan");
        stud1.setProgramCode("BSCS");

        Student stud2 = new Student();
        stud2.setStudentNo("5678");
        stud2.setLastName("Santos");
        stud2.setFirstName("Maria");
        stud2.setProgramCode("BSIT");

        Student stud3 = new Student();
        stud3.setStudentNo("3675");
        stud3.setLastName("Telen");
        stud3.setFirstName("Faye");
        stud3.setProgramCode("BSCS");

        

        //use studNo(unique value ) as the key to the hashmap
        studentMap.put(stud1.getStudentNo(),stud1);
        studentMap.put(stud2.getStudentNo(),stud2);
        studentMap.put(stud3.getStudentNo(),stud3);

        //extract its value 

        for (Map.Entry < String, Student> entryMap: studentMap.entrySet()){
            System.out.println("Student number is " + entryMap.getValue().getStudentNo());
            System.out.println("Name is  "+ entryMap.getValue().getLastName() + entryMap.getValue().getFirstName());
            System.out.println("Program is "+ entryMap.getValue().getProgramCode());
        }
    }
}