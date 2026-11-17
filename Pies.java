public class Pies extends Zwierze {
    private String rasa;
    private int wiek;

    public Pies(String imie, String rasa, int wiek) {
        super(imie);
        this.rasa = rasa;
        this.wiek = wiek;
    }

    public String getRasa() {
        return rasa;
    }

    public int getWiek() {
        return wiek;
    }
}
