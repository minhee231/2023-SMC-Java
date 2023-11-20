interface Sound {
    public void SoundUp(int level);
    public void SoundDown(int level);
}

class TV implements Sound
{
    private int SndLevel;

    public TV()
    {
        this.SndLevel = 0;
    }

    public void SoundUp(int level)
    {
        SndLevel += level;
        System.out.println("현재볼륨 :" + SndLevel);
    }

    public void SoundDown(int level)
    {
        SndLevel -= level;
        if (SndLevel < 0) SndLevel = 0;
        System.out.println("현재볼륨 :" + SndLevel);
    }
}

class Radio implements Sound
{
    private int SndLevel;

    public Radio()
    {
        this.SndLevel = 0;
    }

    public void SoundUp(int level)
    {
        SndLevel += level;
        System.out.println("현재볼륨 :" + SndLevel);
    }

    public void SoundDown(int level)
    {
        SndLevel -= level;
        if (SndLevel < 0) SndLevel = 0;
        System.out.println("현재볼륨 :" + SndLevel);
    }
}
public class SoundExam
{
    public static void main(String[] args) {
        Sound radio = new Radio();
        Sound tv = new TV();
        radio.SoundUp(5);
        tv.SoundUp(5);
    }    
}