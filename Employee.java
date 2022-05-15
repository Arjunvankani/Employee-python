import java.util.Scanner; 
import java.util.*;  
import java.util.stream.*;  
import static java.util.Comparator.*;

public class Employee
{
	private String id;
	private String name;
	private String gender;
	private int jobhour;
	private int amount;
	
	public Employee(){}
	
	public Employee(String id, String name,String gender, int jobhour, int amount){
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.jobhour = jobhour;
	this.amount = amount;
	
	}
	
	public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
	
	public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
	
	
	public String getGender() {
        return gender;
    }
 
    public void setGender(String gender) {
        this.gender = gender;
    }
	
	public int getJobhour() {
        return jobhour;
    }
 
    public void setJobhour(int jobhour) {
        this.jobhour = jobhour;
    }
	
	public int getAmount() {
        return amount;
    }
 
    public void setAmount(int amount) {
        this.amount = amount;
    }
	
	
	public String toString(){
 
        return "[" + 
            this.getId() + 
            " : " + 
            this.getName() + 
            " : " + 
			this.getGender() + 
            " : " + 
			this.getJobhour() + 
            " : " + 
            this.getAmount() + 
            "]";
    }
	

    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
    
	Employee em = new Employee();
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("How Many Employee ? :");
	int n = in.nextInt();
	
	List<List<String>> list = new ArrayList<>();
	//List<String> list = new ArrayList<String>();
	
	for( int i =0; i < n;i++)
	{
		List<String> lis = new ArrayList<String>();
	
		System.out.println("Enter Employee  Id :");
		int jid = in.nextInt();
		lis.add(String.valueOf(jid));
		
		
		System.out.println("Enter Employee  Name :");
		String jname = in.next();
		lis.add(jname);
		
		
		System.out.println("Enter Employee  Gender M/F :");
		String jgender = in.next();
		lis.add(jgender);
		
		Boolean bFlag = true;
		
		while(bFlag) {
			try{
				System.out.println("Enter Employee  Job Hour more than 10! :");
				int jjobhour = in.nextInt();
				if (jjobhour > 10){
					lis.add(String.valueOf(jjobhour));

				bFlag = false;
				}
			}
			catch (InputMismatchException ex){
				System.out.print("You must input Job Hour more than 10!");
				int jjobhour = in.nextInt();
				bFlag = true;
			}
		}
		
				
		Boolean bFlag1 = true;
		
		if(jgender.equals("M")){
		while(bFlag1) {
			try{
				System.out.println("Enter Employee  Amount betwen 100 to 150!:");
				int jamount = in.nextInt();
				if (jamount >= 100 && jamount<= 150){
					lis.add(String.valueOf(jamount));
				bFlag1 = false;
				}
			}
			catch (InputMismatchException ex){
				System.out.print("You must input Amout betwen 100 to 150!");
				int jamount = in.nextInt();
				bFlag1 = true;
			}
		}
		}
		
		Boolean bFlag2 = true;
		if(jgender.equals("F")){
		
		while(bFlag2) {
			try{
				System.out.println("Enter Employee  Amount betwen 70 to 120!:");
				int jamount = in.nextInt();
				if (jamount >= 70 && jamount<= 120){
					lis.add(String.valueOf(jamount));
				bFlag2 = false;
				}
			}
			catch (InputMismatchException ex){
				System.out.print("You must input Amout betwen 70 to 120!");
				int jamount = in.nextInt();
				bFlag2 = true;
			}
		}
		}
		
	
		list.add(lis);
		//list.add(lis.toString());
	}


	System.out.println("Printing List: "+list);  
	
	
	list.forEach(System.out::println); 
	
}
}