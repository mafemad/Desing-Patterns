package singleton;

public class ConfigurationManager {

    // Atributo estático que guarda a única instância da classe
    private static ConfigurationManager instance;

    // Variáveis de configuração (exemplo)
    private String databaseUrl;
    private String apiKey;

    // Construtor privado para impedir que a classe seja instanciada externamente
    private ConfigurationManager() {
        // Valores de exemplo
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydb";
        this.apiKey = "ABC123";
    }

    // Método público estático que retorna a única instância
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            // Cria a instância apenas se ela ainda não existir
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Métodos para acessar ou modificar as configurações
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}

