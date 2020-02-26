package spring.services;

import spring.iface.*;

public class ConsoleAvalibility implements IConsole {
    @Override
    public String getConsole(){
        return "PC Master Race!";
    };
}
