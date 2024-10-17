package dio.springboot;

public class ViaCepResponse {
    private String cep;
    private String logradouro;
    private String localidade;
    public String getCep() {
        return cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    @Override
    public String toString() {
        return "ViaCepResponse [cep=" + cep + ", logradouro=" + logradouro + ", localidade=" + localidade + "]";
    }
    
}
