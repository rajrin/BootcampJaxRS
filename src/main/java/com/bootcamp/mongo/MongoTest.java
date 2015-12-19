package com.bootcamp.mongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * This is just to demonstrate how to connect with Mongo to carry out CRUD operations
 *
 */

 	
public class MongoTest {

	// copy your connection string here
	final public static String URL = "PROVIDE UR URL";
	final public static String DATABASE = "c720";
	final public static String COLLECTION = "customerProfile";
	
	/**
	 * Test calls
	 */
	public static void main(String[] args){
		MongoClient		mc = new MongoClient(new MongoClientURI(URL));
		
		MongoDatabase   db = mc.getDatabase(DATABASE);
		MongoCollection collection = db.getCollection(COLLECTION);
		
		System.out.println("Count: "+collection.count());
		
		System.out.println(collection.find().first());
	}
}
