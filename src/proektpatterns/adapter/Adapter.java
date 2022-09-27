package proektpatterns.adapter;

public class Adapter {
    public static void main(String[] args) {
        AmericanSocket americanSocket = new SimpleAmericanSocket();
        Radio radio = new Radio();
        EuroSocKet euroSocKet = new SocketAdapter(americanSocket);
        radio.listenMusic(euroSocKet);
    }
}
class SocketAdapter implements EuroSocKet{
    AmericanSocket americanSocket;

    public SocketAdapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }
}
interface EuroSocKet{
    void getPower();
}
interface AmericanSocket{
    void getPower();
}
class SimpleAmericanSocket implements AmericanSocket{
    @Override
    public void getPower() {
        System.out.println("get 110 volt");
    }
}
class Radio{
    public void listenMusic(EuroSocKet euroSocKet){
        euroSocKet.getPower();
    }
}
