public class League{

   public void player(String player){
      System.out.println("My favorite player in the league is " + player);
   }
   public void player(String league, String player){
      System.out.println("My favorite " + league + " player is " + " player");
   }
   
   public void coach(String league, String coach){
      System.out.println("My favorite " + league + " coach is " + coach);
   }
   
   public void player(String league, String player, int years){
      System.out.println("My favorite " + league + " player is " + player + " and has been in the league for " + years + " years.");
   
   }
   
   public static void quantity(int a){
      System.out.println("They're more than " + a + " professional sports teams in the world");
   }



}