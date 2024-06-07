package lr8.Task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class MyJsonCreator {

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        JSONArray tasks = new JSONArray();
        
        String[] names = {"bsbsijd", "sdfsdf", "dsfsdfsd", "sfsdfsdf"};
        int[] prices = {1000, 2000, 3000, 4000};
        for (int i = 0; i < names.length; i++) {
            JSONObject task = new JSONObject();
            task.put("car", names[i]);
            task.put("price", prices[i]);
            tasks.add(task);
        }

        jsonObject.put("cars", tasks);

        try (FileWriter file = new FileWriter("src/lr8/Task2/my-example-json.json")) {
            file.write(jsonObject.toJSONString());
            System.out.println("JSON-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
