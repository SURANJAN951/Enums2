enum Result{
    PASS, FAIL, NR;

    //public static final Result PASS = new Result();
    //public static final Result Fail = new Result();
    //public static final Result NR = new Result();
    // If you reference any enum constant, the corresponding constructor is called.
    int marks;

    Result()
    {
        System.out.println("Constructor in Enum");
    }
    void setMarks(int marks){
        this.marks=marks;
    }
    int getMarks(){
        return marks;
    }
}


public class Enums2 {
    public static void main(String[] args) {

        Result.PASS.setMarks(50);

        int m1 = Result.PASS.getMarks();
        System.out.println(m1);//50

        int m2 = Result.FAIL.getMarks();// Since we haven't set any marks for FAIL,
        // it prints the default value of int, which is 0.
        System.out.println(m2);

        Result.NR.setMarks(45);
        int m3=Result.NR.getMarks();
        System.out.println(m3);

    }
}
