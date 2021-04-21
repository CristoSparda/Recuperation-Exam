public class Main {

    public static void main(String[] args) {
        Application application = new Application(SupportedTerminal.INGENICO);

        while(true){
            application.clearScreen();
            application.ShowMenu();

            String key = application.readKey();

            swtch(key){
                case "1":
                    application.doSale();
                    break;
                case "2":
                    application.doRefund();
                    break;
                case "3":
                    application.printReport();
                    break;
                caase "4":
                    application.showConfiguration();
                    break;
            }
        }
    }
}
