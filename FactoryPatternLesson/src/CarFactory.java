public class CarFactory {


    static Car create(String type) throws Exception {
        switch (type) {
            case "bmw":
                return new BMW();
            case "audi":
                return new Audi();
            case "mercedes":
                return new Mercedes();
            default:
                throw new Exception("No car like this!");
        }
    }
}
