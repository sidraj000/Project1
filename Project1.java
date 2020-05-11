import java.util.ArrayList;


public class Project1 {
 public static void main(String[] args) {
     
   
    

  












    

    Employee empList[]=new Employee[7];
    DaDetails daList[]=new DaDetails[5];

    daList[0]=(new DaDetails("e", "Engineer", 20000));
    daList[1]=(new DaDetails("c", "Consultant", 32000));
    daList[2]=(new DaDetails("k", "Clerk", 12000));
    daList[3]=(new DaDetails("r", "Receptionist", 15000));
    daList[4]=(new DaDetails("m", "Manager", 40000));
        
    empList[0]=(new Employee("1001","Ashish","01/04/2009","e","R&D",20000,8000,3000));
    empList[1]=(new Employee("1002","Sushma","23/08/2012","c","PM",30000,12000,9000));
    empList[2]=(new Employee("1003", "Rahul", "12/11/2008", "k", "Acct", 10000, 8000, 1000));
    empList[3]=(new Employee("1004", "Chahat", "29/01/2013", "r","Front Desk", 12000, 6000, 2000));
    empList[4]=(new Employee("1005", "Ranjan", "16/07/2005", "m", "Engg", 50000 ,20000, 20000));
    empList[5]=(new Employee("1006", "Suman", "1/1/2000", "e", "Manufacturing", 23000, 9000, 4400));
    empList[6]=(new Employee("1007", "Tanmay", "12/06/2006", "c", "PM", 29000, 12000,10000));

    String empid= args[0];
    for(int i=0;i<empList.length;i++)
    {
        Employee reqEmployee=empList[i];
        if(reqEmployee.getEmpNo().equals(empid))
        {

            String designation="";
            int salary=reqEmployee.getBasic()+reqEmployee.getHra()-reqEmployee.getIt();
            String desCode=reqEmployee.getDesCode();


            for(int j=0;j<daList.length;j++)
            {
                if(daList[j].getDesCode().equals(desCode))
                {
                designation=daList[j].getDesignation();
                salary=salary+daList[j].getDa();
                }
            }
            System.out.println("Emp No." +reqEmployee.getEmpNo());
            System.out.println("Emp Name " +reqEmployee.getEmpName());
            System.out.println("Department " +reqEmployee.getDept());
            System.out.println("Designation " +designation);
            System.out.println("Salary " +salary);
            return ;
        }
    }
    System.out.println("There is no employee with empid: "+empid);
       
 }   
}