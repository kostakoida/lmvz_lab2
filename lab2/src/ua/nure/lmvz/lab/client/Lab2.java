package ua.nure.lmvz.lab.client;

import java.util.HashMap;  
import java.util.Map;  
  
import com.smartgwt.client.types.Side;  
import com.smartgwt.client.widgets.layout.HLayout;  
import com.smartgwt.client.widgets.layout.VLayout;  
import com.smartgwt.client.widgets.tab.Tab;  
import com.smartgwt.client.widgets.tab.TabSet;  
import com.smartgwt.client.widgets.form.DynamicForm;  
import com.smartgwt.client.widgets.form.fields.IPickTreeItem;  
import com.smartgwt.client.widgets.form.fields.SelectItem;
import com.smartgwt.client.widgets.tree.Tree;  
import com.smartgwt.client.widgets.tree.TreeNode;  
import com.smartgwt.client.widgets.form.fields.events.ChangeEvent;  
import com.smartgwt.client.widgets.form.fields.events.ChangeHandler;  
import com.google.gwt.core.client.EntryPoint;  
  
public class Lab2 implements EntryPoint {  
  
	private static final TreeNode departmentRoot =  
            new DepertmentTreeNode("Лекарство",  
                    new DepertmentTreeNode("Marketing",  
                            new DepertmentTreeNode("Advertising"),  
                            new DepertmentTreeNode("Community Relations")),  
                    new DepertmentTreeNode("Sales",  
                            new DepertmentTreeNode("Channel Sales", 
                            		new DepertmentTreeNode("Advertising"),  
                                    new DepertmentTreeNode("Community Relations")),  
                            new DepertmentTreeNode("Direct Sales")),  
                    new DepertmentTreeNode("Manufacturing",  
                            new DepertmentTreeNode("Design"),  
                            new DepertmentTreeNode("Development"),  
                            new DepertmentTreeNode("QA")),  
                    new DepertmentTreeNode("Services",  
                            new DepertmentTreeNode("Support"),  
                            new DepertmentTreeNode("Consulting")));  
    public void onModuleLoad() {  
  
        final TabSet topTabSet = new TabSet();  
        topTabSet.setTabBarPosition(Side.TOP);  
        topTabSet.setWidth(700);  
        topTabSet.setHeight100();  
        final DynamicForm form = new DynamicForm();  
        
  /*
        SupplyCategoryXmlDS dataSource = SupplyCategoryXmlDS.getInstance();  
        IPickTreeItem categoryItem = new IPickTreeItem();  
        categoryItem.setTitle("Category");  
        Tree tree = new Tree();
        categoryItem.setDataSource(dataSource);  
        categoryItem.setCanSelectParentItems(true);     
        categoryItem.setValueTree(tree);  
      */
        Tree tree = new Tree();  
        tree.setRoot(departmentRoot);  
  
        IPickTreeItem departmentItem = new IPickTreeItem();  
        departmentItem.setTitle("Department");  
        departmentItem.setValueField("name");  
        departmentItem.setValueTree(tree);  
        Tab tTab1 = new Tab("Дерево");
        form.setItems(departmentItem);
        tTab1.setPane(form);
        
        Tab tTab2 = new Tab("Зависимые комбо-боксы");
        final DynamicForm form2 = new DynamicForm();  
        form2.setWidth(500);  
        form2.setNumCols(4);  
  
        final Map<String, String[]> departments = new HashMap<String, String[]>();  
        departments.put("Marketing", new String[]{"Advertising", "Community Relations"});  
        departments.put("Sales", new String[]{"Channel Sales", "Direct Sales"});  
        departments.put("Manufacturing", new String[]{"Design", "Development", "QA"});  
        departments.put("Services", new String[]{"Support", "Consulting"});  
  
        SelectItem divisionItem2 = new SelectItem();  
        divisionItem2.setName("division");  
        divisionItem2.setTitle("Division");  
        divisionItem2.setValueMap("Marketing", "Sales", "Manufacturing", "Services");  
        divisionItem2.addChangeHandler(new ChangeHandler() {  
            public void onChange(ChangeEvent event) {  
                String selectedItem = (String) event.getValue();  
                form.getField("department2").setValueMap(departments.get(selectedItem));  
            }  
        });  
  
        SelectItem departmentItem2 = new SelectItem();  
        departmentItem2.setName("department2");  
        departmentItem2.setTitle("Department");  
        departmentItem2.setAddUnknownValues(false);  
  
        form2.setItems(divisionItem2, departmentItem2);  
  
        form.draw();  
        tTab2.setPane(form2);
        Tab tTab3 = new Tab("Список");
        Tab tTab4 = new Tab("Таблица");  
        Tab tTab5 = new Tab("Чекбоксы");
  
        topTabSet.addTab(tTab1);  
        topTabSet.addTab(tTab2);  
        topTabSet.addTab(tTab3);  
        topTabSet.addTab(tTab4);  
        topTabSet.addTab(tTab5); 
  
       
        HLayout buttons = new HLayout();  
        buttons.setMembersMargin(15);  
  
       
        VLayout vLayout = new VLayout();  
        vLayout.setMembersMargin(15);  
        vLayout.addMember(topTabSet);  
        vLayout.addMember(buttons);  
        vLayout.setHeight("*");  
  
        vLayout.draw();  
    }  
    public static class DepertmentTreeNode extends TreeNode {  
    	  
        public DepertmentTreeNode(String name) {  
            setName(name);  
        }  
  
        public DepertmentTreeNode(String name, DepertmentTreeNode... children) {  
            setName(name);  
            setChildren(children);  
        }  
    }  
}  
