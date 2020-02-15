package TASKONE;

public class SimpleCompoundCAL {
	
double SimpleCompound(String CalculationType,double Amount,double NoOfYears,double rateOfIntrest) {
        
        double SI,CI;
		if(CalculationType=="SimpleIntrest")
		{
         SI=(Amount * NoOfYears * rateOfIntrest)/100;
         return SI;
		}
		else if(CalculationType=="CompoundIntrest")
		{
         CI=Amount * Math.pow(1.0+rateOfIntrest/100.0,NoOfYears) - Amount;
         return CI;
		}
		else
			return 0.0;
	}

}
