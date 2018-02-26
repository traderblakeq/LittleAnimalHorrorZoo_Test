public class Animal{


   //Atributter
   
   private String name;
   private String sound;
   private int x;
   private int y;
   
   
   public Animal(String name){
      this.name = name; 
   }
   
   public void setSound (String sound){
      this.sound = sound;
   }
      public void getSound(){
      System.out.println(sound);
   }

   public void setX(int x){
      this.x = x;
   }
   
   public void setY(int y){
      this.y = y;
   }

   public void tell(){
   System.out.println("I'm the " + name + " and I'm standing on square " + x + ", " + y);
   
   }
  
   
}
