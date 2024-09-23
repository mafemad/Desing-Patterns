package singleton;

public class Program {
    public static void main(String[] args) {
        // Obtendo a única instância do ConfigurationManager
        ConfigurationManager config = ConfigurationManager.getInstance();

        // Acessando as configurações
        System.out.println("Database URL: " + config.getDatabaseUrl());
        System.out.println("API Key: " + config.getApiKey());

        // Modificando as configurações
        config.setDatabaseUrl("jdbc:mysql://localhost:3306/otherdb");
        config.setApiKey("XYZ789");

        // Obtendo a instância novamente
        ConfigurationManager anotherConfig = ConfigurationManager.getInstance();

        // Verificando que as alterações persistem na mesma instância
        System.out.println("\nAfter modifications:");
        System.out.println("Database URL: " + anotherConfig.getDatabaseUrl());
        System.out.println("API Key: " + anotherConfig.getApiKey());
    }
}
