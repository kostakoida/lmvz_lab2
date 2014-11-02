package ua.nure.lmvz.lab.client;

import java.util.Date;  

import com.smartgwt.client.widgets.grid.ListGridRecord;  
  
public class CountrySampleData {  
  
    private static ListGridRecord[] records;    
        
    public static ListGridRecord[] getRecords() {  
        if (records == null) {  
            records = getNewRecords();    
        }    
        return records;    
    }    
    
    public static ListGridRecord createRecord(String Name, String description) {  
        ListGridRecord record = new ListGridRecord(); 
        record.setAttribute("Name", Name); 
        record.setAttribute("description", description);    
        return record;  
    }  
  
    public static ListGridRecord[] getNewRecords() {  
        return new ListGridRecord[]{  
        		createRecord("Лекарство 1","Описание1"),
        		createRecord("Лекарство 2","Описание2"),
        		createRecord("Лекарство 3","Описание3"),
        		createRecord("Лекарство 4","Описание 4"),
        		createRecord("Лекарство 5","Описание 5"),
        		createRecord("Лекарство 6","Описание 6"),
        };  
    }  
}  
