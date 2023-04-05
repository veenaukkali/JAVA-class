class member
{

//Variables declared inside class is called data member
//to avoid compile time error for not initializing any value we used "static" keyword here


static int i;
static float f;
static String s;
static boolean b;
static double d;



public static void main (String args[])
{
System.out.println(i);
System.out.println(f);
System.out.println(s);
System.out.println(b);
System.out.println(d);

}
}


//*********Output************
//(below outputs are default values for particular data types by java)
//0
//0.0
//null
//false
//0.0