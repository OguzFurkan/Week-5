import java.util.ArrayList;
import java.util.List;

public class Phone extends Product implements Category{
    private int batterySize;
    private String color;
    private int camera;


    public Phone(int id, double price, String name, String brandName, int ram, int rom, double screenSize, int camera, String color, int batterySize) {
        super(id,name, price, brandName, rom, ram, screenSize);
        this.batterySize=batterySize;
        this.camera=camera;
        this.color=color;
    }
    public static void addCell(){
        List<Phone> phoneList=new ArrayList<>();
        ArrayList<Phone> toBeAddedPhone = new ArrayList<>();
        //toplu marka ekleme
        toBeAddedPhone.add(new Phone(1,4100,"Samsung Galaxy A52","Samsung",6,128,6.1,32,"Beyaz",4000));
        toBeAddedPhone.add(new Phone(2,7399.0,"Iphone 11 64GB","Apple",6,128,6.1,5,"Beyaz",2570));
        toBeAddedPhone.add(new Phone(3,4300.0,"Redmi Note 10 Pro","Xiaomi",4,64,6.5,48,"Siyah",5000));
        toBeAddedPhone.add(new Phone(4,4100,"Samsung Galaxy A53","Samsung",8,128,6.3,64,"Gümüş",4500));
        toBeAddedPhone.add(new Phone(5,4100,"Iphone 14 ProMax","Apple",6,128,6.9,128,"Siyah",4000));

        phoneList.addAll(toBeAddedPhone);

        //markaların ekrana yazılması
        System.out.println("Cep Telefonu Listesi");

        for (Phone phone:phoneList){
            System.out.println("- "+phone.getName()+"- "+phone.getBrandName());
        }

    }


    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    @Override
    public String categoryPrint() {
        return "Cep Telefonları";
    }
}