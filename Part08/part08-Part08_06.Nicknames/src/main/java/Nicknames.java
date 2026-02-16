
import java.util.HashMap;

public class Nicknames {
    
    public static void main(String[] args) {
        HashMap<String, String> nickName = new HashMap<>();
        
        nickName.put("Matthew", "Matt");
        nickName.put("Michael", "Mix");
        nickName.put("Arthut", "Artie");
        
        System.out.println(nickName.get("Matthew"));
        
    }
    
}
