package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONObject json ;
    private JSONArray json_list;
    private ArrayList<String> isbn_list  = new ArrayList<String>();
    private ArrayList<String> title_list =new ArrayList<String>();
    private ArrayList<String> publisher_list =new ArrayList<String>();
    private ArrayList<ArrayList<String>> authors_list =  new ArrayList<ArrayList<String>>();
    public JSONBookMetadataFormatter() throws IOException {
        reset();
    }
    @Override
    public BookMetadataFormatter reset() {
        json_list= new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        try {
            ArrayList<String> temp = new ArrayList<String>();
            json = new JSONObject();
            json.put("ISBN", b.getISBN());
            json.put("Title", b.getTitle());
            json.put("Publisher",b.getPublisher());
            for (String a:b.getAuthors()) {
                temp.add(a);
            }
            json.put("Authors",temp);
            json_list.add(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public String getMetadataString() {
        return json_list.toJSONString();
    }
}
