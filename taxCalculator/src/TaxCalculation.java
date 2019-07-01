import javax.swing.JOptionPane;
//*********************************************************************
//* *
//* CIS611 Spring Session 2019		Josh Craven *
//* *
//* Program Assignment PA02 *
//* *
//* Class Description: Tax Calculation *
//* *
//* *
//* Date Created 2/5/2019*
//* *
//* Saved in: TaxCalculation.java *
//* *
//*********************************************************************
public class TaxCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String incomeInputVaue =JOptionPane.showInputDialog("Enter income of one person. Enter value as a whole number, without any decimal, e.g., 15125");
		
		double incomeInDouble=Double.parseDouble(incomeInputVaue); 
		
		String statusInString =JOptionPane.showInputDialog("Enter status of person, Enter either the value of Single, or Married as 0 or 1.");
		
		int statusInInt = 0;
		
		switch(statusInString){	   
        case "Single":
        	statusInInt = 0;
            break;
        case "Married":
        	statusInInt = 1;
            break;
        default:
        	System.out.println("no match");
		}
		
		double tax = 0;
		
		if(statusInInt==0){			
			if(incomeInDouble <8350 && statusInInt==0)
				{tax = incomeInDouble * 0.1 ;}
			else if((incomeInDouble >=8351 && incomeInDouble<= 33950)&& statusInInt==0)
				{tax = incomeInDouble * 0.15;}
			else if((incomeInDouble >= 33951 && incomeInDouble <= 82250)&& statusInInt==0)
				{tax = incomeInDouble * 0.25;}
			else if((incomeInDouble >= 82251 && incomeInDouble <= 171550)&& statusInInt==0)
				{tax = incomeInDouble * 0.28;}
			else if((incomeInDouble >= 171551 && incomeInDouble <= 372950)&& statusInInt==0)
				{tax = incomeInDouble * 0.33;}
			else if(incomeInDouble >= 372951 && statusInInt==0)
				{tax = incomeInDouble * 0.35;}			
		}else if(statusInInt==1) {
			if(incomeInDouble <16700 && statusInInt==1)
				{tax = incomeInDouble * 0.1 ;}
			else if((incomeInDouble >=16701 && incomeInDouble<= 67900)&& statusInInt==1)
				{tax = incomeInDouble * 0.15;}
			else if((incomeInDouble >= 67901 && incomeInDouble <= 137050)&& statusInInt==1)
				{tax = incomeInDouble * 0.25;}
			else if((incomeInDouble >= 137051 && incomeInDouble <= 208850)&& statusInInt==1)
				{tax = incomeInDouble * 0.28;}
			else if((incomeInDouble >= 208851 && incomeInDouble <= 372950)&& statusInInt==1)
				{tax = incomeInDouble * 0.33;}
			else if(incomeInDouble >= 372951 && statusInInt==1)
				{tax = incomeInDouble * 0.35;}
		}
		
		JOptionPane.showMessageDialog(null, "Income= " + incomeInDouble + "\n" + " Status= " + statusInString  + "\n" + "Tax= " + tax);
	}

}
