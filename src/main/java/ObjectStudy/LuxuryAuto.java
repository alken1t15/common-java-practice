package ObjectStudy;

public class LuxuryAuto {
    private String model;
    private int manufactureYear;
    private int dollarPrice;

    public LuxuryAuto(String model, int manufactureYear, int dollarPrice) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.dollarPrice = dollarPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        LuxuryAuto luxuryAuto = (LuxuryAuto) obj;

        if (manufactureYear != luxuryAuto.manufactureYear) return false;
        if (dollarPrice != luxuryAuto.dollarPrice) return false;
        return model != null ? model.equals(luxuryAuto.model) : luxuryAuto.model == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * manufactureYear + result;
        result = 31 * dollarPrice + result;
        return result;
    }
}
