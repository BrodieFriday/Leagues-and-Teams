class Team extends League{

   @Override
    public void player(String player){
      System.out.println("My favorite teams best player is " + player);
   }
   
   public void location(String team, String location){
      System.out.println("The " + team + " are located in " + location + ".");
   
   }
   
   public void ravensLocation(String location){
      System.out.println("The Ravens are located in " + location);
   }
   
   public static void income(int income){
      System.out.println("Each team makes around $" + income + " million a year!");
   }
    

}