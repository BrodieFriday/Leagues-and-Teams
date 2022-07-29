class Sports{

   public static void main(String[] args){
   //Leagues
      League NFL = new League();
      League NBA = new League();
      League MLB = new League();
      League MLS = new League();
      League NHL = new League();
      League WNBA = new League();
   //Teams
      Team Bears = new Team();
      Team Chargers = new Team();
      Team Mavericks = new Team();
      Team Hornets = new Team();
      Team Avalanche = new Team();
      Team Sparks = new Team();
      Team Galaxy = new Team();
      Team Ravens = new Team();
      
      NFL.coach("NFL","Andy Reid");
      Bears.player("NFL","Tom Brady");
      NFL.player("NFL","Aaron Rodgers", 7);
      NBA.coach("NBA","Mark Cuban");
      NFL.player("Josh Allen");
      Bears.player("Justin Fields");
      Mavericks.location("Mavericks","Dallas");
      Ravens.ravensLocation("Balitmore");
      
      League.quantity(24);
      Team.income(340);
      
   }

}