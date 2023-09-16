package examples.listing9_3;

public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVoulume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();


        System.out.println("tv1's channel is " + tv1.channel + " and tv1 volume is " + tv1.voulumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and tv2 volume is " + tv2.voulumeLevel);

    }
}
