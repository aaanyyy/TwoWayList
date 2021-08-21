package UI.Menu.Actions;


import UI.ListView;
import Util.TwoWayList;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ShowListMenuAction implements MenuAction{

    private final TwoWayList<Integer> list;
    private final ListView listView;

    @Override
    public void doAction() {
        listView.showList(list);

    }

    @Override
    public String getName() {
        return "Show the list";
    }
}
