//package exercise6;
//
//public class Application {
//
//    public static void main(String[] args) throws IllegalAccessException {
//        Sensor leuven = new TemperatureSensor();
//        leuven.setOn();
//        System.out.println("temperature in Leuven " + leuven.read() + " degrees Celsius");
//        Sensor heverlee = new TemperatureSensor();
//        Sensor kesselLo = new TemperatureSensor();
//
//        AverageSensor regionLeuven = new AverageSensor();
//        regionLeuven.addSensor(leuven);
//        regionLeuven.addSensor(heverlee);
//        regionLeuven.addSensor(kesselLo);
//
//        regionLeuven.setOn();
//        System.out.println("temperature in region Leuven " + regionLeuven.read() + " degrees Celsius");
//    }
//
//
//    }
//
