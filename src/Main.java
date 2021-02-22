import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s,s1;
        ArrayList<String> listInput = new ArrayList<>(19); //Этот массив будет имитировать вводной поток
        listInput.add(0, "lorem");       listInput.add(1,"dolor");
        listInput.add(2,"sit");          listInput.add(3,"amet");
        listInput.add(4,"consectetur");  listInput.add(5,"adipisicing");
        listInput.add(6,"elit");         listInput.add(7, "dolor");
        listInput.add(8,"voluptas");     listInput.add(9, "iste");
        listInput.add(10,"porro");       listInput.add(11, "sequi");
        listInput.add(12, "iste");       listInput.add(13, "nisi");
        listInput.add(14,"iste");         listInput.add(15,"modi");
        listInput.add(16,"consectetur"); listInput.add(17, "ipsam");
        listInput.add(18, "elit");

        Map<String, Integer> map = new HashMap<>(); // Пересчитываю слова и загоняю в Мапу
       for (int i=0; i<listInput.size(); i++) {
           int value;
           s = listInput.get(i);
           if (map.get(s) == null) map.put(s, 1);
           else { // если есть повтор
               value= map.get(s);
               map.put(s, value+1);
           }
       }        System.out.println(map);//вывод Мапы для контроля

       System.out.println("Уникальные слова: ");// Вывод уникальных слов. Можно загнать в метод, но лень
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            if (item.getValue()==1) System.out.printf("Слово: %s \n", item.getKey());
        }
        System.out.println("\nПовторяющиеся слова: ");//Тоже загонять в метод лень
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            if (item.getValue()>1) System.out.printf("Слово: %s  Повторы: %s \n", item.getKey(), item.getValue());
        }
// Задаю начальные значения телефонного справочника
        Map<String, String> telphoneList = new HashMap<String, String>();
        telphoneList.put("8-245-452-4689", "Bubka");
        telphoneList.put("8-885-452-4689", "Bubka");
        telphoneList.put("8-800-000-1000", "Pupkin");
        telphoneList.put("8-900-000-2000", "Ivanov");
        telphoneList.put("8-900-100-1000", "Ivanov");
        System.out.println("\n Список телефонов:");
        //Вывод всего справочника
        for (Map.Entry<String, String> item : telphoneList.entrySet()) {
            System.out.printf("Имя: %s  Телефон: %s \n", item.getValue(), item.getKey());
        }

        // обертку для опредеоения действия ввода новой фамилии не прописываю
        telphoneList.put("8-800-800-8888", "Petrov");
        System.out.println("\n Список после добавления записи:");
        for (Map.Entry<String, String> item : telphoneList.entrySet()) {
            System.out.printf("Имя: %s  Телефон: %s \n", item.getValue(), item.getKey());
        }

        //обертку для определения действия по извлечению не прописываю
        s="Petrov";
        s1="Ivanov";
        System.out.println("\n Поиск по фамилии: "+s);
        for (Map.Entry<String, String> item : telphoneList.entrySet()) {
            if (item.getValue()==s) {
                System.out.printf("Имя: %s  Телефон: %s \n", item.getValue(), item.getKey());
            }
            }

        System.out.println("\n Поиск по фамилии: "+s1);
        for (Map.Entry<String, String> item : telphoneList.entrySet()) {
            if (item.getValue()==s1) {
                System.out.printf("Имя: %s  Телефон: %s \n", item.getValue(), item.getKey());
            }
        }

    }
}
