package Dz3;

public class Ex1 
{
    public static void main(String[] args) 
    {         
        Builder Vasa = new Builder("Vasa", 22, "Malar");
        Vasa.Show();
        Salier Ivan = new Salier("Vasa", 40, 20);
        Ivan.Show();
        Pilot Sasha = new Pilot("Sasha", 40, "a1");
        Sasha.Show();
    }   
}
class Human
{
    String name;    // имя
    int age;        // возраст
    Human(String n, int a)
    {
        name = n;
        age = a;
    }
    void Show()
    {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
class Builder extends Human
{
    String profesional; //професия

  Builder(String n,int a, String p)
  {
       super(n, a);
       profesional = p;
  }
  void Show()
  {
      System.out.printf("Name: %s \tAge: %d Profesional: %s\n", name, age, profesional);
  }
}
class Salier extends Human
{
    int experience; 

    Salier(String n,int a, int e)
  {
       super(n, a);
       experience = e;
  }
  void Show()
  {
      System.out.printf("Name: %s \tAge: %d experience: %d\n", name, age, experience);
  }
}
class Pilot extends Human
{
    String experience; // категория полёта

    Pilot(String n,int a, String e)
  {
       super(n, a);
       experience = e;
  }
  void Show()
  {
      System.out.printf("Name: %s \tAge: %d Category: %s\n", name, age, experience);
  }
}