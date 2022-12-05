package del3;

public class Computer implements ComputerOperations {
    private String className;

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public Computer(){
        this.className="Computer";
    }

    @Override
    public void turnOn() {
        System.out.println(getClassName()+"is now turned on");

    }

    @Override
    public void turnOff() {
        System.out.println(getClassName()+"is now turned off");

    }

    @Override
    public void performedDownload() {
        System.out.println((getClassName()+"is now downloaded"));

    }

    @Override
    public void performedUpload() {
        System.out.println(getClassName()+"is now uploaded");

    }

    @Override
    public void playVideo() {
        System.out.println(getClassName()+"play video");

    }

    @Override
    public void playMusic() {
        System.out.println(getClassName()+"Play music");

    }
}
