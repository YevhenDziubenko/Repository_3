public class Calculations {


    public static void main(String[] args) {

        Box mainBox = new Box();
        int volume = calculateVolume(mainBox);
        System.out.println("Box volume: " + volume);

        mainBox.setWidth(60);
        mainBox.setLength(50);
        mainBox.setHeight(70);
        int volume1 = calculateVolume(mainBox);
        System.out.println("Box volume: " + volume1);

    }


    public static int calculateVolume(Box box) {

        return  box.getWidth() * box.getLength() * box.getHeight();

    }








}

















