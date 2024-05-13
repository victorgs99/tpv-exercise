package oop.inheritance;

import oop.inheritance.data.SupportedTpvModels;
import oop.inheritance.ingenico.factory.IngenicoTpvFactory;
import oop.inheritance.tpv.Tpv;
import oop.inheritance.tpv.factory.TpvFactory;

public class Main {

    public static void main(String[] args) {
        TpvFactory tpvFactory = new IngenicoTpvFactory();
        Tpv ingenicoTpv = tpvFactory.create(SupportedTpvModels.INGENICO);
        Application application = new Application(ingenicoTpv);

        while (true) {

            application.clearScreen();
            application.showMenu();

            String key = application.readKey();

            switch (key) {
                case "1" -> application.doSale();
                case "2" -> application.doRefund();
                case "3" -> application.printReport();
                case "4" -> application.showConfiguration();
            }
        }
    }
}
