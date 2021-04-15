package exercise3;

 public class program7
{
   public static void main (String [] args)
   {
	   Transaction t = new Transaction ();
	   Thread1 t1 = new Thread1 (t, "Deposit");
	   Thread1 t2 = new Thread1 (t, "Withdrawal");
      t1.start ();
      t2.start ();
   }
}
class Transaction
{
   public static String transName;
   public static double amount;
}
class Thread1 extends Thread
{
   private Transaction t;
   Thread1 (Transaction t, String name)
   {
      super (name);
      this.t = t;
   }
   public void run ()
   {
	   for(int i=0;i<10;i++) {
           if (getName ().equals ("Deposit"))
           {
        	   synchronized (t)
               {
               t.transName = "Deposit";
               t.amount = 50;
               System.out.println (t.transName + " " + t.amount);
               }
           }
           else
           {
        	   synchronized (t)
               {
               t.transName = "Withdrawal";
               t.amount = 100;
               System.out.println (t.transName + " " + t.amount);
               }
           }
	   }
      
   }
}