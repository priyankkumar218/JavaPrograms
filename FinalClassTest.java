final class StudentFC
{ 
    final String name; 
    final int regNo; 
  
    public StudentFC(String name, int regNo) 
    { 
        this.name = name; 
        this.regNo = regNo; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public int getRegNo() 
    { 
        return regNo; 
    } 
} 
  
// Driver class 
class FinalClassTest
{ 
    public static void main(String args[]) 
    { 
        StudentFC s = new StudentFC("ABC", 101); 
        System.out.println(s.name); 
        System.out.println(s.regNo); 
  
        // Uncommenting below line causes error 
        // s.regNo = 102; 
    } 
} 