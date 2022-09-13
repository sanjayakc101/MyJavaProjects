import javax.swing.JOptionPane;
public class TestEmployee { 

        public static void main(String[] args) {
        String in;
        String name;
        double salary, pctBonus, bonus, travelExpense;
        int optionCount;
        Employee[] emp=new Employee[6];
        int empIndex=0;

        for (int i=0; i<3; i++){
                   name= JOptionPane.showInputDialog ("Enter name");
                   in= JOptionPane.showInputDialog ("Enter salary");
                   salary=Double.parseDouble(in);
                   in= JOptionPane.showInputDialog ("Enter bonus percentage");
                   pctBonus=Double.parseDouble(in);
                    emp[empIndex]=new Worker(name,salary,pctBonus);
                    empIndex++;
        }

        for (int i=0; i<2; i++){
            name= JOptionPane.showInputDialog ("Enter name");
            in= JOptionPane.showInputDialog ("Enter salary");
            salary=Double.parseDouble(in);
            in= JOptionPane.showInputDialog ("Enter bonus percentage");
            pctBonus=Double.parseDouble(in);
            in= JOptionPane.showInputDialog ("Enter travel expense");
            travelExpense=Double.parseDouble(in);
             emp[empIndex]=new Manager(name,salary,pctBonus,travelExpense);
             empIndex++;

        }
        for (int i=0; i<1; i++){
            name= JOptionPane.showInputDialog ("Enter name");
            in= JOptionPane.showInputDialog ("Enter salary");
            salary=Double.parseDouble(in);
            in= JOptionPane.showInputDialog ("Enter bonus percentage");
            pctBonus=Double.parseDouble(in);
            in= JOptionPane.showInputDialog ("Enter travel expense");
            travelExpense=Double.parseDouble(in);
            in= JOptionPane.showInputDialog ("Enter option count");
            optionCount=Integer.parseInt(in);           
             emp[empIndex]=new Executive (name,salary,pctBonus,travelExpense,optionCount);
             empIndex++;
        }
        String outAll, outW="", outM="", outE="";
        for (int i=0; i < emp.length; i++){
            name = emp[i].getName ( );
            salary = emp[i].getSalary ( );
            bonus = emp[i].computeBonus();
            if (emp[i] instanceof Worker){
                        pctBonus = ((Worker) emp[i]).getPctBonus();
                        outW +=  "Name:" + name + "\n";
                        outW +=  "Salary:" + salary + "\n";
                        outW +=  "PctBonus:" + pctBonus + "\n"; 
                        outW +=  "Bonus:" + bonus + "\n";
                        outW += "\n";

            }
            else if (emp[i] instanceof Manager) {
                        pctBonus = ( (Manager) emp[i] ).getPctBonus ( );
                        travelExpense = ( (Manager) emp[i] ).getTravelExpense ( );
                        outM +=  "Name:" + name + "\n";
                        outM +=  "Salary:" + salary + "\n";
                        outM +=  "PctBonus:" + pctBonus + "\n"; 
                        outM +=  "Bonus:" + bonus + "\n"; 
                        outM +=  "Travel Expense:" + travelExpense + "\n";
                        outM += "\n";
            }
            else if (emp[i] instanceof Executive) {
                        pctBonus = ( (Executive) emp[i] ).getPctBonus ( );
                        travelExpense = ( (Executive) emp[i] ).getTravelExpense ( );
                        optionCount = ( (Executive) emp[i] ).getOptionCount ( );
                        outE = outE + "Name:" + name + "\n";
                        outE +=  "Salary:" + salary + "\n";
                        outE +=  "PctBonus:" + pctBonus + "\n"; 
                        outE +=  "Bonus:" + bonus + "\n"; 
                        outE +=  "Travel Expense:" + travelExpense + "\n"; 
                        outE +=  "Option Count:" + optionCount + "\n";
                        outE += "\n";
            }
        }
        outAll = outW + outM + outE;
        JOptionPane.showMessageDialog(null, outAll);
    }
}

