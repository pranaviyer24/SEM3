class Time
{
  private int h,m,s;
  Time()
  {
    h=0;
    m=0;
    s=0;
  }
  
  Time(int H,int M,int S)
  {
   h=H;
   m=M;
   s=S;
  }
  
  Time(Time t)
  {
   h=t.h;
   m=t.m;
   s=t.s;
  }
  
  void display()
  {
    System.out.println(h+"hrs "+m+"mins "+s+"seconds");
  }
}

class TimeConstructor
{
  public static void main(String args[])
  {
    Time t1=new Time();
    t1.display();
    Time t2=new Time(1,30,30);
    t2.display();
    Time t3=new Time(t2);
    t3.display();
  }
}
