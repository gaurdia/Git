package com.Examples;
public class ForloopAssingments {
    public static void main(String[] args) {


//  1). Print only vowels (aeiou) using  while loop. Start the loop from ‘a‘ to ‘z‘.
    	
		
		
		  char vowels='a';
		  
		  while(vowels<='z') {
		  
		  
		  
		  
		  if(vowels == 'a'){
			  System.out.println(vowels);
		  
		  } 
		  if(vowels == 'e'){ 
			  System.out.println(vowels);
		  
		  } 
		  if(vowels == 'i'){
			  System.out.println(vowels);
		  
		  } 
		  if(vowels == 'o'){
			  System.out.println(vowels);
		  
		  } 
		  if(vowels == 'u'){
			  System.out.println(vowels);
		  
		  }
		  
		  vowels++;
		  
		  
		  }
		  
		  // 2). Print only vowels (aeiou) using for loop. Start the loop from ‘a‘ to ‘z‘.
		  
		  char vowelsbyfor='a'; 
		  for(;vowelsbyfor <= 'z';vowelsbyfor++)
		  {
		  
		  
		  if(vowelsbyfor == 'a'){
			  System.out.println(vowelsbyfor);
		  
		  } 
		  if(vowelsbyfor == 'e'){
			  System.out.println(vowelsbyfor);
		  
		  } 
		  if(vowelsbyfor == 'i'){ 
			  System.out.println(vowelsbyfor);
		  
		  }
		  if(vowelsbyfor == 'o'){
			  System.out.println(vowelsbyfor);
		  
		  } 
		  if(vowelsbyfor == 'u'){ 
			  System.out.println(vowelsbyfor);
		  
		  }
		  
		  }
		  
		  // 3.WAP to print 10 to 1 using for loop 
		  int num; 
		  for(num=10;num >=1;num--) {
		  System.out.println(num); } 
		  
		  //4. Write a program in Java to print all themultiplication of 5 from 1 to 100 using while loop
		  
		  int multiple; 
		  for (multiple=1;multiple<=100;multiple++) {
		  
		  if(multiple%5==0) { 
			  System.out.println(multiple);
			  }
		  
		  }
		  
		  // 5. Print A-Z , a-z, 0-9 with the respective ASCII numbers the console one using while loop
		  
		  for(char alpha='a';alpha <= 'z';alpha++) {
			  System.out.println(alpha);
			  }
		  for(char alpha1='A';alpha1 <= 'Z';alpha1++) {
			  System.out.println(alpha1);
			  }
		  for(char alpha2='0';alpha2<= '9';alpha2++) {
			  System.out.println(alpha2);
		  
		  
		  }
		 
			//6.Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".'
			
			  int count; for (count=1;count<=10;count++) {
			  
			  if(count%5==0) { System.out.println(count); }
			  
			  }
			 
		        for (int i=1;i<=10;i++){
		        System.out.println(i);
		        	          if(i%7==0) {  
	        	                System.out.println("bye, see you tomorrow");
	        	               break;
		        	          } 
	        	            
		        	
	        	         }
		        //do while 
		        
int sum=1;
			do {
				System.out.println(sum);
				if(sum%7==0) {
					System.out.println("bye, see you tomorrow");
					break;
				}
				sum++;
			
			}while(sum<=10);
    }
}