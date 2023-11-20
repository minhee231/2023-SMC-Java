 interface Sound {
    public void soundUp();
    public void soundDown();
    public void soundZero();
}

interface Channel
{
    public void channelUp();
    public void channelDown();
    public void channelGo(int ch);
}

class TV implements Sound, Channel
{
    private int ch;
    private int soundlevel;

    public TV()
    {
        this.ch = 0;
        this.soundlevel = 0;
    }

    public void soundUp()
    {
        soundlevel += 1;
        System.out.println("음량을 1높여서 " + soundlevel + "가 되었다." );
    }

    public void soundDown()
    {
        soundlevel -= 1;
        System.out.println("음량을 1줄여서 " + soundlevel + "가 되었다." );
    }

    public void soundZero()
    {
        soundlevel = 0;
        System.out.println("음소거");
    }

    public void channelUp()
    {
        this.ch += 1;
        System.out.println("채널을 1 올려서" + this.ch + "이 되었다.");
    }

    public void channelDown()
    {
        this.ch -= 1;
        System.out.println("채널을 1 내려서" + this.ch + "이 되었다.");
    }

    public void channelGo(int ch)
    {
        this.ch = ch;
        System.out.println(this.ch + "채널로 이동");
    }
}

public class Sound_Channel
{
    public static void main(String[] args) {
        TV tv = new TV();
        tv.channelUp();
    }
}