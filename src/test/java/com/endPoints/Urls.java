package com.endPoints;




public class Urls {
	
    public static String base_url="https://petstore.swagger.io/v2";
	
    //user Module urls
    
    public static String post_url=base_url+"/user";
    public static String get_url=base_url+"/user/{username}";
    public static String put_url=base_url+"/user/{username}";
    public static String delete_url=base_url+"/user/{username}";
	
	
	//store module urls
    
        public static String post_url_store=base_url+"/store/order";
    	public static String get_url_store=base_url+"/store/order/{orderid}";
    	public static String delete_url_pet=base_url+"/store/order/{orderid}";
    	
    	
    	
    	//pet 

}
