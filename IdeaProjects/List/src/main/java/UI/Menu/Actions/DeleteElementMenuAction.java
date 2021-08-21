package UI.Menu.Actions;


import UI.ListView;
import Util.TwoWayList;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeleteElementMenuAction implements MenuAction{

    private final TwoWayList<Integer> list;
    private final ListView listView;

    @Override
    public void doAction() {
       if( listView.deleteElement(list))
           System.out.println("Done");
       else System.out.println("Cannot delete");

    }

    @Override
    public String getName() {
        return "Delete an element by an index";
    }
}
