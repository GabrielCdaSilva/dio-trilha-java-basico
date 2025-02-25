package model;

public enum GamesStatusEnum {
    naoIniciado("não iniciado"),
    imcompleto("incompleto"),
    completo("completo");

    private String label;

    GamesStatusEnum(final String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
