
public class Max {
	 public static Integer findMaximum(Integer a, Integer b, Integer c){
	        Integer max;
	        max = a;
	        if (b.compareTo(max) == 1)
	            max = b;
	        if (c.compareTo(max) == 1)
	            max = c;
	        return max;
	    }

	    public static void printMaximum(Integer m){
	        System.out.println("Maximum Number is: "+m);
	    }
	    public static Float findMaximumFloat(Float a, Float b, Float c) {
	        Float max;
	        max = a;
	        if (b.compareTo(max) == 1)
	            max = b;
	        if (c.compareTo(max) == 1)
	            max = c;
	        printFloatMaximum(max);
	        return max;
	    }
	    public static void printFloatMaximum(Float m) {
	        System.out.println("Maximum float Number is: " + m);
	    }

public static String findMaximumString(String a, String b, String c) {
    String max;
    max = a;
    if (b.compareTo(max) == 1)
        max = b;
    if (c.compareTo(max) == 1)
        max = c;
    printStringMaximum(max);
    return max;
}


public static void printStringMaximum(String m)
{
    System.out.println("Maximum String is: " + m);
}
}