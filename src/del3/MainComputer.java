package del3;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer=new Computer();
        Laptop laptop = new Laptop();
        StationerComputer stationerComputer = new StationerComputer();
        System.out.println(computer.getClassName());
        System.out.println(laptop.getClassName());
        System.out.println( stationerComputer.getClassName());
        laptop.performedDownload();
        stationerComputer.playMusic();
        computer.performedDownload();
        computer.performedUpload();
        computer.playMusic();
        computer.playVideo();
        computer.turnOn();
        computer.turnOff();

    }
}
