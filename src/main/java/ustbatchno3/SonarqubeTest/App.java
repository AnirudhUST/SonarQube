package ustbatchno3.SonarqubeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App 
{
    public static void main( String[] args )
    {
      
       
        List<EmpDetails> l1=new ArrayList<EmpDetails>();
        l1.add(new EmpDetails("AGK",34, 7, 25000));
        l1.add(new EmpDetails("AGK",44, 3, 35000));
        l1.add(new EmpDetails("AGK",24, 5, 55000));
        l1.add(new EmpDetails("AGK",31, 2, 75000));
        l1.add(new EmpDetails("AGK",33, 4, 28000));
        
       
        List<EmpDetails> lis = l1.stream()
				.peek(k->{
				if((k.getExprnc()>=1)&&(k.getExprnc()<=3))
					k.setSalary(k.getSalary()+(0.025)*k.getSalary());
				else if((k.getExprnc()>=4)&& (k.getExprnc()<=6))
					k.setSalary(k.getSalary()+(0.05)*k.getSalary());
				else if((k.getExprnc()>=7)&& (k.getExprnc()<=10))
					k.setSalary(k.getSalary()+(0.1)*k.getSalary());
				else if((k.getExprnc()>10))
					k.setSalary(k.getSalary()+(0.12)*k.getSalary());
				
				
				}
			      ).collect(Collectors.toList());
        
        System.out.println(lis);

    }
}
