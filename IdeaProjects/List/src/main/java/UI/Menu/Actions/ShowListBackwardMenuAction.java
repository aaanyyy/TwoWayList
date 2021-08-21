package UI.Menu.Actions;


import UI.ListView;
import Util.TwoWayList;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ShowListBackwardMenuAction implements MenuAction{

    private final TwoWayList<Integer> list;
    private final ListView listView;

    @Override
    public void doAction() {
        listView.showListBackwardOrder(list);

    }

    @Override
    public String getName() {
        return "Show the list backward ";
    }
}
