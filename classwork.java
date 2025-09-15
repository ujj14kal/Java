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



