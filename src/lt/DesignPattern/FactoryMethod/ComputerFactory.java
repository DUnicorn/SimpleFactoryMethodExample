package lt.DesignPattern.FactoryMethod;


public class ComputerFactory {
/*
 * Notice that based on the input parameter, different subclass is created and
 *  returned. getComputer is the factory method.
 */
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type))
			return new PC(ram, hdd, cpu);
		else if ("Server".equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);

		return null;
	}

}
