package Util;

import UI.ListView;
import UI.Menu.Actions.*;

import UI.Menu.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TwoWayList <Integer>list=new TwoWayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Scanner sc=new Scanner(System.in);
        ListView listView=new ListView(sc);
        List<MenuAction> Actions=new ArrayList<>();
        Actions.add(new AddToListMenuAction(list,listView));
        Actions.add(new DeleteElementMenuAction(list,listView));
        Actions.add(new ShowElementMenuAction(list,listView));
        Actions.add(new ShowListMenuAction(list,listView));
        Actions.add(new ShowListBackwardMenuAction(list,listView));
        Actions.add(new ShowSizeMenuAction(list,listView));
        Actions.add(new ExitMenuAction());

        Menu menu=new Menu(Actions,sc);
        menu.run();

    }
}
