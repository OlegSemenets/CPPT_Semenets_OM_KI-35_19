import KI35.Semenets.Lab3.Printer;

public class App {
    public static void main(String[] args) throws Exception {

        Printer Printer = new Printer(true, 45);
      
        Printer.connectPowerCordConnector();
        Printer.connectUSB();
        Printer.turnOnColoredPrint();
        Printer.turnOnStartButton();
        Printer.putSmthOnTable();
        Printer.Printning();
        Printer.disconnectPowerCordConnector();
        Printer.dispose();
        }
}
