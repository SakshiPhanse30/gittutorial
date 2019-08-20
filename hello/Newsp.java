

  class Newsp
{
    int base;
    int height;
Newsp(int x,int y)
{
base=x;
height=y;
}
int area()
{
return(1/2*base*height);
}
}
    class Sp
    {
        public static void main(String []args)
        {
            Newsp area1= new Newsp(10,4);
            int ar1=area1.area();
            System.out.println("Area is = " +ar1);
        }
    }
