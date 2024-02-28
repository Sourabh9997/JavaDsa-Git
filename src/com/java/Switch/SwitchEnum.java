package com.java.Switch;

public class SwitchEnum {
	
	//Java enum is a class that represent the group of constants. (immutable such as final variables). 
	//We use the keyword enum and put the constants in curly braces separated by comma.
	
	public enum Day {  Sun, Mon, Tue, Wed, Thu, Fri, Sat  }    
	public static void main(String[] args) {

		   Day[] DayNow = Day.values();    
           for (Day Now : DayNow)    
           {    
                switch (Now)    
                {    
                    case Sun:    
                        System.out.println("Sunday");    
                        break;    
                    case Mon:    
                        System.out.println("Monday");    
                        break;    
                    case Tue:    
                        System.out.println("Tuesday");    
                        break;         
                    case Wed:    
                        System.out.println("Wednesday");    
                        break;    
                    case Thu:    
                        System.out.println("Thursday");    
                        break;    
                    case Fri:    
                        System.out.println("Friday");    
                        break;    
                    case Sat:    
                        System.out.println("Saturday");    
                        break;    
                }    
            }    
		
	}

}
