* Environment Requirements:

	- Java SE 13.0.2
	- Maven 3.6.3
	- Intellij IDE (Optional)
	
* The program returns the amount of CO2-equivalent that will be caused when traveling a given distance using a given transportation method.
* These parameters are defined on the command line.

* `--distance` => (REQUIRED) distance (num)
	
* `--transportation-method` => (REQUIRED) transportation method e.g train, bus, large-petrol-car, small-diesel-car, medium-plugin-hybrid car, large-electric-car

* `--output` => (Optional) output unit: 'kg'(default),'g'
	
* `--unit-of-distance` => (Optional) values: 'km'(default), 'm'

* The avarage values used in calculation are based on [BEIS/Defra Greenhouse Gas Conversion Factors 2019](https://www.gov.uk/government/publications/greenhouse-gas-reporting-conversion-factors-2019).
	
* Export the project as a executable ".jar" file. 

* You can use the following command line to run the application.

	Runnable-command-1: `$ {LOCAL_PATH}\Co2EquivalentCalculator_jar>java -jar  Co2EquivalentCalculator.jar --transportation-method train  
	--distance 15000 --unit-of-distance m --output kg`
	
	Runnable-command-2: `$ {LOCAL_PATH}\Co2EquivalentCalculator_jar>java -jar  Co2EquivalentCalculator.jar --transportation-method=train  
	--distance=15000 --unit-of-distance=m --output=kg`


* `Apache Commons CLI` is used to handle command line operations.
	
	
