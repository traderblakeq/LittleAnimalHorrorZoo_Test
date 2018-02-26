public class LittleAnimalHorrerZoo {

   //Mainmetode
   public static void main(String[] args){
   
   //Opret Animals
   Animal snake = new Animal("Snake");
   Animal rabbit = new Animal("Rabbit");
   
   
   //Skriver ud
   rabbit.setX(2);
   rabbit.setY(2);
   rabbit.tell();
  
   snake.setX(9);
   snake.setY(9);
   snake.tell();
  
   rabbit.setX(3);
   rabbit.setY(3);
   rabbit.tell();
  
   snake.setX(8);
   snake.setY(8);
   snake.tell();
   
   rabbit.setX(4);
   rabbit.setY(4);
   rabbit.tell();
  
   snake.setX(7);
   snake.setY(7);
   snake.tell();
   
   rabbit.setX(5);
   rabbit.setY(5);
   rabbit.tell();
  
   snake.setX(6);
   snake.setY(6);
   snake.tell();
   
   rabbit.setSound("NOOOOOooo Please don't eat me!!");
   rabbit.getSound();
   
   snake.setX(5);
   snake.setY(5);
   snake.tell();
   
   snake.setSound("Ahhrrrrr im eating you ha ha!");
   snake.getSound();
   }
}

