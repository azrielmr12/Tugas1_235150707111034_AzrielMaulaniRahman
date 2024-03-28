public class App {
    public static void main(String[] args) {
        Lcd lcd = new Lcd();

        lcd.turnOn();
        lcd.setCable("HDMI");
        lcd.volumeUp();
        lcd.volumeDown();
        lcd.setVolume(51);
        lcd.brightnessUp();
        lcd.brightnessDown();
        lcd.setBrightness(38);
        
        cetakIdentitas();
        System.out.println("---------------------------");
        lcd.cetakInfo();
    }

    public static void cetakIdentitas() {
        System.out.println("Tugas 1 Enkapsulasi");
        System.out.println("Nama: Azriel Maulani Rahman");
        System.out.println("NIM: 235150707111034");
    }
}
