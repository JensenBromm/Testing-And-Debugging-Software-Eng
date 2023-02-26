

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        ConvertService binaryService = new ConvertService("10000000");
        System.out.println(binaryService.HexadecimalValue());
    }
}
