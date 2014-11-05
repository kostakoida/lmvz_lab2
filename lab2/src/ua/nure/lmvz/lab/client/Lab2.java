package ua.nure.lmvz.lab.client;

import java.util.HashMap;  
import java.util.LinkedHashMap;
import java.util.Map;  
  








import com.smartgwt.client.widgets.layout.VStack; 
import com.smartgwt.client.data.Record;
import com.smartgwt.client.types.Side;  
import com.smartgwt.client.widgets.layout.HLayout;  
import com.smartgwt.client.widgets.layout.HStack;
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
	String step2 = null;
	String step1 = null;
	String selectedItem = null;
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
        label1.setContents(" ");
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
        Tab tTab4 = new Tab("Интерфейс №4: \"Radio buttons\"");
        final DynamicForm form4 = new DynamicForm();  
        form4.setWidth(100);
        form4.setHeight(100);
        form4.setLeft(200);
        
        final DynamicForm form41 = new DynamicForm();  
        form41.setWidth("100%");
        form41.hide();
        
        final DynamicForm form42 = new DynamicForm();  
        form42.setWidth("100%");
        form42.hide();
        
        final Label label4 = new Label(); 
        label4.setContents("");
        label4.setWidth("100%");
        label4.setWrap(true);  

        final Label label41 = new Label(); 
        label41.setContents("");
        label41.setWidth("100%");
        label41.setWrap(true); 
        
        final LinkedHashMap<String, String> CategoriesMap = new LinkedHashMap<String, String>();  
        CategoriesMap.put("Антисептические лекарственные средства", "Антисептические лекарственные средства");  
        CategoriesMap.put("Гормоны, их аналоги и антигормональные лекарственные средства", "Гормоны, их аналоги и антигормональные лекарственные средства");  
        CategoriesMap.put("Лекарственные средства, применяемые для лечения бронхов и лёгких", "Лекарственные средства, применяемые для лечения бронхов и лёгких");  
        CategoriesMap.put("Противозачаточные лекарственные средства", "Противозачаточные лекарственные средства");  
        CategoriesMap.put("Противомикробные и противопаразитарные лекарственные средства", "Противомикробные и противопаразитарные лекарственные средства");  
        CategoriesMap.put("Сердечно-сосудистые лекарственные средства", "Сердечно-сосудистые лекарственные средства");      

        final Map<String, LinkedHashMap> categories = new HashMap<String, LinkedHashMap>();  //коллекция связей для второго чекбокса первое-значние первого чекбокса-второе-коллекция элементов второго
        LinkedHashMap<String, String> antiseptic = new LinkedHashMap<String, String>();  
        antiseptic.put("Галоиды, окислители и альдегиды", "Галоиды, окислители и альдегиды");  
        antiseptic.put("Препараты кислот и щелочей", "Препараты кислот и щелочей");  
        antiseptic.put("Противомикробные и противопаразитарные лекарственные средства", "Противомикробные и противопаразитарные лекарственные средства");  

        LinkedHashMap<String, String> hormones = new LinkedHashMap<String, String>();  
        hormones.put("Гормоны гипофиза и их синтетические аналоги", "Гормоны гипофиза и их синтетические аналоги");  
        hormones.put("Гормоны коры надпочечников", "Гормоны коры надпочечников");  
        hormones.put("Лекарственные средства, влияющие на функции щитовидной и околощитовидной желез", "Лекарственные средства, влияющие на функции щитовидной и околощитовидной желез");  
        hormones.put("Пероральные противодиабетические лекарственные средства", "Пероральные противодиабетические лекарственные средства");  
        
        LinkedHashMap<String, String> drugs = new LinkedHashMap<String, String>();  
        drugs.put("Лекарственные средства для лечения ринита", "Лекарственные средства для лечения ринита");  
        drugs.put("Лекарственные средства, содержащие эфирные масла", "Лекарственные средства, содержащие эфирные масла");  
        drugs.put("Муколитические лекарственные средства", "Муколитические лекарственные средства");  
        drugs.put("Отхаркивающие лекарственные средства", "Отхаркивающие лекарственные средства");  

        LinkedHashMap<String, String> contraceptives = new LinkedHashMap<String, String>();  
        contraceptives.put("Негормональные противозачаточные лекарственные средства", "Негормональные противозачаточные лекарственные средства");  
        contraceptives.put("Пероральные гормональные противозачаточные лекарственные средства", "Пероральные гормональные противозачаточные лекарственные средства");  
        contraceptives.put("Посткоитальные гормональные противозачаточные средства", "Посткоитальные гормональные противозачаточные средства");  

        LinkedHashMap<String, String> antimicrobial = new LinkedHashMap<String, String>();  
        antimicrobial.put("Антибиотики", "Антибиотики");  
        antimicrobial.put("Противовирусные лекарственные средства", "Противовирусные лекарственные средства");  
        antimicrobial.put("Противотуберкулезные лекарственные средства", "Противотуберкулезные лекарственные средства");  

        LinkedHashMap<String, String> cardiovascular = new LinkedHashMap<String, String>();  
        cardiovascular.put("Ангиопротекторные лекарственные средства", "Ангиопротекторные лекарственные средства");  
        cardiovascular.put("Антисклеротические лекарственные средства", "Антисклеротические лекарственные средства");  
        cardiovascular.put("Лекарственные средства, улучшающие мозговое кровообращение", "Лекарственные средства, улучшающие мозговое кровообращение");  
        
        categories.put("Антисептические лекарственные средства", antiseptic);  
        categories.put("Гормоны, их аналоги и антигормональные лекарственные средства", hormones);
        categories.put("Лекарственные средства, применяемые для лечения бронхов и лёгких", drugs);
        categories.put("Противозачаточные лекарственные средства", contraceptives);
        categories.put("Противомикробные и противопаразитарные лекарственные средства", antimicrobial);
        categories.put("Сердечно-сосудистые лекарственные средства", cardiovascular);
        
        final Map<String, LinkedHashMap> medecines = new HashMap<String, LinkedHashMap>();  //коллекция связей для второго чекбокса первое-значние первого чекбокса-второе-коллекция элементов второго
        LinkedHashMap<String, String> med1 = new LinkedHashMap<String, String>();  
        med1.put("Бетадин (Betadine)", "Бетадин (Betadine)");  
        med1.put("Капсиол (Capsiol)", "Капсиол (Capsiol)");  
        med1.put("Керасал (Kerasal)", "Керасал (Kerasal)");  
        med1.put("Перекиси водорода раствор (SolutioHydrogen!! peroxydidiluta)", "Перекиси водорода раствор (SolutioHydrogen!! peroxydidiluta)");

        LinkedHashMap<String, String> med2 = new LinkedHashMap<String, String>();  
        med2.put("Скинорен (Skinoren)", "Скинорен (Skinoren)");

        LinkedHashMap<String, String> med3 = new LinkedHashMap<String, String>();  
        med3.put("Альгофин (Algofin)", "Альгофин (Algofin)");  
        med3.put("Малавит (Malavit)", "Малавит (Malavit)");  
        med3.put("Стрепсилс (Strepsils)", "Стрепсилс (Strepsils)");  
        med3.put("Трахисан", "Трахисан"); 
        
        LinkedHashMap<String, String> med4 = new LinkedHashMap<String, String>();  
        med4.put("Гормоны задней доли гипофиза", "Гормоны задней доли гипофиза");  
        med4.put("Гормоны передней доли гипофиза", "Гормоны передней доли гипофиза");  
        med4.put("Гормоны средней доли гипофиза", "Гормоны средней доли гипофиза");  
        med4.put("Рилизингфакторы, регулирующие продукцию гормонов гипофиза", "Рилизингфакторы, регулирующие продукцию гормонов гипофиза");  

        LinkedHashMap<String, String> med5 = new LinkedHashMap<String, String>();  
        med5.put("Адвантан (Advantan)", "Адвантан (Advantan)");  
        med5.put("Дексокорт (Dexocort)", "Дексокорт (Dexocort)");  
        med5.put("Лоринден (Lorinden)", "Лоринден (Lorinden)");  
        med5.put("Назонекс (Nasonex)", "Назонекс (Nasonex)"); 
        med5.put("Сибикорт (Siblcortum)", "Сибикорт (Siblcortum)");  
        med5.put("Содерм (Soderm)", "Содерм (Soderm)");  
        med5.put("Флостерон (Flosteron)", "Флостерон (Flosteron)");  
        med5.put("Целестодерм В (Celestoderm V)", "Целестодерм В (Celestoderm V)"); 
        med5.put("Элоком (Elocom)", "Элоком (Elocom)");
        
        LinkedHashMap<String, String> med6 = new LinkedHashMap<String, String>();  
        med6.put("Мерказолил (Mercazolil)", "Мерказолил (Mercazolil)");  
        med6.put("Миакальцик (Miacalcic)", "Миакальцик (Miacalcic)");  
        med6.put("Новотирал (Novothyral)", "Новотирал (Novothyral)");  
        med6.put("Паратиреоидин (Parathyreoidinum)", "Паратиреоидин (Parathyreoidinum)");  
        med6.put("Тиреоидин (Thyreoidlnum)", "Тиреоидин (Thyreoidlnum)");  
        med6.put("Тирозол (Thyrozol)", "Тирозол (Thyrozol)");  
        med6.put("Трийодтиронина гидрохлорид (Triiodthyroninihydrochloridum)", "Трийодтиронина гидрохлорид (Triiodthyroninihydrochloridum)");  
        med6.put("Эутирокс (Euthirox)", "Эутирокс (Euthirox)");  

        LinkedHashMap<String, String> med7 = new LinkedHashMap<String, String>();  
        med7.put("Амарил (Amaryl)", "Амарил (Amaryl)");  
        med7.put("Глибутид (Glibutidum)", "Глибутид (Glibutidum)");  
        med7.put("Диаформин (Diaformin)", "Диаформин (Diaformin)");  
        med7.put("Манинил (Мaninil)", "Манинил (Мaninil)");  
        med7.put("Олтар (Oltar)", "Олтар (Oltar)");  
        med7.put("Сиофор (Siofor)", "Сиофор (Siofor)");  
        med7.put("Хлорпропамид (Chlorpropamidum)", "Хлорпропамид (Chlorpropamidum)");  

        LinkedHashMap<String, String> med8 = new LinkedHashMap<String, String>();  
        med8.put("Адрианол (Adrianol)", "Адрианол (Adrianol)");  
        med8.put("Викс Актив Синекс (Vicks Active Sinex)", "Викс Актив Синекс (Vicks Active Sinex)");  
        med8.put("Делуфен (Delufen)", "Делуфен (Delufen)");  
        med8.put("Лазорин (Lasorin)", "Лазорин (Lasorin)");  
        med8.put("Но-соль (No-sol)", "Но-соль (No-sol)");  
        med8.put("Нокспрей (Noxprey)", "Нокспрей (Noxprey)");  
        med8.put("Отривин (Otrivin)", "Отривин (Otrivin)");  
        med8.put("Превалин (Prevalin)", "Превалин (Prevalin)");  
        med8.put("Риностоп (Rinostop)", "Риностоп (Rinostop)"); 
        med8.put("Эвказолин (Eucazolin)", "Эвказолин (Eucazolin)"); 
        
        LinkedHashMap<String, String> med9 = new LinkedHashMap<String, String>();  
        med9.put("Бронхикум бальзам с эвкалиптовым маслом (Bronchicum balsam)", "Бронхикум бальзам с эвкалиптовым маслом (Bronchicum balsam)");  
        med9.put("Ингакамф (Inhacamf)", "Ингакамф (Inhacamf)");  
        med9.put("Лоринден (Lorinden)", "Лоринден (Lorinden)");  
        med9.put("Ментоклар (Mentoklar)", "Ментоклар (Mentoklar)");  
        med9.put("Ментол (Mentholum)", "Ментол (Mentholum)");  
        med9.put("Септолете (Septolete)", "Септолете (Septolete)");  
        med9.put("Смесь для ингаляций (Mixtio pro inhalationibus)", "Смесь для ингаляций (Mixtio pro inhalationibus)");  
        med9.put("Эвкабал (Eucabal)", "Эвкабал (Eucabal)");  
        med9.put("Эвкалипта лист (Folium Eucalyti)", "Эвкалипта лист (Folium Eucalyti)");  

        LinkedHashMap<String, String> med10 = new LinkedHashMap<String, String>();  
        med10.put("АЦЦ (ACC)", "АЦЦ (ACC)");  
        med10.put("Бронхосан (Bronchosan)", "Бронхосан (Bronchosan)");  
        med10.put("Карбоцистеин (Carbocistein)", "Карбоцистеин (Carbocistein)");  
        med10.put("Лазолван (Lasolvan)", "Лазолван (Lasolvan)");  
        med10.put("Муколван (Mucolvanum)", "Муколван (Mucolvanum)");  
        med10.put("Пектолван Плющ (Pectolvan Hedera)", "Пектолван Плющ (Pectolvan Hedera)");  
        med10.put("Сальброксол (Salbroxolum)", "Сальброксол (Salbroxolum)");  
        med10.put("Флавамед (Flavamed)", "Флавамед (Flavamed)");  
        med10.put("Халиксол (Halixol)", "Халиксол (Halixol)");  
       
        LinkedHashMap<String, String> med11 = new LinkedHashMap<String, String>();  
        med11.put("Алтея корень (RadixAlthaeae)", "Алтея корень (RadixAlthaeae)");  
        med11.put("Аниса плоды (Fructus Anisi vulgaris)", "Аниса плоды (Fructus Anisi vulgaris)");  
        med11.put("Грудной эликсир (Elixir pectoralis)", "Грудной эликсир (Elixir pectoralis)");  
        med11.put("Кофол (сироп) (Kofol)", "Кофол (сироп) (Kofol)");  
        med11.put("Пертуссин (Pertussinum)", "Пертуссин (Pertussinum)");  
        med11.put("Пульмолор (Pulmolor)", "Пульмолор (Pulmolor)"); 
        med11.put("Сироп алтейный (SirupusAlthaeae)", "Сироп алтейный (SirupusAlthaeae)");  
        med11.put("Фиалки трава (Herba Violi)", "Фиалки трава (Herba Violi)"); 
       
        LinkedHashMap<String, String> med12 = new LinkedHashMap<String, String>();  
        med12.put("Бенатекс (Benatex)", "Бенатекс (Benatex)");  
        med12.put("Контрацептин Т (Contraceptinum Т)", "Контрацептин Т (Contraceptinum Т)");  
        med12.put("Трацептин (Traceptinum)", "Трацептин (Traceptinum)");  
        med12.put("Фарматекс (Pharmatex)", "Фарматекс (Pharmatex)");
        
        LinkedHashMap<String, String> med13 = new LinkedHashMap<String, String>();  
        med13.put("Депопровера (Depotprovera)", "Депопровера (Depotprovera)");  
        med13.put("Евра (Evra)", "Евра (Evra)");  
        med13.put("Комбинированные эстроген-гестагенсодержащие гормональные средства  ", "Комбинированные эстроген-гестагенсодержащие гормональные средства  ");  

        LinkedHashMap<String, String> med14 = new LinkedHashMap<String, String>();  
        med14.put("Гинепристон (Gynepriston)", "Гинепристон (Gynepriston)");  
        med14.put("Постинор (Postinor)", "Постинор (Postinor)");  
        med14.put("Эскапел (Escapelle)", "Эскапел (Escapelle)");  

        LinkedHashMap<String, String> med15 = new LinkedHashMap<String, String>();  
        med15.put("Амикацин (Amikacinum)", "Амикацин (Amikacinum)");  
        med15.put("Бивацин (Bivacyn)", "Бивацин (Bivacyn)");  
        med15.put("Изофра (Isofra)", "Изофра (Isofra)");  
        med15.put("Кремген (Cremgenum)", "Кремген (Cremgenum)");  
        med15.put("Неоэфрацин (Neophracinum)", "Неоэфрацин (Neophracinum)");  
        med15.put("Пасомицин (Pasomyciniun)", "Пасомицин (Pasomyciniun)");  
        med15.put("Стрептосалюзид (Streptosaluziduni)", "Стрептосалюзид (Streptosaluziduni)");  
        med15.put("Тобрамицин (Tobramycin)", "Тобрамицин (Tobramycin)");  
        med15.put("Тобрекс (Tobrex)", "Тобрекс (Tobrex)");  
        med15.put("Трофодермин (Trofodermin)", "Трофодермин (Trofodermin)");  

        LinkedHashMap<String, String> med16 = new LinkedHashMap<String, String>();  
        med16.put("Ацик (Acic)", "Ацик (Acic)");  
        med16.put("Гропринозин (Groprinosin)", "Гропринозин (Groprinosin)");  
        med16.put("Идоксуридин (Idoxuridine)", "Идоксуридин (Idoxuridine)");  
        med16.put("Иммунофлазид (Immunoflazidum)", "Иммунофлазид (Immunoflazidum)");  
        med16.put("Метисазон (Methisazonum)", "Метисазон (Methisazonum)");  
        med16.put("Оксолиновая мазь (UnguenturnOxolini)", "Оксолиновая мазь (UnguenturnOxolini)");  
        med16.put("Ремантадин (Remantadinum)", "Ремантадин (Remantadinum)");  
        med16.put("Фамвир (Famvir)", "Фамвир (Famvir)");  
        med16.put("Эпервудин (Epervudine)", "Эпервудин (Epervudine)");  

        LinkedHashMap<String, String> med17 = new LinkedHashMap<String, String>();  
        med17.put("Бепаск (Bepascum)", "Бепаск (Bepascum)");  
        med17.put("Натрия пара-аминосалицилат (Natriipara-aminoszlicylas)", "Натрия пара-аминосалицилат (Natriipara-aminoszlicylas)");  
        med17.put("Пиразинамид (Pirazinamidum)", "Пиразинамид (Pirazinamidum)");  
        med17.put("Солютизон (Soluthizonum)", "Солютизон (Soluthizonum)");  
        med17.put("Тиоацетазон (Thioacetazonum)", "Тиоацетазон (Thioacetazonum)");  
        med17.put("Этамбутол (Ethambutolum)", "Этамбутол (Ethambutolum)"); 

        LinkedHashMap<String, String> med18 = new LinkedHashMap<String, String>();  
        med18.put("Анавенол (Anavenol)", "Анавенол (Anavenol)");  
        med18.put("Венарус (Venarus)", "Венарус (Venarus)");  
        med18.put("Гинкор Гель (Ginkor gel)", "Гинкор Гель (Ginkor gel)");  
        med18.put("Курантил (Curantil)", "Курантил (Curantil)");  
        med18.put("Латрен (Latren)", "Латрен (Latren)");  
        med18.put("Мексиприм (Mexiprim)", "Мексиприм (Mexiprim)");  
        med18.put("Репарил (Reparil)", "Репарил (Reparil)");  
        med18.put("Флебодиа (Phlebodia)", "Флебодиа (Phlebodia)");
        med18.put("Эсcавен Гель", "Эсcавен Гель");
        med18.put("Эскувит (Eskuvit)", "Эскувит (Eskuvit)");
        
        LinkedHashMap<String, String> med19 = new LinkedHashMap<String, String>();  
        med19.put("Атеролип-вифор (Atherolip-vifor)", "Атеролип-вифор (Atherolip-vifor)");  
        med19.put("Аторис (Atoris)", "Аторис (Atoris)");  
        med19.put("Гемфиброзил (GemflbrozU)", "Гемфиброзил (GemflbrozU)");  
        med19.put("Ливостор (Livostor)", "Ливостор (Livostor)");  
        med19.put("Ловастатин (Lovastatin)", "Ловастатин (Lovastatin)");  
        med19.put("Ревалгин (Revalgin)", "Ревалгин (Revalgin)");  
        med19.put("Симгал (Simgal)", "Симгал (Simgal)");  
        med19.put("Торвакард (Torvacard)", "Торвакард (Torvacard)");  
        med19.put("Фенофибрат (Phenofibrate)", "Фенофибрат (Phenofibrate)");  
        med19.put("Холестирамин (Cholestyraminum)", "Холестирамин (Cholestyraminum)");  

        LinkedHashMap<String, String> med20 = new LinkedHashMap<String, String>();  
        med20.put("Авамигран (Avamigran)", "Авамигран (Avamigran)");  
        med20.put("Винканор (Vincanorum)", "Винканор (Vincanorum)");  
        med20.put("Инстенон (Instenon)", "Инстенон (Instenon)");  
        med20.put("Мексидол (Mexidolum)", "Мексидол (Mexidolum)");  
        med20.put("Оксибрал (Oxybral)", "Оксибрал (Oxybral)");  
        med20.put("Теоверин (Theoverinum)", "Теоверин (Theoverinum)");  
        med20.put("Флунаризин (Flunarizin)", "Флунаризин (Flunarizin)");  
        
        medecines.put("Галоиды, окислители и альдегиды",med1);
        medecines.put("Препараты кислот и щелочей",med2);
        medecines.put("Противомикробные и противопаразитарные лекарственные средства",med3);
        medecines.put("Гормоны гипофиза и их синтетические аналоги",med4);
        medecines.put("Гормоны коры надпочечников",med5);
        medecines.put("Лекарственные средства, влияющие на функции щитовидной и околощитовидной желез",med6);
        medecines.put("Пероральные противодиабетические лекарственные средства",med7);
        medecines.put("Лекарственные средства для лечения ринита",med8);
        medecines.put("Лекарственные средства, содержащие эфирные масла",med9);
        medecines.put("Муколитические лекарственные средства",med10);
        medecines.put("Отхаркивающие лекарственные средства",med11);
        medecines.put("Негормональные противозачаточные лекарственные средства",med12);
        medecines.put("Пероральные гормональные противозачаточные лекарственные средства",med13);
        medecines.put("Посткоитальные гормональные противозачаточные средства",med14);
        medecines.put("Антибиотики",med15);
        medecines.put("Противовирусные лекарственные средства",med16);
        medecines.put("Противотуберкулезные лекарственные средства",med17);
        medecines.put("Ангиопротекторные лекарственные средства",med18);
        medecines.put("Антисклеротические лекарственные средства",med19);
        medecines.put("Лекарственные средства, улучшающие мозговое кровообращение",med20);
        
        final RadioGroupItem CategoriesRad = new RadioGroupItem();  
        CategoriesRad.setShowTitle(false);  
        CategoriesRad.setValueMap(CategoriesMap);  
        CategoriesRad.setDefaultValue(step1); 
        CategoriesRad.setWidth(500);

        final RadioGroupItem categRad = new RadioGroupItem();  
        categRad.setShowTitle(false);   
        
        final RadioGroupItem medecRad = new RadioGroupItem();  
        medecRad.setShowTitle(false);   
          
        form4.setFields(CategoriesRad);
        
        final IButton next = new IButton();
        next.setTop(300); next.setLeft(350);
        next.setTitle("Выбрать");
        next.addClickHandler(new com.smartgwt.client.widgets.events.ClickHandler() {
        	public void onClick(com.smartgwt.client.widgets.events.ClickEvent event) {
        		
        		if (form4.isVisible()){
        			selectedItem = (String) CategoriesRad.getValue();
        			form4.hide();
        			form41.show();
        			categRad.setValueMap(categories.get(selectedItem));
        			form41.setFields(categRad);
        			
        			label41.setContents(selectedItem);
        		}
        		else if(form41.isVisible()) {
        			selectedItem = (String) categRad.getValue();
        			form41.hide();
        			form42.show();
        			medecRad.setValueMap(medecines.get(selectedItem));
        			form42.setFields(medecRad);
        			label41.setContents(null);
        			label41.setContents(selectedItem);
    			}
        		else if(form42.isVisible()){
        			label4.show();
        			label4.setContents("Вы выбрали " + (String) medecRad.getValue() + " Описание: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        		}
        		
        	}
        });
        
        final IButton previous = new IButton();
        previous.setTop(300); previous.setLeft(200);
        previous.setTitle("Назад");
        previous.addClickHandler(new com.smartgwt.client.widgets.events.ClickHandler() {
        	public void onClick(com.smartgwt.client.widgets.events.ClickEvent event) {
        		if(form41.isVisible()) {
        			form41.hide();
        			form4.show();
        			label41.setContents("");
    			}
        		else if(form42.isVisible()){
        			form42.hide();
        			form41.show();
        			label4.hide();
        		}
        	}
        }); 
        label4.setStyleName("labels2");
        label41.setStyleName("labels2");
        label4.draw();
        label41.draw();
        VStack vStack4 = new VStack();
        HStack hStack4 = new HStack(); 
        vStack4.setWidth("100%");
        vStack4.addMember(label41);
        vStack4.addMember(form4);vStack4.addMember(form41);vStack4.addMember(form42);
        hStack4.addMember(next);
        hStack4.addMember(previous);
        hStack4.setMembersMargin(5);
        vStack4.addMember(hStack4);
        vStack4.addMember(label4);
        vStack4.setMembersMargin(5);
        tTab4.setPane(vStack4);
        
        Canvas tabPane4 = new Canvas();  
        tabPane4.addChild(vStack4);
        form4.draw();  
        tTab4.setPane(tabPane4);


  
        topTabSet.addTab(tTab1);  
        topTabSet.addTab(tTab2);  
        topTabSet.addTab(tTab3);  
        topTabSet.addTab(tTab4);  
  
       
  
        
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
