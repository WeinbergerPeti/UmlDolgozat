package umldolgozat;

import java.util.List;

public class Aranyhal 
{
    private static int KIVANSAGOKSZAMA=3;
    private int kor;
    private List<String> kivansagok;
    private String kifogta;
    
    public Aranyhal(String kifogta)
    {
        this(kifogta, 10);
    }

    public Aranyhal(String kifogta, int kor) 
    {
        this.kor = kor;
        this.kifogta = kifogta;
    }

    public int getKor() 
    {
        return kor;
    }

    public void setKifogta(String kifogta) 
    {
        this.kifogta = kifogta;
    }
    
    public int kivansagokSzama(String kifogta)
    {
        return 0;
    }
    
    public String [] kikkelTalalkozott()
    {
        String [] tomb={""};
        return tomb;
    }
    
    public boolean kivansagotTeljesit(boolean kivansag)
    {
        return false;
    }

    @Override
    public String toString() 
    {
        return "Aranyhal{" + "kor=" + kor + ", kivansagok=" + kivansagok + ", kifogta=" + kifogta + '}';
    }
}
