package de.fhb.schmidde;

import java.io.*;
 
 public class In{
	 
 private String line = null;
 
	public In(){}
	public String readString(){
		
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		 
		 try {
			 line = bin.readLine();
		 } catch (IOException e) {
			 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		return line;
	}
	public int readInt(){
		
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		 
		 try {
			 line = bin.readLine();
		 } catch (IOException e) {
			 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		 int i = Integer.parseInt(line);
		 
		 return i;
	}
	public long readLong(){
		
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		 
		 try {
			 line = bin.readLine();
		 } catch (IOException e) {
			 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		long l = Long.parseLong(line);
		
		return l;
	}
}
