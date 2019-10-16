package restMainApplication.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import restMainApplication.Entities.Entry;
import restMainApplication.Entities.ReturnedObject;
import restMainApplication.Service.ReturnedObjectService;


@org.springframework.web.bind.annotation.RestController
public class RestController{
	
	//define my service
	ReturnedObjectService service = ReturnedObjectService.getInstance();
	
	
	
	//function allows to get the returnedObject with the result value
	@RequestMapping(value="/entry"
			,method = RequestMethod.POST,
			consumes ="application/json"
			)
	@ResponseBody
	public ResponseEntity<ReturnedObject> Multiply(@RequestBody Entry entry)  {
		
		if(entry == null) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

			
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(service.createObject(entry));
		}
			
	
	}

}
