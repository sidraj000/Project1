import java.util.ArrayList;


public class Project1 {
 public static void main(String[] args) {


    ArrayList<Employee> empList=new ArrayList<>();
    ArrayList<DaDetails> daList=new ArrayList<>();

    daList.add(new DaDetails("e", "Engineer", 20000));
    daList.add(new DaDetails("c", "Consultant", 32000));
    daList.add(new DaDetails("k", "Clerk", 12000));
    daList.add(new DaDetails("r", "Receptionist", 15000));
    daList.add(new DaDetails("m", "Manager", 40000));
        
    empList.add(new Employee("1001","Ashish","01/04/2009","e","R&D",20000,8000,3000));
    empList.add(new Employee("1002","Sushma","23/08/2012","c","PM",30000,12000,9000));
    empList.add(new Employee("1003", "Rahul", "12/11/2008", "k", "Acct", 10000, 8000, 1000));
    empList.add(new Employee("1004", "Chahat", "29/01/2013", "r","Front Desk", 12000, 6000, 2000));
    empList.add(new Employee("1005", "Ranjan", "16/07/2005", "m", "Engg", 50000 ,20000, 20000));
    empList.add(new Employee("1006", "Suman", "1/1/2000", "e", "Manufacturing", 23000, 9000, 4400));
    empList.add(new Employee("1007", "Tanmay", "12/06/2006", "c", "PM", 29000, 12000,10000));

    String empid= args[0];
    for(int i=0;i<empList.size();i++)
    {
        Employee reqEmployee=empList.get(i);
        if(reqEmployee.getEmpNo().equals(empid))
        {

            String designation="";
            int salary=reqEmployee.getBasic()+reqEmployee.getHra()-reqEmployee.getIt();
            String desCode=reqEmployee.getDesCode();


            for(int j=0;j<daList.size();j++)
            {
                if(daList.get(j).getDesCode().equals(desCode))
                {
                designation=daList.get(j).getDesignation();
                salary=salary+daList.get(i).getDa();
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