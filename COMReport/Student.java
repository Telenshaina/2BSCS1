public class Student{
    private String studentNo;
    private String lastName;
    private String firstName;

    //setter

    public void setStudentNo(String studentNo){
        this.studentNo = studentNo;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    //getters
    public String getStudentNo(){
        return studentNo;
    }

    public String getLastName (){
        return lastName;
    }

    public String  getFirstName (){
        return firstName;
    }

    public void setProgramCode(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setProgramCode'");
    }

    public String getProgramCode() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProgramCode'");
    }



}