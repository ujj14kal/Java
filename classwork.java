//  JAVA CODE FOR PRINTING ALL IN-LINE STRINGS ENTERED

class students {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

// STATIC, LOCAL AND INSTANCE VARIABLES

class stata {
    static int x;
    static int count;

    public void update() {
        x++;
        count++;
    }

    public void show() {
        System.out.println("count=" + count);
        System.out.println("x=" + x);
    }

    // Static Local and instance variables
    public static void main(String arg[]) {
        stata s1 = new stata(); // Object creation
        s1.update();
        stata s2 = new stata();
        s2.update();
        stata s3 = new stata();
        s3.update();
        s1.show();

    }

}

// DIFFERENCE IN COMPULE TIME OVERLOADING AND METHOD OVERLOADING

class Main {
    void show(int a, double num2) {
        System.out.println("Integer: " + num2);
    }

    void show(double a, int num2) {
        System.out.println("Two integer values:" + a + "and" + num2);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.show(10d, 20);

    }
}


//Type promotion  

class typepra
{
    public static void main (String arg[]){
        int x=20;
        byte b = 30;
        byte c = (byte)(x+b); //IN RANGE OF BYTE
        byte d = (byte)(b+120); //OUT OF RANGE OF BYTE
        System.out.println("Value of c: " + c);
        System.out.println("Value of d is:"+d);
        }
}




// CALLING FUNCTION WITHOUT CREATING OBJECT



public class Main {
    static int logic(int x, int y) {
        int z;
        
        if(x>y){
            z=x+y;
        }
        else {
            z= (x+y)*5;
        }
        System.out.println(z);
     return z;
    }
    
public static void main (String args[]) {
    int a = 5;
    int b = 7;
    int c = logic(a,b);
}
}



// CALLING FUNCTION CREATING OBJECT



public class Main {
    public int logic(int x, int y) {
        int z;
        
        if(x>y){
            z=x+y;
        }
        else {
            z= (x+y)*5;
        }
        System.out.println(z);
     return z;
    }
    
public static void main (String args[]) {
    int a = 5;
    int b = 7;
    Main s1 = new Main();
    
    int c = s1.logic(a,b);
}
}




//ACCESS SPECIFIERS

class New {
    private int id=56;
    private String name="Aarush";
    
    public String getName () {
        return name;
    }
}

class Main {
    public static void main (String args[]){

    New s1 = new New ();
    System.out.println(s1.getName ());
    }
    
}



//SINGLETON CLASS


class Student 
{
    private String name;
    private static int count = 0;   
    private static Student instance = null;  

    
    private Student() {
        count++;
    }

    
    private Student(String n) {
        name = n;
        count++;
    }

    
    public static Student getInstance() {
        if (instance == null) {
            instance = new Student();   
        }
        System.out.println("Objects created so far: " + count);
        return instance;
    }
}


class Main {
    public static void main(String[] args) {
        
        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();
        Student s3 = Student.getInstance();
        Student s4 = Student.getInstance();
        Student s5 = Student.getInstance();
    }
}


//STRINGS IN JAVA



//Strings Are IMMUTABLE
class Main 

{   public static void main (String args[]){
    String s="Sachin";
    s=s.concat(" Tendulkar");
    System.out.println(s);}
}



//Same reference for multiple strings

class Main 
{
    public static void main (String args[]) {
        String s1="hi"; 
//For these both s1 and s2 point to same area in heap memory
        String s2="hi";
        
        String s3="hello";
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}


//COMPARING STRINGS

class Main 
{
    public static void main (String args[]){
        String s1="Hello";
        String s2="hello";
        
        System.out.println(s1.equals(s2));  //CaseSensitive Comparison
        System.out.println(s1.equalsIgnoreCase(s2));  // Not CaseSensitive
    }
}


class Main 
{
    public static void main (String args[]){
        String s1="Hello";
        String s2="hello";
        
        System.out.println(s1.compareTo(s2)); //Prints positve if greater, negative if smaller, 0 if equal.
        
    }
}



//2-D ARRAY


class Main 
{
    public static void main (String args[]){
    int [][] marks = new int [2][3];
    
    marks[0][0]=12;
    marks[0][1]=13;
    marks[0][2]=14;
    marks[1][0]=15;
    marks[1][1]=16;
    marks[1][2]=34;
    
    
    
    for (int i=0;i<marks.length;i++){
        for(int j=0;j<marks[i].length;j++){
            System.out.print(marks[i][j]+" ");
        }
        System.out.println("\n");
    }
        
    }
    
}




//ARRAY OF OBJECTS
class Main 
{
    public static void main (String args[])
    {
        Student [] deets = new Student[3];
        
        deets[0]=new Student("Alice",234);
        deets[1]=new Student("Rohit",143);
        deets[2]=new Student("Mohit",345);
        
        for(int i=0;i<deets.length;i++){
            System.out.println("Name: "+deets[i].name+" "+"\nRoll No: "+deets[i].rollno );
            System.out.println("\n");
        }
        
    }
}

class Student 
{
    int rollno;
    String name;


Student (String name, int rollno) {
    this.name=name;
    this.rollno=rollno;}
}