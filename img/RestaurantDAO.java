import java.util.ArrayList;
import java.util.List;

public class RestaurantDAO {

    public static void init(FoodDeliveryApp app) {

        Category korean = new Category("�ѽ�");
        Category chinese = new Category("�߽�");
        Category japanese = new Category("�Ͻ�");
        Category western = new Category("���");
        Category chicken = new Category("ġŲ");
        Category snackFood = new Category("�н�");
        Category fastFood = new Category("�н�ƮǪ��");
        Category meat = new Category("���");
        Category cafe = new Category("ī��/����Ʈ");

        //�ѽ� �޴� �߰�
        Restaurant koreanRestaurant1 = new Restaurant("���̵���", 4.2, 2.0, 2000);
        koreanRestaurant1.addMenu(new Menu("�Ұ�� ����",9000,"����ϰ� �ÿ��� ���� �ŷ����� �Ұ�⹫��"));
        koreanRestaurant1.addMenu(new Menu("��ġ��(2��)",22000,"�䵵�� ������� ��ġ��"));
        koreanRestaurant1.addMenu(new Menu("����(��)",30000,"�⳻���� ������ ����"));
        koreanRestaurant1.addMenu(new Menu("��������(��)",27000,"������ �ҵ� ���� ����Ų�ٴ� ������ ���� ��������"));

        Restaurant koreanRestaurant2 = new Restaurant("��ǰ��������", 4.9,2.5,3000);
        koreanRestaurant2.addMenu(new Menu("�������屹",11000,"�İ��� ���� ������� ����, ������� ȯ������"));
        koreanRestaurant2.addMenu(new Menu("���ٱ����屹",12000,"���� ���� ����� ���߿������ ����"));
        koreanRestaurant2.addMenu(new Menu("��������",11000,"���� ���� ����� ���� ��������"));
        koreanRestaurant2.addMenu(new Menu("���챹��",12000,"�ε巴�� �������� ����� ���"));

        Restaurant koreanRestaurant3 = new Restaurant("�����ջ����", 5.0,1.2,1500);
        koreanRestaurant3.addMenu(new Menu("�����", 17000,"�ﺹ���� �̱�� ���� ����!"));
        koreanRestaurant3.addMenu(new Menu("�ѹ�����", 20000,"������ ���� ���� �� ���� ��!"));
        koreanRestaurant3.addMenu(new Menu("���������",25000,"������ ������� ������ ���ǿ�!"));
        koreanRestaurant3.addMenu(new Menu("�̻����",20000,"���� ���� �е鿡�� ��õ!"));

        Restaurant koreanRestaurant4 = new Restaurant("������", 3.9, 1.5,1000);
        koreanRestaurant4.addMenu(new Menu("�����ܰ�", 31000,"�̽��� �����θ� ����!"));
        koreanRestaurant4.addMenu(new Menu("�������ȸ",35000,"�̽��ϰ� ���� ���� ������� �����ַε� ����!"));
        koreanRestaurant4.addMenu(new Menu("�ع�����",22000,"����ϰ� �ٻ��� ������ �ʱ��ʱ� �ع��� ���!"));
        koreanRestaurant4.addMenu(new Menu("1�� ��������(������)",22000, "�̽��� �������� �԰� ������!"));

        Restaurant koreanRestaurant5 = new Restaurant("�ڰ��δ�&ġ�� �߰��� ����2����", 4.0,2.0,2000);
        koreanRestaurant5.addMenu(new Menu("1�� �δ�� ���ö�",11500,"��������� ���� �������� ��ǰ��!"));
        koreanRestaurant5.addMenu(new Menu("(����)�ѿ� ��������", 16000,"100% ���� �ߴٸ����� ��ū �ߺ������� ����� ��â���� ��ǰ �������� ����!"));
        koreanRestaurant5.addMenu(new Menu("�����ܺδ��",13500,"�پ��ϰ� ��� �� �ִ� ���ִ� ������"));
        koreanRestaurant5.addMenu(new Menu("�ѵ� ��ġ�",10000, "������ ���� ���� ���� �����ġ�� ������ �������� ǫ ���� ��ġ�"));

        //�ѽ� ī�װ��� ������ �߰�
        korean.addRestaurant(koreanRestaurant1);
        korean.addRestaurant(koreanRestaurant2);
        korean.addRestaurant(koreanRestaurant3);
        korean.addRestaurant(koreanRestaurant4);
        korean.addRestaurant(koreanRestaurant5);

        //�߽� �޴� �߰�
        Restaurant chineseRestaurant1 = new Restaurant("�Ḯ������ ���빮��",5.0,2.1,2500);
        chineseRestaurant1.addMenu(new Menu("��ǥ ������", 9900, "����! ������ ���ּ���!!"));
        chineseRestaurant1.addMenu(new Menu("�Ҹ� ���󼧱�", 15900, "�ϵ��� �Ҹ��� �˾�?!"));
        chineseRestaurant1.addMenu(new Menu("��ٷο�", 12900, "���޹ٻ� ��ٷο�!"));
        chineseRestaurant1.addMenu(new Menu("�����캺����", 7000, "�߱��丮�� ó�� �Դ´ٸ� �̰ͺ���!"));

        Restaurant chineseRestaurant2 = new Restaurant("��ȭ", 4.7, 1.1, 1000);
        chineseRestaurant2.addMenu(new Menu("�Ｑ«��", 12000, "«���� �������� ����!"));
        chineseRestaurant2.addMenu(new Menu("������",38000,"������ �ҽ��� ����� ������ ���츦 ����;�?"));
        chineseRestaurant2.addMenu(new Menu("��¥��",9000,"������� ¥���� ���Ҷ�?"));
        chineseRestaurant2.addMenu(new Menu("�Ｑ��¥��", 11000, "�̽��� �ػ깰�� ¥���� �����̶�.."));

        Restaurant chineseRestaurant3 = new Restaurant("�����粿ġ", 4.9, 1.5,1500);
        chineseRestaurant3.addMenu(new Menu("�粿ġ(10��ġ)",16000, "Ư���� ��⸦ �԰� ������?"));
        chineseRestaurant3.addMenu(new Menu("�簥���(10��ġ)",19000, "����ġ ������ �̰͵� �Ծ������!"));
        chineseRestaurant3.addMenu(new Menu("��������", 18000, "������⸦ ä�� �� ����(÷��)���� ���� ��, ����, �ǵκο� �Բ� �Դ� �߱� ����¡�� ���� �丮"));
        chineseRestaurant3.addMenu(new Menu("���Ｑ", 17000, "������ ���� �ż��� 3������ ä�ҵ�� ���� �丮!"));

        Restaurant chineseRestaurant4 = new Restaurant("ȫ�����0410 ���з���", 4.5, 1.4,2100);
        chineseRestaurant4.addMenu(new Menu("��ǳ����", 20900,"�˽��� û����߿� ��ǳ�ҽ�! ����ϰ� �ſ� ���� ������ �����̶�.."));
        chineseRestaurant4.addMenu(new Menu("[1�κ�]���� �̴������� ��Ʈ",21800, "¥��� �ϸ� �ٷ� �������� ��.."));
        chineseRestaurant4.addMenu(new Menu("���«��(�� ��������)", 10500,  "������ �� «���� ��Ģ����!"));
        chineseRestaurant4.addMenu(new Menu("¥���", 7000, "�߽�Ư���� ������ ������ ��ǰ ¥���" ));
        chineseRestaurant4.addMenu(new Menu("����¥��", 8500, "���� ����� ¥��鿡 û����߷� �ƻ��� �İ��� �������� �츰 ����¥��" ));
        chineseRestaurant4.addMenu(new Menu("���¥��(2�κ�)", 17000, "���̼� ���ְ�" ));
        chineseRestaurant4.addMenu(new Menu("¥���(��������)", 9500, "«�ͱ��� 1�� �⺻ ����" ));

        Restaurant chineseRestaurant5 = new Restaurant("��ȭ�� ������", 4.9, 2.0, 2000);
        chineseRestaurant5.addMenu(new Menu("������",10000,"����� �ϸ� �ٷ� ��!"));
        chineseRestaurant5.addMenu(new Menu("���󼧱�",15000,"������ �ϸ� ���� �������� �༮.."));
        chineseRestaurant5.addMenu(new Menu("���캺����",7000,"���� �ְ� ���ƺ���!"));
        chineseRestaurant5.addMenu(new Menu("������",7000,"�ѱ��ε鿡�� ģ���� �����ϸ�?"));

        //�߽� ī�װ��� ������ �߰�
        chinese.addRestaurant(chineseRestaurant1);
        chinese.addRestaurant(chineseRestaurant2);
        chinese.addRestaurant(chineseRestaurant3);
        chinese.addRestaurant(chineseRestaurant4);
        chinese.addRestaurant(chineseRestaurant5);

        //�Ͻ� �޴� �߰�
        Restaurant japaneseRestaurant1 = new Restaurant("�����[���α�û��]", 4.9,1.8,2000);
        japaneseRestaurant1.addMenu(new Menu("�����ʹ�",32000 ,"������ ��� ��� �ʹ�"));
        japaneseRestaurant1.addMenu(new Menu("�����ʹ�",20000 ,"�ʱ��ϸ鼭 �ε巯�� �İ�"));
        japaneseRestaurant1.addMenu(new Menu("Ȱ���ʹ�",22000 ,"��� �ִ� ������ �ٷν� �ʹ�"));
        japaneseRestaurant1.addMenu(new Menu("������(����)",39000 ,"�� ���� ���̿� ���� ���� ����ó�� �� �ִ� ȸ"));

        Restaurant japaneseRestaurant2 = new Restaurant("���������[����Ÿ����]",4.9, 2.2,3000);
        japaneseRestaurant2.addMenu(new Menu("��ǰ��ī��ī��",13900,"���̶��̽� ������ �������� ���� ī��"));
        japaneseRestaurant2.addMenu(new Menu("�˻���&�����������",17600,"�ʱ��� ����� ī���� ���Ƕ��̽���!"));
        japaneseRestaurant2.addMenu(new Menu("ġ��in�ν��ī��",14100,"ġ���� ¬������ ���� ī���� ����!"));
        japaneseRestaurant2.addMenu(new Menu("����ī��ư�&����ī���쵿",15800,"�ٻ��� ī��ưԿ� ��Ⱑ ����ִ� ī���쵿"));

        Restaurant japaneseRestaurant3 = new Restaurant("�ƿ��������Ҹ�[��ȭ����Ʈ����]", 4.5,2.2,2500);
        japaneseRestaurant3.addMenu(new Menu("�ƿ������������",11000,"12�ð� �������� ���� ����� ��.��� ��� ������ ����"));
        japaneseRestaurant3.addMenu(new Menu("�ƿ����̼Ҷ��",11000,"12�ð� ��������� ��.��� ���� ������� ���� ����"));
        japaneseRestaurant3.addMenu(new Menu("�ƿ���������",12000,"�Ұ��� �پ��� ���� ���� �ҽ��� �޹��� �� ����"));
        japaneseRestaurant3.addMenu(new Menu("��Ʈ1. �ƿ��� ��������� + TKG(��������) + ����",16500,"�������� ������ ���� �츰 ������������ ���� �ƿ��� ��������� + TKG(��������) + ����"));

        Restaurant japaneseRestaurant4 = new Restaurant("�Ĵ���", 5.0,2.2,2000);
        japaneseRestaurant4.addMenu(new Menu("����(����Ƣ�赤��)",9500,"�ջ���, �߻���, ����, ���, ����ҽ� "));
        japaneseRestaurant4.addMenu(new Menu("�ٵ�(���Ƣ�赤��)",10000,"��ȣ��, ����, ����, ����, ������, ��, �ջ���"));
        japaneseRestaurant4.addMenu(new Menu("���ɵ�(�������)",12000,"�븣���� ������, ���ͻ��, �谡��"));
        japaneseRestaurant4.addMenu(new Menu("�쳪�⵿(����)",14000,"���, ����ҽ�, �ʻ���"));

        Restaurant japaneseRestaurant5 = new Restaurant("���������",4.9,3.0,2000 );
        japaneseRestaurant5.addMenu(new Menu("�Ҹ����� ����",3800,"��ȭ�� ��¦ ���� ����� ������ �ҽ��� ���̵� ���ι�"));
        japaneseRestaurant5.addMenu(new Menu("�ѿ���ȸ����",4300,"����� �ѿ츦 ����� ���⸧�� ���� �� ����԰� ���� ������ ����"));
        japaneseRestaurant5.addMenu(new Menu("���ް������� ����",3800,"�ʱ��� �İ��� ����ִ� ���쿡 û������� �����԰� ������ �Խθ�"));
        japaneseRestaurant5.addMenu(new Menu("����Ÿ�ٳ� ����",4300,"û�� �븣���� �� ���丮��� ��� �Ҹ�"));

        //�Ͻ� ī�װ��� ������ �߰�
        japanese.addRestaurant(japaneseRestaurant1);
        japanese.addRestaurant(japaneseRestaurant2);
        japanese.addRestaurant(japaneseRestaurant3);
        japanese.addRestaurant(japaneseRestaurant4);
        japanese.addRestaurant(japaneseRestaurant5);

        //��� �޴� �߰�
        Restaurant westernRestaurant1 = new Restaurant("�Ľ�Ÿ�Դϴ�[������]", 4.9, 1.1, 1000);
        westernRestaurant1.addMenu(new Menu("���� �Ľ�Ÿ(��¦����)",11900,"���� ���� �������� ��ҳ־� �ÿ��ϰ� ��ĥ���� Ȯ���� ���� �Ľ�Ÿ"));
        westernRestaurant1.addMenu(new Menu("���� ũ�� �Ľ�Ÿ",15300,"�������� ���� 2������ �� �������� ����� ������ ũ���ҽ� �Ľ�Ÿ"));
        westernRestaurant1.addMenu(new Menu("���� �˸����ø��� �Ľ�Ÿ",10900,"���㿡 �������� ���� ���� ǳ�̰� ���� ǻ���� �˸����ø���"));
        westernRestaurant1.addMenu(new Menu("�ѱ� K���� �Ľ�Ÿ(�ٴ��ٴ�)",11900,"�񿣳� �Ҽ����� 4�볪 �� �̻� K���� �Ľ�Ÿ"));

        Restaurant westernRestaurant2 = new Restaurant("��������", 4.7, 1.2, 1500);
        westernRestaurant2.addMenu(new Menu("ī��Ÿ�� Ÿ�� 3ps",14900,"�پ��� ��ŷ�� �������ֽ��� �־� ���� �� �׸��鿡 ������ ������� Ÿ��"));
        westernRestaurant2.addMenu(new Menu("�ٹ��ھ� Ÿ�� 3ps",18900,"ġ����, ����, ����, �븶��, ���� ���� ��ŷḦ �ְ� ������ �Ұ�� Ÿ��"));
        westernRestaurant2.addMenu(new Menu("���ַ�",11900,"��������� ������ �־� �ε巴�� ������ ������ �߽��� ���� �����丮"));
        westernRestaurant2.addMenu(new Menu("Ÿ�ڹ�Ʈ ŸŰ�佺",18000,"Ÿ�ڽ������ ������ ���� �Ұ�⸦ �ܶǶ�ƿ� ���� �ٻ��ϰ� Ƣ�ܳ� �丮"));

        Restaurant westernRestaurant3 = new Restaurant("�Ǽ���[û��õ��]",5.0,0.5,1000);
        westernRestaurant3.addMenu(new Menu("�ϸ� �ζ�Ÿ",19900,"�ϸ�+�ζ�Ÿ+ ������� ���� ôô"));
        westernRestaurant3.addMenu(new Menu("�ƶ���Ÿ ������",14500,"�ƶ��Ƶ� �ҽ��� �ػ깰�� ��췯�� ������ ������"));
        westernRestaurant3.addMenu(new Menu("�׸��� �ҽ���, ����Ƣ��",18900,"��, ũ��, ������ �� �ε巯�� ũ�� �Ľ�Ÿ"));
        westernRestaurant3.addMenu(new Menu("���ʺ� �Ľ�Ÿ",13500,"��ö�� ����丶�� ���ʺ� �� �Ľ�Ÿ"));

        Restaurant westernRestaurant4 = new Restaurant("����ϵ���[�ͼ���]", 5.0,1.2,2000);
        westernRestaurant4.addMenu(new Menu("CARNITAS TACO ��ϵ���",5000,"�ܶǶ�ƿ� ���� �������� ���� ����� �ö� �߽�ĭ Ǫ��"));
        westernRestaurant4.addMenu(new Menu("FAJITA SALAD ����Ÿ ������",17900,"�׸����� ���� ������ũ�� ġŲ�� �Բ� �����Ǵ� ������"));
        westernRestaurant4.addMenu(new Menu("SHRIMP TACO ������",6500,"�ܶǶ�ƿ� ����� ���� ��ä, ����� �ö� �߽�ĭ ���� Ǫ��"));
        westernRestaurant4.addMenu(new Menu("FAJITA CHICKEN ����Ÿ ġŲ ������",14900,"�жǶ�ƿ� ġ��� �׸��� ���� �߰������� �־� �ݴ޸������ ��� �޴�"));

        Restaurant westernRestaurant5 = new Restaurant("���ο�Ķ��[������]",4.8,1.0,1500);
        westernRestaurant5.addMenu(new Menu("Ŭ���� ���� ����",12500,"Ư�� ���� ���̽��� Ŭ���� �ҽ��� ��췯�� ����"));
        westernRestaurant5.addMenu(new Menu("�����̽� ���� ����",12500,"�������� ���� ���̽��� ��ĥ�� ���� ������ �ҽ��� ��췯�� ����"));
        westernRestaurant5.addMenu(new Menu("������ ġŲ ����",11500,"���Ϸ���ǳ�� ������ ������ �ҽ��� �ߴٸ���"));
        westernRestaurant5.addMenu(new Menu("�߰����� ���� ����",11500,"��ܹ��� �߰�����, ����� ���ο�Ķ�� ���̼ҽ��� ��ĥ���� ���� ����"));

        //��� ī�װ��� ������ �߰�
        western.addRestaurant(westernRestaurant1);
        western.addRestaurant(westernRestaurant2);
        western.addRestaurant(westernRestaurant3);
        western.addRestaurant(westernRestaurant4);
        western.addRestaurant(westernRestaurant5);

        //ġŲ �޴� �߰�
        Restaurant chickenRestaurant1 = new Restaurant("BHC ���빮��",4.8,2.0,2000);
        chickenRestaurant1.addMenu(new Menu("�Ѹ�Ŭ",21000,""));
        chickenRestaurant1.addMenu(new Menu("HOT �Ķ��̵�",21000,""));
        chickenRestaurant1.addMenu(new Menu("�ٻ�Ŭ",18000,"�ٻ���!!"));
        chickenRestaurant1.addMenu(new Menu("����ŷ(����¬©)",21000,""));

        Restaurant chickenRestaurant2 = new Restaurant("����ġŲ ����1ȣ��", 4.9, 0.1, 1000);
        chickenRestaurant2.addMenu(new Menu("���� ��������(�Ѹ���)",20000,"������ û�� ȫ������ ������"));
        chickenRestaurant2.addMenu(new Menu("���̿�������Ƚ�",23000,""));
        chickenRestaurant2.addMenu(new Menu("����������",19000,"���ð���ҽ��� �������� ������!!"));
        chickenRestaurant2.addMenu(new Menu("��ϰ���������",19000,""));

        Restaurant chickenRestaurant3 = new Restaurant("BBQ ����������",4.9,0.1,1000);
        chickenRestaurant3.addMenu(new Menu("Ȳ�ݿø���ġŲ",23000,""));
        chickenRestaurant3.addMenu(new Menu("�ڸ���ī �Ҷ�����ġŲ",24000,""));
        chickenRestaurant3.addMenu(new Menu("����ġŲ",24000,"BBQ Ư�� ĭǳ�ҽ��� ����� ����, ���߱��� ��鿩 ���� ���� �Ҹ�"));
        chickenRestaurant3.addMenu(new Menu("ũ��ġ ����ũ��Ŀ",24000,"������ ũ���� ���� �ٻ��ϰ�!"));

        Restaurant chickenRestaurant4 = new Restaurant("�ڴ�ġŲ",4.7, 1.0,1500);
        chickenRestaurant4.addMenu(new Menu("�ʽ�������ġŲ",25000,"���� ����ҽ��� û����߰� ���Կ� �� �Ա� ����!"));
        chickenRestaurant4.addMenu(new Menu("�Ӵ���ġŲ",23000,"�Ҵ߼ҽ��� �������� �ҽ��� ũ���õ� �������۱��� ������ ���ְ� �ſ��"));
        chickenRestaurant4.addMenu(new Menu("��Ƣ��ġŲ",23000,"��ϰ����ҽ�, ���� �ķ���ũ �����, �ٻ��� �븶�� ����"));
        chickenRestaurant4.addMenu(new Menu("�Һ���ġŲ",20000,"�÷Ϻ��� �ٻ��� Ƣ���"));

        Restaurant chickenRestaurant5 = new Restaurant("�ٸ�ġŲ ��������", 4.7, 1.4,2000);
        chickenRestaurant5.addMenu(new Menu("���̹ٻ�",19000,"�ٸ�ġŲ���� Ư���� 3C�������� �� �ٻ���!"));
        chickenRestaurant5.addMenu(new Menu("�����̹ٻ�",21900,""));
        chickenRestaurant5.addMenu(new Menu("ġŲ��",17900,""));
        chickenRestaurant5.addMenu(new Menu("������ġŲ",21900,"����ҽ��� �� �������� �İ��� �츰!"));

        //ġŲ ī�װ��� ������ �߰�
        chicken.addRestaurant(chickenRestaurant1);
        chicken.addRestaurant(chickenRestaurant2);
        chicken.addRestaurant(chickenRestaurant3);
        chicken.addRestaurant(chickenRestaurant4);
        chicken.addRestaurant(chickenRestaurant5);

        //�н� �޴� �߰�
        Restaurant snackFoodRestaurant1 = new Restaurant("����������",4.8,1.5,2000);
        snackFoodRestaurant1.addMenu(new Menu("���� ������",5000,"�������� �ҽ��� �Ҷ� �������� �˵���"));
        snackFoodRestaurant1.addMenu(new Menu("(�԰浵 �ƹ��̽�) ������",5500,"����ϰ� �̱��̱� ���"));
        snackFoodRestaurant1.addMenu(new Menu("(���彺Ÿ��) �������",4200,"�ѹ� ������ ���� �� ����~"));
        snackFoodRestaurant1.addMenu(new Menu("(���ϻ��⸧) ���Ƣ��",4700,"�ٻ�ٻ� ����³� ��������..."));

        Restaurant snackFoodRestaurant2 = new Restaurant("���װŸ� �ʹ��",4.9, 1.3, 1500);
        snackFoodRestaurant2.addMenu(new Menu("���Ҳʹ��",1000,"�̱��̱� �ǰ��� ���Ҳʹ��"));
        snackFoodRestaurant2.addMenu(new Menu("���ҼҼ����ֵ���",2500,"�̱��� ���Ҿȿ� �������� �Ҽ���"));
        snackFoodRestaurant2.addMenu(new Menu("���ҵ���(�ϵ���ӱ�)",1000,"���Ұ���� �����Ͽ� Ƣ�� ���Ӿȿ� �ϵ���ӱ��� ���"));
        snackFoodRestaurant2.addMenu(new Menu("���Ҵ��ϵ���",1500,"�̱��̱��� �İ��� �ŷ����� ���ϵ���"));

        Restaurant snackFoodRestaurant3 = new Restaurant("������[�λ絿��]",4.7,1.1,1000);
        snackFoodRestaurant3.addMenu(new Menu("���߳��̱��",6000,"�����Ǵ� �ͻ�� ������ ���ϸ� �ʹ����� ���Ǽ� �ֽ��ϴ�"));
        snackFoodRestaurant3.addMenu(new Menu("������",6000,"�ͻ�� ���� �������� �ʽ��ϴ�"));
        snackFoodRestaurant3.addMenu(new Menu("���Ա��",6000,"������ �β��� ������ ��"));
        snackFoodRestaurant3.addMenu(new Menu("�߰���",22000,"�ſ���߰� �� ĮĮ�� �߰���"));

        Restaurant snackFoodRestaurant4 = new Restaurant("����ֵ���",4.8,0.7,1000 );
        snackFoodRestaurant4.addMenu(new Menu("��� �ֵ���",2300,"�Ұ��縦 �־� �̱����� ���� ��� �������� �ֵ���"));
        snackFoodRestaurant4.addMenu(new Menu("�������¥ �ֵ���",3800,"100% ��¥����ġ� ����ϰ� �ٻ��� ���ڰ� ��췯�� ��޽������� ���� �ֵ���"));
        snackFoodRestaurant4.addMenu(new Menu("�ػ罺 �ֵ���",4500,"���� ����� Ź���� ǳ�̸� �ڶ��ϴ� �̱��� �򽽺� �ҽ����� ¬©�� ���۷δ�"));
        snackFoodRestaurant4.addMenu(new Menu("���¥ �ֵ���",3100,"ó������ ������ ���� ��¥����ġ���� ǳ�̸� ���� �� �ִ� �ֵ���"));

        Restaurant snackFoodRestaurant5 = new Restaurant("���÷� �� ������ ��Ѱ� ������", 4.9,2.1,2000 );
        snackFoodRestaurant5.addMenu(new Menu("������",6500,"���� �̾� �˵��� �밡�������� ���� �ʴ޴� ������ �Ҷ�����"));
        snackFoodRestaurant5.addMenu(new Menu("�λ겿ġ���� 3��",4500,"������ � ��ġ 3���� ����ϰ� ����� �����"));
        snackFoodRestaurant5.addMenu(new Menu("������¡��Ƣ�� 2��",3000,"����¬���ϰ� �ٻ��� Ƣ����� ���� ������¡��Ƣ��"));
        snackFoodRestaurant5.addMenu(new Menu("������ɵ��",12500,"������ ���� ����� �� ���"));

        //�н� ī�װ��� ������ �߰�
        snackFood.addRestaurant(snackFoodRestaurant1);
        snackFood.addRestaurant(snackFoodRestaurant2);
        snackFood.addRestaurant(snackFoodRestaurant3);
        snackFood.addRestaurant(snackFoodRestaurant4);
        snackFood.addRestaurant(snackFoodRestaurant5);

        //�н�ƮǪ�� �޴� �߰�
        Restaurant fastFoodRestaurant1 = new Restaurant("����ũ��",4.9,1.4,1000);
        fastFoodRestaurant1.addMenu(new Menu("����ũ��",12100,"���� ��� Ĩ���� ������, ü������, ������Ƽ, ���ҽ��� ���ε�!"));
        fastFoodRestaurant1.addMenu(new Menu("������",9700,"������Ƽ, �丶��, �����, ���ҽ��� ���ε� ġ�����"));
        fastFoodRestaurant1.addMenu(new Menu("�� ����",16500,"������Ƽ, ������Ƽ�� �Բ� �丶��, �����, ���ҽ��� ���ε� ġ�����"));
        fastFoodRestaurant1.addMenu(new Menu("ġŲ��",9000,"�߰��� ���� �����, ��Ŭ, ��� ���� �ҽ��� ���ε� ġŲ����"));

        Restaurant fastFoodRestaurant2 = new Restaurant("��ǳ���� ���ڽ��� ������",4.7,2.5,2000);
        fastFoodRestaurant2.addMenu(new Menu("88���۷δ�",16900,"�߾��� ���۷δ� ����.."));
        fastFoodRestaurant2.addMenu(new Menu("��ü��ġ�� ������",16900," ���� ü��ġ�� ���, ¬�߹ٻ� �������� ����"));
        fastFoodRestaurant2.addMenu(new Menu("�㸮���ΰ��",21900,"���� ȸ������ ������ ��ǳ! ���ڽ����� �ñ״�ó!!"));
        fastFoodRestaurant2.addMenu(new Menu("���� ��������",21900,"����� �� ������ ��������!! ���������� BOSS!!"));

        Restaurant fastFoodRestaurant3 = new Restaurant("������ ������", 4.5,0.7,1000);
        fastFoodRestaurant3.addMenu(new Menu("��Ż���� ��Ƽ(15cm��Ʈ)",9700,"�ܰ� �丶�� ��ä���� ���ε� Ǫ���� �ѳ�!"));
        fastFoodRestaurant3.addMenu(new Menu("������ũ & ġ��(15cm��Ʈ)",11000,"������ũ�� ġ���� ȯ�� ����!"));
        fastFoodRestaurant3.addMenu(new Menu("�ν�Ʈ ġŲ(15cm��Ʈ)",10300,"���쿡 ���� ����� �߰����� ġŲ ��Ƽ"));
        fastFoodRestaurant3.addMenu(new Menu("��Ƽ���� �ٺ�ť ġŲ(15cm��Ʈ)",10300,"�߰������ �ٸ����� �����̸��� ������ ������ ġŲ"));

        Restaurant fastFoodRestaurant4 = new Restaurant("�̻��佺Ʈ ������ī����",4.7,1.3,1500);
        fastFoodRestaurant4.addMenu(new Menu("�ܽ���� �佺Ʈ",4000,"�� ġ� ����� ������ ǳ��!"));
        fastFoodRestaurant4.addMenu(new Menu("������ �������� ����",5600,"�ؽú���, ������, ġ��� ������!"));
        fastFoodRestaurant4.addMenu(new Menu("���� ũ��ġ ġŲ",5300,"��ߴٸ��� ġŲ�� ��§ ��ϼ��̼ҽ�, ũ��ġ �Ƹ���� ��ȭ"));
        fastFoodRestaurant4.addMenu(new Menu("��ũ���� �����¥",5200,"��ũ����� ��, ���� ��¥������ �ε巯��!"));

        Restaurant fastFoodRestaurant5= new Restaurant("����׶� ������",4.4,1.0,1500);
        fastFoodRestaurant5.addMenu(new Menu("���ø��� ���� SINGLE",11900,"Ȩ���̵� �Ұ�� 100% ��Ƽ, ����ġ�� ����!"));
        fastFoodRestaurant5.addMenu(new Menu("�� ��콺 ���� DOUBLE (�߰� �ſ��)",16400,"Ȩ���̵� �Ұ�� 100% ��Ƽ, �Ƹ޸�ĭ ġ��, �Ҷ��Ǵ�ǻ�� (����)"));
        fastFoodRestaurant5.addMenu(new Menu("��߶�� ���̽�",16500,"������ �����̽��� ġŲ, ���츦 ��� �Բ� �丮�� ������ ���ν� ��߶��"));
        fastFoodRestaurant5.addMenu(new Menu("�������ֳ� ġŲ ����",11000,"���͹�ũ�� Ư�� �Ŀ���� Ƣ�ܳ� ������ ��Ÿ�� ġŲ����"));

        //�н�ƮǪ�� ī�װ��� ������ �߰�
        fastFood.addRestaurant(fastFoodRestaurant1);
        fastFood.addRestaurant(fastFoodRestaurant2);
        fastFood.addRestaurant(fastFoodRestaurant3);
        fastFood.addRestaurant(fastFoodRestaurant4);
        fastFood.addRestaurant(fastFoodRestaurant5);

        //��� �޴� �߰�
        Restaurant meatRestaurant1 = new Restaurant("������ ����ѻ�[�����]",4.9,2.4,2000);
        meatRestaurant1.addMenu(new Menu("���� ���� ���ִ� ��⸸ 500g(����, �Ұ�� ����)",18900,"only ��⸸ �ʿ��Ͻ� �е��� ���ؼ� �غ��߽��ϴ�."));
        meatRestaurant1.addMenu(new Menu("����� ��ū ��ġ� (��) + ��̹�(ȥ�似Ʈ)",9900,"����� ��ū ��ġ� + ��̹�"));
        meatRestaurant1.addMenu(new Menu("������ ������ 400g",23900,"������ 400g + �ҽ�����1"));
        meatRestaurant1.addMenu(new Menu("������ �Ǽ� ����ѻ�(ȥ������)����� ���� 1~2�κ�",29900,"��⼱�� + ��¥���� ��ġ�� + ǰ������ ��ȸ + ������� + ���̳��� + �κα�ġ"));

        Restaurant meatRestaurant2 = new Restaurant("���� Vodiy",4.0,1.5,1500);
        meatRestaurant2.addMenu(new Menu("���� �粿ġ ������(SHASHILK KUSKAVOY)",9500,"ũ�� ���ֹ��� �� ���� ������ ��"));
        meatRestaurant2.addMenu(new Menu("���� �Ұ�� ������(SHASHILIK QIYMA",8500,"ũ�� ���ֹ��� �� �Ұ���� ��"));
        meatRestaurant2.addMenu(new Menu("��ī�� ���� (ZAKAZ OSH)",12000,"�Ұ��� �⸧�� ���� ����"));
        meatRestaurant2.addMenu(new Menu("���� �ɹ� (QOZON KABOB)",14000,"�簥�� �ٺ�ť�� ����Ƣ���� ���� �ִ� �ɹ�"));

        Restaurant meatRestaurant3 = new Restaurant("�ϳ�������[���빮����]",5.0,2.2,1000);
        meatRestaurant3.addMenu(new Menu("�ѵ����긮��",17000,"�ε巴�� ǳ�̰� ���Ƽ� �αⰡ ���� �����Դϴ�"));
        meatRestaurant3.addMenu(new Menu("�ѵ�������",18000,"Ư���� �İ��� ����Ѹ��� ��ǰ"));
        meatRestaurant3.addMenu(new Menu("�����ѵ�����",16000,"�ѿ�1+�̻��� ����"));
        meatRestaurant3.addMenu(new Menu("500�� �����ʹ� �ѵ�Ư���",16000,"500�� �ְ�� �������� �ʹ��� ���� �����ϴ�"));

        Restaurant meatRestaurant4 = new Restaurant("ȫ��â[���з�������]",4.8,1.1,2500);
        meatRestaurant4.addMenu(new Menu("��ä��â",13000,"�⺻��â"));
        meatRestaurant4.addMenu(new Menu("��丷â",15000,"���� ����"));
        meatRestaurant4.addMenu(new Menu("�����߳���â",15000,"���! 1�� �޴�"));
        meatRestaurant4.addMenu(new Menu("�ұݱ��̸�â",15000,"��â������ ��"));

        Restaurant meatRestaurant5 = new Restaurant("�ٸ�����",5.0,1.1,1000);
        meatRestaurant5.addMenu(new Menu("(���̾�Ʈ������) ��ٸ����� ����ұݱ��̼�Ʈ + ���� �� ��24�� 600g",26000,"���޴� �򴩸��ð� ��û���Կ� �����û�� ǰ�������ּ���"));
        meatRestaurant5.addMenu(new Menu("(���̾�Ʈ��) ��Ÿ�̰� ����ұݱ��̼�Ʈ+���� 12�� 500g",26000,"���޴� �򴩸��ð� ��û���Կ� �����û�� ǰ�������ּ���"));
        meatRestaurant5.addMenu(new Menu("���޴���ĥ��Ƣ�����(������, ����� ��Ȳ����)",24000,"Ƣ��� ���� ���츦 ���޴����� ĥ���ҽ��� ���ְ� �����մϴ�"));
        meatRestaurant5.addMenu(new Menu("(�����Ϸ�) ��ٸ� �˻����� (�������� ��������) 25��(��)",23000,"��ٸ����� �˻������� ���� ���忡�� ����25�� ����� ������ ����� �����߽��ϴ�"));

        //��� ī�װ��� ������ �߰�
        meat.addRestaurant(meatRestaurant1);
        meat.addRestaurant(meatRestaurant2);
        meat.addRestaurant(meatRestaurant3);
        meat.addRestaurant(meatRestaurant4);
        meat.addRestaurant(meatRestaurant5);

        //ī�� �޴� �߰�
        Restaurant cafeRestaurant1 = new Restaurant("����ĭ",5.0,1.1,1000);
        cafeRestaurant1.addMenu(new Menu("����ġ ũ����",2800,"�����÷�+�Ƹ���Դϴ�. �⺻���� ��ũ���� �ö��� �ʾƿ�!"));
        cafeRestaurant1.addMenu(new Menu("������ ����",5500,"����ĭ���� ������ �������� �� �ǰ��ϰ� ���ִ� ���û�"));
        cafeRestaurant1.addMenu(new Menu("����Ĩ ����",5000,"������ �ϱ� ���� �޴��� ����"));
        cafeRestaurant1.addMenu(new Menu("���纣���� ����",5500,"��ŭ�ؼ� ������ �ʴ� ��纣������"));

        Restaurant cafeRestaurant2 = new Restaurant("����������[��ȭ��������]",4.9,1.0,1500);
        cafeRestaurant2.addMenu(new Menu("��������",4300,"�ٻ��� �佺�� ���� ������ ����÷��� �Ǽ���û�� �߸� ����"));
        cafeRestaurant2.addMenu(new Menu("����ī���׶�",6000,"����� ���� ������ ���̿� �ε巯�� ī���׶�� ũ��"));
        cafeRestaurant2.addMenu(new Menu("����Ÿ��Ʈ",3900,"�ε巯�� ���� �ʸ��� ����ִ� ������ ����Ÿ��Ʈ"));
        cafeRestaurant2.addMenu(new Menu("��ĭȣ��Ÿ��Ʈ(��)",46000,"ȣ�ο� ��ĭ���� �Ƴ����� �־� ���� �� ����� Ÿ��Ʈ"));

        Restaurant cafeRestaurant3 = new Restaurant("��ġȭ��[������]",5.0,1.4,500);
        cafeRestaurant3.addMenu(new Menu("��� ���̽�ũ�� ũ����",10800,"�������� ����ũ���ÿ� ��� ���� ���ѷ� �ٴҶ� �ѽ���"));
        cafeRestaurant3.addMenu(new Menu("��ġ��ȭ(���ν���� Iced Only)",6200,"��ġȭ���� �ñ״�ó �޴��� �˵��� ũ���� ��� �ø� ���ν����"));
        cafeRestaurant3.addMenu(new Menu("��ũû(�ӽ�Ĺ ��ũƼ)",6500,"�ӽ�Ĺ�� ����� ǳ�̰� ������ �ε巯�� �����̾� ���� ��ũƼ"));
        cafeRestaurant3.addMenu(new Menu("��������������ũ(����)",6800,"���� ����ũ���� �ٴ��� ���ڽ�Ʈ ������ ũ��ġ�� ũ��"));

        Restaurant cafeRestaurant4 = new Restaurant("�ް����� ��â��[�������Ա���]",5.0,1.0,1000);
        cafeRestaurant4.addMenu(new Menu("�ι������ݸ����Ҷ�(8����)",23900,"���Ҷ� �ȿ� ī�������� �ǽ�Ÿġ���� ���"));
        cafeRestaurant4.addMenu(new Menu("���Һ���ī�̸�(9����)",16900,"ī�̸��� ������ ���� ���� ũ������ Ƣ��Ű���� ���� ����Ʈ�Դϴ�"));
        cafeRestaurant4.addMenu(new Menu("���̽����� ����(10��)",12900,"�θ����� �� ī���׶�� �˵��� �����̷� ���� �һ� ���ڸ�"));
        cafeRestaurant4.addMenu(new Menu("�����־�(4��)",9900,"���� ������� ����� �˵��ϰ� �� �� ���� �޴��ϰ� ��û ���� �귯 ���ɴϴ�~"));

        Restaurant cafeRestaurant5 = new Restaurant("������ ����Ŀ��",5.0,1.1,1000);
        cafeRestaurant5.addMenu(new Menu("��Ұ��� �ٺ�ι�",18000,"������ ������ ���� ���� �� �� ������ �ִ��� ������ ���� �Ϸ��� ����ϰ� �ֽ��ϴ�."));
        cafeRestaurant5.addMenu(new Menu("(�ٻ��˵�)���θӽ��� �ĺ�ι� ����ũ",22000,"�������� ���θӽ����� ��°�� �� �ĺ�ι�"));
        cafeRestaurant5.addMenu(new Menu("������� ��Ұ���ȭä",17000,"�ż��� ���ϰ� ��Ƶ� �̰ſ� �����ʴ� ���� 100%"));
        cafeRestaurant5.addMenu(new Menu("(2~3�κ� �Ŷ�) �����ξ��� ����",24000,"�����Ͽ� ��︮�� ������ ����Ʈ ���� ������ ���޴����� �����ξ���"));

        //ī�� ī�װ��� ������ �߰�
        cafe.addRestaurant(cafeRestaurant1);
        cafe.addRestaurant(cafeRestaurant2);
        cafe.addRestaurant(cafeRestaurant3);
        cafe.addRestaurant(cafeRestaurant4);
        cafe.addRestaurant(cafeRestaurant5);



    }
}
