package restMainApplication.Service;

import java.util.ArrayList;

import restMainApplication.Entities.Entry;
import restMainApplication.Entities.ReturnedObject;;


//used singleton as a design pattern for creating this service class as we only need to define it one time 

public class ReturnedObjectService {
	
	  private ArrayList <ReturnedObject> objects;

	    private static ReturnedObjectService instance = null;
	    public static ReturnedObjectService getInstance(){
	         if(instance == null){
	             instance = new ReturnedObjectService();
	         }
	         return instance;
	    }
	    
	    // create ReturnedObject
	    public ReturnedObject createObject(Entry entry) {
	    	ReturnedObject object = new ReturnedObject(entry.getDetail(), entry.getNumber1(), entry.getNumber2(), entry.getNumber1()*entry.getNumber2());
	        return object;
	    }

}
