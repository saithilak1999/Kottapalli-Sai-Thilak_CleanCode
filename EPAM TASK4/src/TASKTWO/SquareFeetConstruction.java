package TASKTWO;

public class SquareFeetConstruction {
	
double CalculationSquareFeet(String Material_Type,double Area) {
        
        
		if(Material_Type=="Standard_Material")
		{
         return (Area*1200);
		}
		else if(Material_Type=="Above_Standard_Material")
		{
         return (Area*1500);
		}
		else if(Material_Type=="High_Standard_Material")
		{
			return (Area*1800);
		}
		else if(Material_Type=="High_Standard_Material_and_Automated")
		{
			return (Area*2500);
		}
		else
			return 0.0;
	}

}
