package list.run;

import list.service.ListService;

public class ListRun {
    public static void main(String[] args) {
        ListService service = new ListService(); // ✅ `()` 추가
        
        service.test3();
    }
}
