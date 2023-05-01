package ustbatchno3.Com.autowiring;

public class Notificationservice {
	private Messageservices messageservice;
	
	public void notifyservice(){
	messageservice.sendmessage("Hey Im autowired");
	
	
	}

	

	public void setMessageservice(Messageservices messageservice) {
		this.messageservice = messageservice;
	}

	

	

	

	
	
	
	
	
	
	

}
	
	


