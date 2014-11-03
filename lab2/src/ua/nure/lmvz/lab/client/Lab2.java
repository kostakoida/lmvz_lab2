package ua.nure.lmvz.lab.client;

import java.util.HashMap;  
import java.util.LinkedHashMap;
import java.util.Map;  
  







import com.smartgwt.client.widgets.layout.VStack; 
import com.smartgwt.client.data.Record;
import com.smartgwt.client.types.Side;  
import com.smartgwt.client.widgets.layout.HLayout;  
import com.smartgwt.client.widgets.layout.VLayout;  
import com.smartgwt.client.widgets.tab.Tab;  
import com.smartgwt.client.widgets.tab.TabSet;  
import com.smartgwt.client.widgets.form.DynamicForm;  
import com.smartgwt.client.widgets.form.fields.IPickTreeItem;  
import com.smartgwt.client.widgets.form.fields.RadioGroupItem;
import com.smartgwt.client.widgets.form.fields.SelectItem;
import com.smartgwt.client.widgets.tree.Tree;  
import com.smartgwt.client.widgets.tree.TreeNode;  
import com.smartgwt.client.widgets.form.fields.events.ChangeEvent;  
import com.smartgwt.client.widgets.form.fields.events.ChangeHandler;  
import com.google.gwt.core.client.EntryPoint;  
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.types.Alignment;  
import com.smartgwt.client.types.ListGridFieldType;  
import com.smartgwt.client.util.BooleanCallback;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.BaseWidget;
import com.smartgwt.client.widgets.Canvas;  
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.form.DynamicForm;  
import com.smartgwt.client.widgets.form.fields.CheckboxItem;  
import com.smartgwt.client.widgets.form.fields.events.ChangeEvent;  
import com.smartgwt.client.widgets.form.fields.events.ChangeHandler;  
import com.smartgwt.client.widgets.grid.ListGrid;  
import com.smartgwt.client.widgets.grid.ListGridField;  
import com.smartgwt.client.widgets.layout.VLayout;  
import com.smartgwt.client.widgets.grid.ListGridRecord;  
import com.smartgwt.client.widgets.grid.events.CellClickEvent;  
import com.smartgwt.client.widgets.grid.events.CellClickHandler;  
import com.smartgwt.client.widgets.grid.events.CellContextClickEvent;  
import com.smartgwt.client.widgets.grid.events.CellContextClickHandler;  
import com.smartgwt.client.widgets.grid.events.CellDoubleClickEvent;  
import com.smartgwt.client.widgets.grid.events.CellDoubleClickHandler;  
import com.smartgwt.client.widgets.form.fields.events.ChangedEvent;  
import com.smartgwt.client.widgets.form.fields.events.ChangedHandler; 

