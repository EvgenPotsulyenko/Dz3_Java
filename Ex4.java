package Dz3;

public class Ex4
{
    public static void main(String[] args) 
    {  
    kettler ket = new kettler();
    microwave mic = new microwave();
    }
}
class device
{
    String mysic;
    String name;
    String description;

    device(String m, String n,String d)
    {
        mysic = m;
        name = n;
        description = d;
    }
    void Sound()
    {
        System.out.printf("Звук: " + mysic + "\n");
    }
    void Show()
    {
        System.out.printf("Название: " + name + "\n");
    }
    void Desc()
    {
        System.out.printf("Описание: " + description + "\n");
    }
}
class kettler extends device
{
    kettler()
    {
        super("ЗВУК ЧАЙНИКА", "чайник", "описание чайника");
        Sound();
        Show();
        Desc();;
    }
}
class microwave extends device
{
    microwave()
    {
        super("ЗВУК microwave", "microwave", "описание microwave");
        Sound();
        Show();
        Desc();;
    }
}