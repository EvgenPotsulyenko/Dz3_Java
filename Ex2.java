package Dz3;

public class Ex2 
{
    public static void main(String[] args) 
    {         
        Tiger Vasa = new Tiger("Vasa", 8, "Wild");
        Vasa.Show();
        Crocodile Gena = new Crocodile("Gena", 6, 120);
        Gena.Show();
        Kengyry ken = new Kengyry("Ken", 6, "Orange");
        ken.Show();
    }   
}
class Animal
{
    String name;    // имя
    int age;        // возраст
    Animal(String n, int a)
    {
        name = n;
        age = a;
    }
    void Show()
    {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
class Tiger extends Animal
{
    String WildOrNo; 

    Tiger(String n,int a, String p)
  {
       super(n, a);
       WildOrNo = p;
  }
  void Show()
  {
      System.out.printf("Name: %s \tAge: %d WildOrNo: %s\n", name, age, WildOrNo);
  }
}
class Crocodile extends Animal
{
    int size; 

    Crocodile(String n,int a, int p)
   { 
       super(n, a);
       size = p;
   }
  void Show()
  {
      System.out.printf("Name: %s \tAge: %d size: %d\n", name, age, size);
  }
}
class Kengyry extends Animal
{
    String Colour; 

    Kengyry(String n,int a, String p)
  {
       super(n, a);
       Colour = p;
  }
  void Show()
  {
      System.out.printf("Name: %s \tAge: %d Colour: %s\n", name, age, Colour);
  }
}