import ua.nure.lmvz.lab.client.CountrySampleData;  

  
public class Lab2 implements EntryPoint {  
	int field = 1;
	String selectedItem = new String();
	private static final TreeNode departmentRoot =  
            new DepertmentTreeNode("try",  
                    new DepertmentTreeNode("Антисептические лекарственные средства",  
                            new DepertmentTreeNode("Галоиды, окислители и альдегиды",
                            		new DepertmentTreeNode("Бетадин (Betadine)"),  
                            		new DepertmentTreeNode("Капсиол (Capsiol)"),
                            		new DepertmentTreeNode("Керасал (Kerasal)"),  
                            		new DepertmentTreeNode("Перекиси водорода раствор (SolutioHydrogen!!"
                            				+ " peroxydidiluta)")),  
                            new DepertmentTreeNode("Препараты кислот и щелочей",
                            		new DepertmentTreeNode("Скинорен (Skinoren)")),
                            new DepertmentTreeNode("Противомикробные и противопаразитарные лекарственные средства",
                            		new DepertmentTreeNode("Альгофин (Algofin)"),  
                            		new DepertmentTreeNode("Малавит (Malavit)"),
                            		new DepertmentTreeNode("Стрепсилс (Strepsils)"),  
                            		new DepertmentTreeNode("Трахисан"))),
                    new DepertmentTreeNode("Гормоны, их аналоги и антигормональные лекарственные средства",  
                            new DepertmentTreeNode("Гормоны гипофиза и их синтетические аналоги",
                            		new DepertmentTreeNode("Гормоны задней доли гипофиза"),  
                            		new DepertmentTreeNode("Гормоны передней доли гипофиза"),
                            		new DepertmentTreeNode("Гормоны средней доли гипофиза"),  
                            		new DepertmentTreeNode("Рилизингфакторы, регулирующие продукцию гормонов гипофиза")),  
                            new DepertmentTreeNode("Гормоны коры надпочечников",
                            		new DepertmentTreeNode("Адвантан (Advantan)"),
                            		new DepertmentTreeNode("Дексокорт (Dexocort)"),
                            		new DepertmentTreeNode("Лоринден (Lorinden)"),
                            		new DepertmentTreeNode("Назонекс (Nasonex)"),
                            		new DepertmentTreeNode("Сибикорт (Siblcortum)"),
                            		new DepertmentTreeNode("Содерм (Soderm)"),
                            		new DepertmentTreeNode("Флостерон (Flosteron)"),
                            		new DepertmentTreeNode("Целестодерм В (Celestoderm V)"),
                            		new DepertmentTreeNode("Элоком (Elocom)")),
                            new DepertmentTreeNode("Лекарственные средства, влияющие на функции щитовидной и околощитовидной желез",
                                    new DepertmentTreeNode("Мерказолил (Mercazolil)"),
                                    new DepertmentTreeNode("Миакальцик (Miacalcic)"),
                                    new DepertmentTreeNode("Новотирал (Novothyral)"),
                                    new DepertmentTreeNode("Паратиреоидин (Parathyreoidinum)"),
                                    new DepertmentTreeNode("Тиреоидин (Thyreoidlnum)"),
                                    new DepertmentTreeNode("Тирозол (Thyrozol)"),
                                    new DepertmentTreeNode("Трийодтиронина гидрохлорид (Triiodthyroninihydrochloridum)"),
                                    new DepertmentTreeNode("Эутирокс (Euthirox)")),
                            new DepertmentTreeNode("Пероральные противодиабетические лекарственные средства",
                            		new DepertmentTreeNode("Амарил (Amaryl)"),  
                            		new DepertmentTreeNode("Глибутид (Glibutidum)"),
                            		new DepertmentTreeNode("Диаформин (Diaformin)"),  
                            		new DepertmentTreeNode("Манинил (Мaninil)"),
                            		new DepertmentTreeNode("Олтар (Oltar)"),
                            		new DepertmentTreeNode("Сиофор (Siofor)"),
                            		new DepertmentTreeNode("Хлорпропамид (Chlorpropamidum)"))),
                    new DepertmentTreeNode("Лекарственные средства, применяемые для лечения бронхов и лёгких",  
                            new DepertmentTreeNode("Лекарственные средства для лечения ринита",
                            		new DepertmentTreeNode("Адрианол (Adrianol)"),  
                            		new DepertmentTreeNode("Викс Актив Синекс (Vicks Active Sinex)"),
                            		new DepertmentTreeNode("Делуфен (Delufen)"),
                            		new DepertmentTreeNode("Лазорин (Lasorin)"),
                            		new DepertmentTreeNode("Но-соль (No-sol)"),
                            		new DepertmentTreeNode("Нокспрей (Noxprey)"),
                            		new DepertmentTreeNode("Отривин (Otrivin)"),
                            		new DepertmentTreeNode("Превалин (Prevalin)"),
                            		new DepertmentTreeNode("Риностоп (Rinostop)"),  
                            		new DepertmentTreeNode("Эвказолин (Eucazolin)")),  
                            new DepertmentTreeNode("Лекарственные средства, содержащие эфирные масла",
                            		new DepertmentTreeNode("Бронхикум бальзам с эвкалиптовым маслом (Bronchicum balsam)"),
                            		new DepertmentTreeNode("Ингакамф (Inhacamf)"),
                            		new DepertmentTreeNode("Лоринден (Lorinden)"),
                            		new DepertmentTreeNode("Ментоклар (Mentoklar)"),
                            		new DepertmentTreeNode("Ментол (Mentholum)"),
                            		new DepertmentTreeNode("Септолете (Septolete)"),
                            		new DepertmentTreeNode("Смесь для ингаляций (Mixtio pro inhalationibus)"),
                            		new DepertmentTreeNode("Эвкабал (Eucabal)"),
                            		new DepertmentTreeNode("Эвкалипта лист (Folium Eucalyti)")),  
                            new DepertmentTreeNode("Муколитические лекарственные средства",
                            		new DepertmentTreeNode("АЦЦ (ACC)"),
                            		new DepertmentTreeNode("Бронхосан (Bronchosan)"),
                            		new DepertmentTreeNode("Карбоцистеин (Carbocistein)"),
                            		new DepertmentTreeNode("Лазолван (Lasolvan)"),
                            		new DepertmentTreeNode("Муколван (Mucolvanum)"),
                            		new DepertmentTreeNode("Пектолван Плющ (Pectolvan Hedera)"),
                            		new DepertmentTreeNode("Сальброксол (Salbroxolum)"),
                            		new DepertmentTreeNode("Флавамед (Flavamed)"),
                            		new DepertmentTreeNode("Халиксол (Halixol)")),
                            new DepertmentTreeNode("Отхаркивающие лекарственные средства",
                                    new DepertmentTreeNode("Алтея корень (RadixAlthaeae)"),
                                    new DepertmentTreeNode("Аниса плоды (Fructus Anisi vulgaris)"),
                                    new DepertmentTreeNode("Грудной эликсир (Elixir pectoralis)"),
                                    new DepertmentTreeNode("Кофол (сироп) (Kofol)"),
                                    new DepertmentTreeNode("Пертуссин (Pertussinum)"),
                                    new DepertmentTreeNode("Пульмолор (Pulmolor)"),
                                    new DepertmentTreeNode("Сироп алтейный (SirupusAlthaeae)"),
                                    new DepertmentTreeNode("Фиалки трава (Herba Violi)"))),
                    new DepertmentTreeNode("Противозачаточные лекарственные средства",  
                            new DepertmentTreeNode("Негормональные противозачаточные лекарственные средства",
                            		new DepertmentTreeNode("Бенатекс (Benatex)"),
                            		new DepertmentTreeNode("Контрацептин Т (Contraceptinum Т)"),
                            		new DepertmentTreeNode("Трацептин (Traceptinum)"),
                            		new DepertmentTreeNode("Фарматекс (Pharmatex)")),  
                            new DepertmentTreeNode("Пероральные гормональные противозачаточные лекарственные средства",
                            		new DepertmentTreeNode("Депопровера (Depotprovera)"),
                            		new DepertmentTreeNode("Евра (Evra)"),
                            		new DepertmentTreeNode("Комбинированные эстроген-гестагенсодержащие гормональные средства")),  
                            new DepertmentTreeNode("Посткоитальные гормональные противозачаточные средства",
                            		new DepertmentTreeNode("Гинепристон (Gynepriston)"),
                            		new DepertmentTreeNode("Постинор (Postinor)"),
                            		new DepertmentTreeNode("Эскапел (Escapelle)"))),  
                    new DepertmentTreeNode("Противомикробные и противопаразитарные лекарственные средства",  
                            new DepertmentTreeNode("Антибиотики",
                            		new DepertmentTreeNode("Амикацин (Amikacinum)"),
                            		new DepertmentTreeNode("Бивацин (Bivacyn)"),
                            		new DepertmentTreeNode("Изофра (Isofra)"),
                            		new DepertmentTreeNode("Кремген (Cremgenum)"),
                            		new DepertmentTreeNode("Неоэфрацин (Neophracinum)"),
                            		new DepertmentTreeNode("Пасомицин (Pasomyciniun)"),
                            		new DepertmentTreeNode("Стрептосалюзид (Streptosaluziduni)"),
                            		new DepertmentTreeNode("Тобрамицин (Tobramycin)"),
                            		new DepertmentTreeNode("Тобрекс (Tobrex)"),
                            		new DepertmentTreeNode("Трофодермин (Trofodermin)")),  
                            new DepertmentTreeNode("Противовирусные лекарственные средства",
                            		new DepertmentTreeNode("Ацик (Acic)"),
                            		new DepertmentTreeNode("Гропринозин (Groprinosin)"),
                            		new DepertmentTreeNode("Идоксуридин (Idoxuridine)"),
                            		new DepertmentTreeNode("Иммунофлазид (Immunoflazidum)"),
                            		new DepertmentTreeNode("Метисазон (Methisazonum)"),
                            		new DepertmentTreeNode("Оксолиновая мазь (UnguenturnOxolini)"),
                            		new DepertmentTreeNode("Ремантадин (Remantadinum)"),
                            		new DepertmentTreeNode("Фамвир (Famvir)"),
                            		new DepertmentTreeNode("Эпервудин (Epervudine)")),   
                            new DepertmentTreeNode("Противотуберкулезные лекарственные средства",
                            		new DepertmentTreeNode("Бепаск (Bepascum)"),
                            		new DepertmentTreeNode("Натрия пара-аминосалицилат (Natriipara-aminoszlicylas)"),
                            		new DepertmentTreeNode("Пиразинамид (Pirazinamidum)"),
                            		new DepertmentTreeNode("Солютизон (Soluthizonum)"),
                            		new DepertmentTreeNode("Тиоацетазон (Thioacetazonum)"),
                            		new DepertmentTreeNode("Этамбутол (Ethambutolum)"))),  
                    new DepertmentTreeNode("Сердечно-сосудистые лекарственные средства",  
                            new DepertmentTreeNode("Ангиопротекторные лекарственные средства",
                            		new DepertmentTreeNode("Анавенол (Anavenol)"),
                            		new DepertmentTreeNode("Венарус (Venarus)"),
                            		new DepertmentTreeNode("Гинкор Гель (Ginkor gel)"),
                            		new DepertmentTreeNode("Курантил (Curantil)"),
                            		new DepertmentTreeNode("Латрен (Latren)"),
                            		new DepertmentTreeNode("Мексиприм (Mexiprim)"),
                            		new DepertmentTreeNode("Репарил (Reparil)"),
                            		new DepertmentTreeNode("Флебодиа (Phlebodia)"),
                            		new DepertmentTreeNode("Эсcавен Гель"),
                            		new DepertmentTreeNode("Эскувит (Eskuvit)")),  
                            new DepertmentTreeNode("Антисклеротические лекарственные средства",
                            		new DepertmentTreeNode("Атеролип-вифор (Atherolip-vifor)"),
                            		new DepertmentTreeNode("Аторис (Atoris)"),
                            		new DepertmentTreeNode("Гемфиброзил (GemflbrozU)"),
                            		new DepertmentTreeNode("Ливостор (Livostor)"),
                            		new DepertmentTreeNode("Ловастатин (Lovastatin)"),
                            		new DepertmentTreeNode("Ревалгин (Revalgin)"),
                            		new DepertmentTreeNode("Симгал (Simgal)"),
                            		new DepertmentTreeNode("Торвакард (Torvacard)"),
                            		new DepertmentTreeNode("Фенофибрат (Phenofibrate)"),
                            		new DepertmentTreeNode("Холестирамин (Cholestyraminum)")),   
                            new DepertmentTreeNode("Лекарственные средства, улучшающие мозговое кровообращение",
                            		new DepertmentTreeNode("Авамигран (Avamigran)"),
                            		new DepertmentTreeNode("Винканор (Vincanorum)"),
                            		new DepertmentTreeNode("Инстенон (Instenon)"),
                            		new DepertmentTreeNode("Мексидол (Mexidolum)"),
                            		new DepertmentTreeNode("Оксибрал (Oxybral)"),
                            		new DepertmentTreeNode("Теоверин (Theoverinum)"),
                            		new DepertmentTreeNode("Флунаризин (Flunarizin)"))));
    public void onModuleLoad() {  
    	//final DynamicForm form3 = new DynamicForm();  
        
    	final TabSet topTabSet = new TabSet();  
        topTabSet.setWidth(800); 
        topTabSet.setHeight(500);
      //  form3.addChild(topTabSet);

        final DynamicForm form = new DynamicForm();  
        form.setNumCols(2);
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
        final Label label1 = new Label(); 
        label1.setContents("");
        label1.setWidth("100%");
        label1.setWrap(true); 
        IPickTreeItem departmentItem1 = new IPickTreeItem();  
        departmentItem1.setTitle("Выберите лекарство");  
        departmentItem1.setValueField("name");  
        departmentItem1.setValueTree(tree);  
        Tab tTab1 = new Tab("Интерфейс №1: \"Дерево\"");
        form.setItems(departmentItem1);
        departmentItem1.addChangeHandler(new ChangeHandler() {  
            public void onChange(ChangeEvent event) {  
                String selectedItem = (String) event.getValue();  
                label1.setContents("Вы выбрали " + selectedItem + " Описание: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
            }  
        });
        label1.draw();
        Canvas tabPane1 = new Canvas();  
        tabPane1.addChild(form);
        tabPane1.addChild(label1);
        form.draw();  
        tTab1.setPane(tabPane1);
        
        Tab tTab2 = new Tab("Интерфейс №2: \"Зависимые combobox\"");
        final DynamicForm form2 = new DynamicForm();  
        form2.setWidth("100%");  
        form2.setNumCols(4);
        form2.setColWidths("200px", "100px");
        final Map<String, String[]> departments = new HashMap<String, String[]>();  //коллекция связей для второго чекбокса первое-значние первого чекбокса-второе-коллекция элементов второго
        departments.put("Антисептические лекарственные средства", new String[]{"Галоиды, окислители и альдегиды", "Препараты кислот и щелочей", "Противомикробные и противопаразитарные лекарственные средства"});  
        departments.put("Гормоны, их аналоги и антигормональные лекарственные средства", new String[]{"Гормоны гипофиза и их синтетические аналоги", "Гормоны коры надпочечников","Лекарственные средства, влияющие на функции щитовидной и околощитовидной желез","Пероральные противодиабетические лекарственные средства"});  
        departments.put("Лекарственные средства, применяемые для лечения бронхов и лёгких", new String[]{"Лекарственные средства для лечения ринита","Лекарственные средства, содержащие эфирные масла","Муколитические лекарственные средства","Отхаркивающие лекарственные средства"});  
        departments.put("Противозачаточные лекарственные средства", new String[]{"Негормональные противозачаточные лекарственные средства", "Пероральные гормональные противозачаточные лекарственные средства", "Посткоитальные гормональные противозачаточные средства"});
        departments.put("Противомикробные и противопаразитарные лекарственные средства", new String[]{"Антибиотики", "Противовирусные лекарственные средства", "Противотуберкулезные лекарственные средства"}); 
        departments.put("Сердечно-сосудистые лекарственные средства", new String[]{"Ангиопротекторные лекарственные средства", "Антисклеротические лекарственные средства","Лекарственные средства, улучшающие мозговое кровообращение"}); 
        
        SelectItem divisionItem = new SelectItem();  
        divisionItem.setName("division");  
        divisionItem.setTitle("Выберите категорию лекарств");  
        divisionItem.setValueMap("Антисептические лекарственные средства", "Гормоны, их аналоги и антигормональные лекарственные средства","Лекарственные средства, применяемые для лечения бронхов и лёгких", "Противозачаточные лекарственные средства","Противомикробные и противопаразитарные лекарственные средства","Сердечно-сосудистые лекарственные средства");  
        divisionItem.addChangeHandler(new ChangeHandler() {  
            public void onChange(ChangeEvent event) {  
                String selectedItem = (String) event.getValue();  
                form2.getField("department").setValueMap(departments.get(selectedItem));  
            }  
        });  
        divisionItem.setWidth(300);
        final Map<String, String[]> departments2 = new HashMap<String, String[]>();  
        departments2.put("Галоиды, окислители и альдегиды", new String[]{"Бетадин (Betadine)","Капсиол (Capsiol)", "Керасал (Kerasal)",  "Перекиси водорода раствор (SolutioHydrogen!! peroxydidiluta)"}); 
        departments2.put("Препараты кислот и щелочей", new String[]{"Скинорен (Skinoren)"});
        departments2.put("Противомикробные и противопаразитарные лекарственные средства", new String[]{"Альгофин (Algofin)", "Малавит (Malavit)", "Стрепсилс (Strepsils)", "Трахисан"});
        departments2.put("Гормоны гипофиза и их синтетические аналоги", new String[]{"Гормоны задней доли гипофиза", "Гормоны передней доли гипофиза","Гормоны средней доли гипофиза", "Рилизингфакторы, регулирующие продукцию гормонов гипофиза"});
        departments2.put("Гормоны коры надпочечников", new String[]{"Адвантан (Advantan)", "Дексокорт (Dexocort)", "Лоринден (Lorinden)","Назонекс (Nasonex)", "Сибикорт (Siblcortum)", "Содерм (Soderm)", "Флостерон (Flosteron)", "Целестодерм В (Celestoderm V)", "Элоком (Elocom)"});
        departments2.put("Лекарственные средства, влияющие на функции щитовидной и околощитовидной желез", new String[]{"Мерказолил (Mercazolil)","Миакальцик (Miacalcic)", "Новотирал (Novothyral)", "Паратиреоидин (Parathyreoidinum)", "Тиреоидин (Thyreoidlnum)", "Тирозол (Thyrozol)", "Трийодтиронина гидрохлорид (Triiodthyroninihydrochloridum)", "Эутирокс (Euthirox)"});
        departments2.put("Пероральные противодиабетические лекарственные средства", new String[]{"Амарил (Amaryl)", "Глибутид (Glibutidum)", "Диаформин (Diaformin)","Манинил (Мaninil)", "Олтар (Oltar)", "Сиофор (Siofor)", "Хлорпропамид (Chlorpropamidum)"});
        departments2.put("Лекарственные средства для лечения ринита", new String[]{"Адрианол (Adrianol)", "Викс Актив Синекс (Vicks Active Sinex)", "Делуфен (Delufen)", "Лазорин (Lasorin)", "Но-соль (No-sol)", "Нокспрей (Noxprey)", "Отривин (Otrivin)", "Превалин (Prevalin)", "Риностоп (Rinostop)",  "Эвказолин (Eucazolin)"});
        departments2.put("Лекарственные средства, содержащие эфирные масла", new String[]{"Бронхикум бальзам с эвкалиптовым маслом (Bronchicum balsam)", "Ингакамф (Inhacamf)", "Лоринден (Lorinden)", "Ментоклар (Mentoklar)", "Ментол (Mentholum)", "Септолете (Septolete)", "Смесь для ингаляций (Mixtio pro inhalationibus)", "Эвкабал (Eucabal)", "Эвкалипта лист (Folium Eucalyti)"});
        departments2.put("Муколитические лекарственные средства", new String[]{"АЦЦ (ACC)", "Бронхосан (Bronchosan)", "Карбоцистеин (Carbocistein)", "Лазолван (Lasolvan)", "Муколван (Mucolvanum)", "Пектолван Плющ (Pectolvan Hedera)", "Сальброксол (Salbroxolum)", "Флавамед (Flavamed)", "Халиксол (Halixol)"});
        departments2.put("Отхаркивающие лекарственные средства", new String[]{"Алтея корень (RadixAlthaeae)", "Аниса плоды (Fructus Anisi vulgaris)", "Грудной эликсир (Elixir pectoralis)", "Кофол (сироп) (Kofol)", "Пертуссин (Pertussinum)", "Пульмолор (Pulmolor)", "Сироп алтейный (SirupusAlthaeae)", "Фиалки трава (Herba Violi)"});
        departments2.put("Негормональные противозачаточные лекарственные средства", new String[]{"Бенатекс (Benatex)", "Контрацептин Т (Contraceptinum Т)", "Трацептин (Traceptinum)", "Фарматекс (Pharmatex)"});
        departments2.put("Пероральные гормональные противозачаточные лекарственные средства", new String[]{"Депопровера (Depotprovera)", "Евра (Evra)", "Комбинированные эстроген-гестагенсодержащие гормональные средства"});
        departments2.put("Посткоитальные гормональные противозачаточные средства", new String[]{"Гинепристон (Gynepriston)", "Постинор (Postinor)", "Эскапел (Escapelle)"});
        departments2.put("Антибиотики", new String[]{"Амикацин (Amikacinum)", "Бивацин (Bivacyn)", "Изофра (Isofra)", "Кремген (Cremgenum)", "Неоэфрацин (Neophracinum)", "Пасомицин (Pasomyciniun)", "Стрептосалюзид (Streptosaluziduni)", "Тобрамицин (Tobramycin)", "Тобрекс (Tobrex)", "Трофодермин (Trofodermin)"});
        departments2.put("Противовирусные лекарственные средства", new String[]{"Ацик (Acic)", "Гропринозин (Groprinosin)", "Идоксуридин (Idoxuridine)", "Иммунофлазид (Immunoflazidum)", "Метисазон (Methisazonum)", "Оксолиновая мазь (UnguenturnOxolini)", "Ремантадин (Remantadinum)", "Фамвир (Famvir)", "Эпервудин (Epervudine)"});
        departments2.put("Противотуберкулезные лекарственные средства", new String[]{"Бепаск (Bepascum)", "Натрия пара-аминосалицилат (Natriipara-aminoszlicylas)", "Пиразинамид (Pirazinamidum)", "Солютизон (Soluthizonum)", "Тиоацетазон (Thioacetazonum)", "Этамбутол (Ethambutolum)"});
        departments2.put("Ангиопротекторные лекарственные средства", new String[]{"Анавенол (Anavenol)", "Венарус (Venarus)", "Гинкор Гель (Ginkor gel)", "Курантил (Curantil)", "Латрен (Latren)", "Мексиприм (Mexiprim)", "Репарил (Reparil)", "Флебодиа (Phlebodia)", "Эсcавен Гель", "Эскувит (Eskuvit)"});
        departments2.put("Антисклеротические лекарственные средства", new String[]{"Атеролип-вифор (Atherolip-vifor)", "Аторис (Atoris)", "Гемфиброзил (GemflbrozU)", "Ливостор (Livostor)", "Ловастатин (Lovastatin)", "Ревалгин (Revalgin)", "Симгал (Simgal)", "Торвакард (Torvacard)", "Фенофибрат (Phenofibrate)", "Холестирамин (Cholestyraminum)"});
        departments2.put("Лекарственные средства, улучшающие мозговое кровообращение", new String[]{"Авамигран (Avamigran)", "Винканор (Vincanorum)", "Инстенон (Instenon)", "Мексидол (Mexidolum)", "Оксибрал (Oxybral)", "Теоверин (Theoverinum)", "Флунаризин (Flunarizin)"});
        
        SelectItem departmentItem = new SelectItem(); 
        departmentItem.setWidth(300);
        departmentItem.setName("department");  
        departmentItem.setTitle("Выберите подгруппу");  
        departmentItem.setAddUnknownValues(false);  
        SelectItem departmentItem3 = new SelectItem();
        departmentItem3.setName("health");  
        departmentItem3.setTitle("Выберите препарат");  
        departmentItem3.setAddUnknownValues(false);
        departmentItem3.setWidth(300);
        departmentItem3.setRowSpan(2);
        departmentItem.addChangeHandler(new ChangeHandler() {  
            public void onChange(ChangeEvent event) {  
                String selectedItem = (String) event.getValue();  
                form2.getField("health").setValueMap(departments2.get(selectedItem));  
            }  
        });
        final Label label = new Label(); 
        label.setContents("");
        label.setWidth("100%");
        label.setWrap(true);  
        departmentItem3.addChangeHandler(new ChangeHandler() {  
            public void onChange(ChangeEvent event) {  
                String selectedItem = (String) event.getValue();  
                
                label.setContents("Вы выбрали " + selectedItem + " Описание: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
            }  
        });
        form2.setItems(divisionItem, departmentItem, departmentItem3);
        
        label.draw();
        VStack vStack2 = new VStack();
        vStack2.setWidth("100%"); 
        vStack2.addMember(form2);
        vStack2.addMember(label);
        vStack2.setMembersMargin(10);
        tTab2.setPane(vStack2);
        
        Canvas tabPane2 = new Canvas();  
        tabPane2.addChild(vStack2);
        form2.draw();  
        tTab2.setPane(tabPane2);
        Tab tTab3 = new Tab("Интерфейс №3: \"Таблица\"");
        final DynamicForm form3 = new DynamicForm();  
        form3.setWidth("100%");  
        form3.setHeight("90%");
        final ListGrid countryGrid = new ListGrid();  
        countryGrid.setWidth("100%");  
        countryGrid.setHeight("100%");  
        label.setStyleName("labels2");  
        label1.setStyleName("labels2");
        countryGrid.setShowAllRecords(true);  
        countryGrid.setAlternateRecordStyles(true);  
        
        countryGrid.setWrapCells(true);  
        countryGrid.setFixedRecordHeights(false); 
        final ListGridField nameField = new ListGridField("Name", "Название преперата");  
        nameField.setWidth(200);
        
        ListGridField descriptionField = new ListGridField("description", "Описание");
        countryGrid.setFields(nameField, descriptionField);
        countryGrid.setCanResizeFields(true);  
        countryGrid.setData(CountrySampleData.getRecords());  

        final InlineLabel label3 = new InlineLabel(); 
        label3.setText("");
        label3.setWidth("100%");
        label3.setHeight("30px");
        countryGrid.addCellClickHandler(new CellClickHandler() {  
            public void onCellClick(CellClickEvent event) {  
  
            	ListGridRecord record =  event.getRecord();  
                label3.setText("Вы выбрали " + record.getAttribute("Name") + " Описание: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
            }  
        });
        form3.addChild(countryGrid);
        form3.draw();
        VStack vStack = new VStack();
        vStack.setWidth("100%"); 
        vStack.addMember(form3);
        vStack.addMember(label3);
        vStack.setMembersMargin(10);
        tTab3.setPane(vStack);
        
        label3.setStyleName("labels2");
        Tab tTab4 = new Tab("Перегрузки формы");
        
        final LinkedHashMap<String, String> CategoriesMap = new LinkedHashMap<String, String>();  
        CategoriesMap.put("antiseptic", "Антисептические лекарственные средства");  
        CategoriesMap.put("hormones", "Гормоны, их аналоги и антигормональные лекарственные средства");  
        CategoriesMap.put("drugs", "Лекарственные средства, применяемые для лечения бронхов и лёгких");  
        CategoriesMap.put("contraceptives", "Противозачаточные лекарственные средства");  
        CategoriesMap.put("antimicrobial", "Противомикробные и противопаразитарные лекарственные средства");  
        CategoriesMap.put("cardiovascular", "Сердечно-сосудистые лекарственные средства");      

        final Map<String, LinkedHashMap> categories = new HashMap<String, LinkedHashMap>();  //коллекция связей для второго чекбокса первое-значние первого чекбокса-второе-коллекция элементов второго
        LinkedHashMap<String, String> antiseptic = new LinkedHashMap<String, String>();  
        antiseptic.put("1", "Галоиды, окислители и альдегиды");  
        antiseptic.put("2", "Препараты кислот и щелочей");  
        antiseptic.put("3", "Противомикробные и противопаразитарные лекарственные средства");  

        LinkedHashMap<String, String> hormones = new LinkedHashMap<String, String>();  
        hormones.put("4", "Гормоны гипофиза и их синтетические аналоги");  
        hormones.put("5", "Гормоны коры надпочечников");  
        hormones.put("6", "Лекарственные средства, влияющие на функции щитовидной и околощитовидной желез");  
        hormones.put("7", "Пероральные противодиабетические лекарственные средства");  
        
        LinkedHashMap<String, String> drugs = new LinkedHashMap<String, String>();  
        drugs.put("8", "Лекарственные средства для лечения ринита");  
        drugs.put("9", "Лекарственные средства, содержащие эфирные масла");  
        drugs.put("10", "Муколитические лекарственные средства");  
        drugs.put("11", "Отхаркивающие лекарственные средства");  

        LinkedHashMap<String, String> contraceptives = new LinkedHashMap<String, String>();  
        contraceptives.put("12", "Негормональные противозачаточные лекарственные средства");  
        contraceptives.put("13", "Пероральные гормональные противозачаточные лекарственные средства");  
        contraceptives.put("14", "Посткоитальные гормональные противозачаточные средства");  

        LinkedHashMap<String, String> antimicrobial = new LinkedHashMap<String, String>();  
        antimicrobial.put("15", "Антибиотики");  
        antimicrobial.put("16", "Противовирусные лекарственные средства");  
        antimicrobial.put("17", "Противотуберкулезные лекарственные средства");  

        LinkedHashMap<String, String> cardiovascular = new LinkedHashMap<String, String>();  
        cardiovascular.put("18", "Ангиопротекторные лекарственные средства");  
        cardiovascular.put("19", "Антисклеротические лекарственные средства");  
        cardiovascular.put("20", "Лекарственные средства, улучшающие мозговое кровообращение");  
        
        categories.put("antiseptic", antiseptic);  
        categories.put("hormones", hormones);
        categories.put("drugs", drugs);
        categories.put("contraceptives", contraceptives);
        categories.put("antimicrobial", antimicrobial);
        categories.put("cardiovascular", cardiovascular);
        
        final Map<String, LinkedHashMap> medecines = new HashMap<String, LinkedHashMap>();  //коллекция связей для второго чекбокса первое-значние первого чекбокса-второе-коллекция элементов второго
        LinkedHashMap<String, String> med1 = new LinkedHashMap<String, String>();  
        med1.put("1", "Бетадин (Betadine)");  
        med1.put("2", "Капсиол (Capsiol)");  
        med1.put("3", "Керасал (Kerasal)");  
        med1.put("4", "Перекиси водорода раствор (SolutioHydrogen!! peroxydidiluta)");

        LinkedHashMap<String, String> med2 = new LinkedHashMap<String, String>();  
        med2.put("1", "Скинорен (Skinoren)");

        LinkedHashMap<String, String> med3 = new LinkedHashMap<String, String>();  
        med3.put("1", "Альгофин (Algofin)");  
        med3.put("2", "Малавит (Malavit)");  
        med3.put("3", "Стрепсилс (Strepsils)");  
        med3.put("4", "Трахисан"); 
        
        LinkedHashMap<String, String> med4 = new LinkedHashMap<String, String>();  
        med4.put("1", "Гормоны задней доли гипофиза");  
        med4.put("2", "Гормоны передней доли гипофиза");  
        med4.put("3", "Гормоны средней доли гипофиза");  
        med4.put("4", "Рилизингфакторы, регулирующие продукцию гормонов гипофиза");  

        LinkedHashMap<String, String> med5 = new LinkedHashMap<String, String>();  
        med5.put("1", "Адвантан (Advantan)");  
        med5.put("2", "Дексокорт (Dexocort)");  
        med5.put("3", "Лоринден (Lorinden)");  
        med5.put("4", "Назонекс (Nasonex)"); 
        med5.put("5", "Сибикорт (Siblcortum)");  
        med5.put("6", "Содерм (Soderm)");  
        med5.put("7", "Флостерон (Flosteron)");  
        med5.put("8", "Целестодерм В (Celestoderm V)"); 
        med5.put("9", "Элоком (Elocom)");
        
        LinkedHashMap<String, String> med6 = new LinkedHashMap<String, String>();  
        med6.put("1", "Мерказолил (Mercazolil)");  
        med6.put("2", "Миакальцик (Miacalcic)");  
        med6.put("3", "Новотирал (Novothyral)");  
        med6.put("4", "Паратиреоидин (Parathyreoidinum)");  
        med6.put("5", "Тиреоидин (Thyreoidlnum)");  
        med6.put("6", "Тирозол (Thyrozol)");  
        med6.put("7", "Трийодтиронина гидрохлорид (Triiodthyroninihydrochloridum)");  
        med6.put("8", "Эутирокс (Euthirox)");  

        LinkedHashMap<String, String> med7 = new LinkedHashMap<String, String>();  
        med7.put("1", "Амарил (Amaryl)");  
        med7.put("2", "Глибутид (Glibutidum)");  
        med7.put("3", "Диаформин (Diaformin)");  
        med7.put("4", "Манинил (Мaninil)");  
        med7.put("5", "Олтар (Oltar)");  
        med7.put("6", "Сиофор (Siofor)");  
        med7.put("7", "Хлорпропамид (Chlorpropamidum)");  

        LinkedHashMap<String, String> med8 = new LinkedHashMap<String, String>();  
        med8.put("1", "Адрианол (Adrianol)");  
        med8.put("2", "Викс Актив Синекс (Vicks Active Sinex)");  
        med8.put("3", "Делуфен (Delufen)");  
        med8.put("4", "Лазорин (Lasorin)");  
        med8.put("5", "Но-соль (No-sol)");  
        med8.put("6", "Нокспрей (Noxprey)");  
        med8.put("7", "Отривин (Otrivin)");  
        med8.put("8", "Превалин (Prevalin)");  
        med8.put("9", "Риностоп (Rinostop)"); 
        med8.put("10", "Эвказолин (Eucazolin)"); 
        
        LinkedHashMap<String, String> med9 = new LinkedHashMap<String, String>();  
        med9.put("1", "Бронхикум бальзам с эвкалиптовым маслом (Bronchicum balsam)");  
        med9.put("2", "Ингакамф (Inhacamf)");  
        med9.put("3", "Лоринден (Lorinden)");  
        med9.put("4", "Ментоклар (Mentoklar)");  
        med9.put("5", "Ментол (Mentholum)");  
        med9.put("6", "Септолете (Septolete)");  
        med9.put("7", "Смесь для ингаляций (Mixtio pro inhalationibus)");  
        med9.put("8", "Эвкабал (Eucabal)");  
        med9.put("9", "Эвкалипта лист (Folium Eucalyti)");  

        LinkedHashMap<String, String> med10 = new LinkedHashMap<String, String>();  
        med10.put("1", "АЦЦ (ACC), ");  
        med10.put("2", "Бронхосан (Bronchosan)");  
        med10.put("3", "Карбоцистеин (Carbocistein)");  
        med10.put("4", "Лазолван (Lasolvan)");  
        med10.put("5", "Муколван (Mucolvanum)");  
        med10.put("6", "Пектолван Плющ (Pectolvan Hedera)");  
        med10.put("7", "Сальброксол (Salbroxolum)");  
        med10.put("8", "Флавамед (Flavamed)");  
        med10.put("9", "Халиксол (Halixol)");  
       
        LinkedHashMap<String, String> med11 = new LinkedHashMap<String, String>();  
        med11.put("1", "Алтея корень (RadixAlthaeae)");  
        med11.put("2", "Аниса плоды (Fructus Anisi vulgaris)");  
        med11.put("3", "Грудной эликсир (Elixir pectoralis)");  
        med11.put("4", "Кофол (сироп) (Kofol)");  
        med11.put("5", "Пертуссин (Pertussinum)");  
        med11.put("6", "Пульмолор (Pulmolor)"); 
        med11.put("7", "Сироп алтейный (SirupusAlthaeae)");  
        med11.put("8", "Фиалки трава (Herba Violi)"); 
       
        LinkedHashMap<String, String> med12 = new LinkedHashMap<String, String>();  
        med12.put("1", "Бенатекс (Benatex)");  
        med12.put("2", "Контрацептин Т (Contraceptinum Т)");  
        med12.put("3", "Трацептин (Traceptinum)");  
        med12.put("4", "Фарматекс (Pharmatex)");
        
        LinkedHashMap<String, String> med13 = new LinkedHashMap<String, String>();  
        med13.put("1", "Депопровера (Depotprovera)");  
        med13.put("2", "Евра (Evra)");  
        med13.put("3", "Комбинированные эстроген-гестагенсодержащие гормональные средства  ");  

        LinkedHashMap<String, String> med14 = new LinkedHashMap<String, String>();  
        med14.put("1", "Гинепристон (Gynepriston)");  
        med14.put("2", "Постинор (Postinor)");  
        med14.put("3", "Эскапел (Escapelle)");  

        LinkedHashMap<String, String> med15 = new LinkedHashMap<String, String>();  
        med15.put("1", "Амикацин (Amikacinum)");  
        med15.put("2", "Бивацин (Bivacyn)");  
        med15.put("3", "Изофра (Isofra)");  
        med15.put("4", "Кремген (Cremgenum)");  
        med15.put("5", "Неоэфрацин (Neophracinum)");  
        med15.put("6", "Пасомицин (Pasomyciniun)");  
        med15.put("7", "Стрептосалюзид (Streptosaluziduni)");  
        med15.put("8", "Тобрамицин (Tobramycin)");  
        med15.put("9", "Тобрекс (Tobrex)");  
        med15.put("10", "Трофодермин (Trofodermin)");  

        LinkedHashMap<String, String> med16 = new LinkedHashMap<String, String>();  
        med16.put("1", "Ацик (Acic)");  
        med16.put("2", "Гропринозин (Groprinosin)");  
        med16.put("3", "Идоксуридин (Idoxuridine)");  
        med16.put("4", "Иммунофлазид (Immunoflazidum)");  
        med16.put("5", "Метисазон (Methisazonum)");  
        med16.put("6", "Оксолиновая мазь (UnguenturnOxolini)");  
        med16.put("7", "Ремантадин (Remantadinum)");  
        med16.put("8", "Фамвир (Famvir)");  
        med16.put("9", "Эпервудин (Epervudine)");  

        LinkedHashMap<String, String> med17 = new LinkedHashMap<String, String>();  
        med17.put("1", "Бепаск (Bepascum)");  
        med17.put("2", "Натрия пара-аминосалицилат (Natriipara-aminoszlicylas)");  
        med17.put("3", "Пиразинамид (Pirazinamidum)");  
        med17.put("4", "Солютизон (Soluthizonum)");  
        med17.put("5", "Тиоацетазон (Thioacetazonum)");  
        med17.put("6", "Этамбутол (Ethambutolum)"); 

        LinkedHashMap<String, String> med18 = new LinkedHashMap<String, String>();  
        med18.put("1", "Анавенол (Anavenol)");  
        med18.put("2", "Венарус (Venarus)");  
        med18.put("3", "Гинкор Гель (Ginkor gel)");  
        med18.put("4", "Курантил (Curantil)");  
        med18.put("5", "Латрен (Latren)");  
        med18.put("6", "Мексиприм (Mexiprim)");  
        med18.put("7", "Репарил (Reparil)");  
        med18.put("8", "Флебодиа (Phlebodia)");
        med18.put("9", "Эсcавен Гель");
        med18.put("10", "Эскувит (Eskuvit)");
        
        LinkedHashMap<String, String> med19 = new LinkedHashMap<String, String>();  
        med19.put("1", "Атеролип-вифор (Atherolip-vifor)");  
        med19.put("2", "Аторис (Atoris)");  
        med19.put("3", "Гемфиброзил (GemflbrozU)");  
        med19.put("4", "Ливостор (Livostor)");  
        med19.put("5", "Ловастатин (Lovastatin)");  
        med19.put("6", "Ревалгин (Revalgin)");  
        med19.put("7", "Симгал (Simgal)");  
        med19.put("8", "Торвакард (Torvacard)");  
        med19.put("9", "Фенофибрат (Phenofibrate)");  
        med19.put("10", "Холестирамин (Cholestyraminum)");  

        LinkedHashMap<String, String> med20 = new LinkedHashMap<String, String>();  
        med20.put("1", "Авамигран (Avamigran)");  
        med20.put("2", "Винканор (Vincanorum)");  
        med20.put("3", "Инстенон (Instenon)");  
        med20.put("4", "Мексидол (Mexidolum)");  
        med20.put("5", "Оксибрал (Oxybral)");  
        med20.put("6", "Теоверин (Theoverinum)");  
        med20.put("7", "Флунаризин (Flunarizin)");  
        
        medecines.put("1",med1);
        medecines.put("2",med2);
        medecines.put("3",med3);
        medecines.put("4",med4);
        medecines.put("5",med5);
        medecines.put("6",med6);
        medecines.put("7",med7);
        medecines.put("8",med8);
        medecines.put("9",med9);
        medecines.put("10",med10);
        medecines.put("11",med11);
        medecines.put("12",med12);
        medecines.put("13",med13);
        medecines.put("14",med14);
        medecines.put("15",med15);
        medecines.put("16",med16);
        medecines.put("17",med17);
        medecines.put("18",med18);
        medecines.put("19",med19);
        medecines.put("20",med20);
        
        final RadioGroupItem CategoriesRad = new RadioGroupItem();  
        CategoriesRad.setShowTitle(false);  
        CategoriesRad.setValueMap(CategoriesMap);  
        CategoriesRad.setDefaultValue("none"); 
        CategoriesRad.setWidth(100);
        
        final RadioGroupItem CatRad = new RadioGroupItem();  
        CatRad.setShowTitle(false);  
        //CatRad.setValueMap(CategoriesMap);  
        CatRad.setDefaultValue("none"); 
       
        final DynamicForm controls = new DynamicForm();  
        controls.setFields(CategoriesRad);
        
        /*final Label label4 = new Label(); 
        label4.setContents("");
        label4.setWidth("100%");
        label4.setHeight("30px");
        label4.setStyleName("labels2");*/
        
        final IButton next = new IButton();
        next.setTop(400); next.setLeft(350);
        controls.addChild(next);
        next.setTitle("Выбрать");
        next.addClickHandler(new com.smartgwt.client.widgets.events.ClickHandler() {
        	public void onClick(com.smartgwt.client.widgets.events.ClickEvent event) {
        		selectedItem = (String) CategoriesRad.getValue(); 
        		if(field == 1) {CategoriesRad.setValueMap(categories.get(selectedItem)); field ++;}
        		else if(field == 2){CategoriesRad.setValueMap(medecines.get(selectedItem)); field ++;}
        		else if(field == 3){
                    //label4.setContents("Вы выбрали " + medecines.get(selectedItem) + " Описание: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        		}
        	}
        });
        final IButton previous = new IButton();
        previous.setTop(400); previous.setLeft(200);
        controls.addChild(previous);
        previous.setTitle("Назад");
        previous.addClickHandler(new com.smartgwt.client.widgets.events.ClickHandler() {
        	public void onClick(com.smartgwt.client.widgets.events.ClickEvent event) {
        		//String selectedItem = (String) CategoriesRad.getValue(); 

        		if(field == 2){CategoriesRad.setValueMap(CategoriesMap); field --;}
        		else if(field == 3){CategoriesRad.setValueMap(categories.get(selectedItem)); field --;}
        	}
        }); 
        
        
        
        tTab4.setPane(controls);
        Tab tTab5 = new Tab("Р§РµРєР±РѕРєСЃС‹");
  
        topTabSet.addTab(tTab1);  
        topTabSet.addTab(tTab2);  
        topTabSet.addTab(tTab3);  
        topTabSet.addTab(tTab4);  
        topTabSet.addTab(tTab5); 
  
       
  
        
        VLayout vLayout = new VLayout();  
        vLayout.setMembersMargin(15);  
        vLayout.addMember(topTabSet);  
        vLayout.setHeight("*");  
  
        vLayout.draw(); 

        RootPanel.get("center2").add(vLayout);
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
