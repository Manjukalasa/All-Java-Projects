package samples;

public class EmplyoeeSolution {

	public static void main(String[] args) 
	 {
     Employee E1=new Employee(101,"mk",25000);
     Employee E2=new Employee(102,"k",35000);
     Employee E3=new Employee(103,"mbk",45000);
//     Employee[] e=new Employee[3];
//     e[0]=E1;
//     e[1]=E2;
//     e[2]=E3;
     Employee[] e= {E1,E2,E3};
     for(int i=0;i<=e.length-1;i++)
     {
    	 System.out.println(e[i]);
     }

	}

}
