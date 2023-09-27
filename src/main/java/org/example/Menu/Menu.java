package org.example.Menu;

import java.util.List;
import java.util.Scanner;

public class Menu implements MenuState{

    protected String name;
    protected List<MenuOption> menuOptions;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        displayMenuOptions();
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        for(MenuOption menuOption: menuOptions){
            if(menuOption.getOptionNumber() == option)
                menuOption.run();
        }


    }
    private void displayMenuOptions(){
        String menuText = name;
        for(MenuOption menuOption: menuOptions){
            menuText = menuText.concat(
                    "\n" + menuOption.getOptionNumber() +
                            ".) " + menuOption.getText()
            );
        }
        System.out.println(menuText);
    }
}
