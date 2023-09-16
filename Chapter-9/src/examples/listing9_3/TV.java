package examples.listing9_3;

public class TV {
    int channel = 1;
    int voulumeLevel = 1;
    boolean on = false;

    public TV () {
    }

    public void turnOn () {
        on = true;
    }

    public void turnOff () {
        on = false;
    }

    public  void setChannel (int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public  void setVoulume (int newVolumeLavel) {
        if (on && newVolumeLavel >= 1 && newVolumeLavel <= 7) {
            voulumeLevel = newVolumeLavel;
        }
    }

    public  void channelUp () {
        if (on && channel < 120 )
            channel++;
    }

    public  void channelDown () {
        if (on && channel > 1)
            channel--;
    }

    public  void volumeUp () {
        if (on && voulumeLevel < 7)
            voulumeLevel++;
    }

    public  void volumeDown () {
        if (on && voulumeLevel > 1)
            voulumeLevel--;
    }
}
