package Lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Phonebook {
    private Map<String, List<String>> phoneNumberMap = new HashMap<>();
    private List<String> phoneList;

    public void add(String name, String phoneNumber) {
        if (phoneNumberMap.containsKey(name)) {
            phoneList = phoneNumberMap.get(name);
            phoneList.add(phoneNumber);
            phoneNumberMap.put(name, phoneList);
        } else {
            phoneList = new ArrayList<>();
            phoneList.add(phoneNumber);
            phoneNumberMap.put(name, phoneList);
        }
    }

    public List<String> get(String name) {
        return phoneNumberMap.get(name);
    }


}
