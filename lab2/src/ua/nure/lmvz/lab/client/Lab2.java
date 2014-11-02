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
import com.smartgwt.client.types.Alignment;  
import com.smartgwt.client.types.ListGridFieldType;  
import com.smartgwt.client.widgets.Canvas;  
import com.smartgwt.client.widgets.form.DynamicForm;  
import com.smartgwt.client.widgets.form.fields.CheckboxItem;  
import com.smartgwt.client.widgets.form.fields.events.ChangeEvent;  
import com.smartgwt.client.widgets.form.fields.events.ChangeHandler;  
import com.smartgwt.client.widgets.grid.ListGrid;  
import com.smartgwt.client.widgets.grid.ListGridField;  
import com.smartgwt.client.widgets.layout.VLayout;  
import ua.nure.lmvz.lab.client.CountrySampleData;  

  
public class Lab2 implements EntryPoint {  
  
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
  
        final TabSet topTabSet = new TabSet();  
        topTabSet.setTabBarPosition(Side.TOP);  
        topTabSet.setWidth(700); 
        topTabSet.setHeight(400);
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
  
        IPickTreeItem departmentItem1 = new IPickTreeItem();  
        departmentItem1.setTitle("Выберите лекарство");  
        departmentItem1.setValueField("name");  
        departmentItem1.setValueTree(tree);  
        Tab tTab1 = new Tab("Интерфейс №1: \"Дерево\"");
        form.setItems(departmentItem1);
        tTab1.setPane(form);
        
        Tab tTab2 = new Tab("Интерфейс №2: \"Зависимые combobox\"");
        final DynamicForm form2 = new DynamicForm();  
        form2.setWidth(500);  
        form2.setNumCols(4);  
        
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
        
        SelectItem departmentItem = new SelectItem(); //second checkbox 
        departmentItem.setName("department");  
        departmentItem.setTitle("Выберите подгруппу");  
        departmentItem.setAddUnknownValues(false);  
        SelectItem departmentItem3 = new SelectItem();  //third checkbox
        departmentItem3.setName("health");  
        departmentItem3.setTitle("Выберите препарат");  
        departmentItem3.setAddUnknownValues(false);  
        departmentItem.addChangeHandler(new ChangeHandler() {  
            public void onChange(ChangeEvent event) {  
                String selectedItem = (String) event.getValue();  
                form2.getField("health").setValueMap(departments2.get(selectedItem));  
            }  
        });
        form2.setItems(divisionItem, departmentItem, departmentItem3);  
  
        form2.draw();  
        tTab2.setPane(form2);
        Tab tTab3 = new Tab("Интерфейс №3: \"Таблица\"");
        final ListGrid countryGrid = new ListGrid();  
        countryGrid.setWidth(500);  
        countryGrid.setHeight(224);  
        countryGrid.setShowAllRecords(true);  
        countryGrid.setAlternateRecordStyles(true);  
  
        ListGridField nameField = new ListGridField("Name", "Название преперата");  
        ListGridField descriptionField = new ListGridField("description", "Описание");
        countryGrid.setFields(nameField, descriptionField);
        countryGrid.setCanResizeFields(true);  
        countryGrid.setData(CountrySampleData.getRecords());  
        
        tTab3.setPane(countryGrid);
        
        Tab tTab4 = new Tab("РўР°Р±Р»РёС†Р°");  
        Tab tTab5 = new Tab("Р§РµРєР±РѕРєСЃС‹");
  
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
