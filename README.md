* Environment Requirements:

	- Java SE Development Kit 13.0.2
	- Maven 3.6.3
	- Compiler: Intellij IDE (Optional)
	
* This program returns the amount of CO2-equivalent that will be caused when traveling a given distance using a given transportation method.
* These parameters are defined on the command line.

	usage: co2-equivalent-calculator
    --distance <arg>                REQUIRED distance: default value for
                                    unit is kilometer (km)
    --output <arg>                  output unit: default value for unit is
                                    kilogram (kg)
    --transportation-method <arg>   REQUIRED transportation method e.g
                                    train, bus
    --unit-of-distance <arg>        accepted units are km and m

* The avarage values used in calculation are based on "BEIS/Defra Greenhouse Gas Conversion Factors 2019".
	
* Export the project as a executable ".jar" file. 

* You can use the following command line to run the application.

	Example_1: "$ .....\Co2EquivalentCalculator_jar>java -jar  Co2EquivalentCalculator.jar --transportation-method train  
	--distance 15000 --unit-of-distance m --output kg"
	
	Example_2: "$ .....\Co2EquivalentCalculator_jar>java -jar  Co2EquivalentCalculator.jar --transportation-method=train  
	--distance=15000 --unit-of-distance=m --output=kg"


* "Apache Commons CLI" is used to handle command line operations.
	
	