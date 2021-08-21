package UI.Menu.Actions;


import UI.ListView;
import Util.TwoWayList;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AddToListMenuAction implements MenuAction{

    private final TwoWayList<Integer> list;
    private final ListView listView;

    @Override
    public void doAction() {
        list.add(listView.readValue());

    }

    @Override
    public String getName() {
        return "Add a contact";
    }
}
