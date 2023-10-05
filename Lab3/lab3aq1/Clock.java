import java.util.Calendar;

class Clock 
{
    public static void main(String args []) 
    {
        Calendar cal = Calendar.getInstance();
        Time clock = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		
		int i = 0;
		double t = System.currentTimeMillis();
        while( i < 60)
            {
                if(t+1000 == System.currentTimeMillis())
                {
                	clock.tick();
                	System.out.println(clock.getSecond());
                	i++;
                	t = System.currentTimeMillis();
                }
            }
           System.out.println(System.currentTimeMillis());
    }

}
