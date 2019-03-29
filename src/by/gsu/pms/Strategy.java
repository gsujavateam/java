package by.gsu.pms;

public class Strategy extends Game{
    private int maxQuantityUnits;
    private int quantityMaps;
    private boolean opportunityCreateMap;


    public Strategy() {}

    public Strategy(String name, int release, int rating, String os, int quantityMaps, boolean opportunityCreateMap) {
        super(name, release, rating, os);
        this.quantityMaps = quantityMaps;
        this.opportunityCreateMap = opportunityCreateMap;
    }

    public Strategy(String name, int release, int rating, String os, int maxQuantityUnits, int quantityMaps, boolean opportunityCreateMap) {
        super(name, release, rating, os);
        this.maxQuantityUnits = maxQuantityUnits;
        this.quantityMaps = quantityMaps;
        this.opportunityCreateMap = opportunityCreateMap;
    }

    public int getMaxQuantityUnits() {
        return maxQuantityUnits;
    }

    public void setMaxQuantityUnits(int maxQuantityUnits) {
        this.maxQuantityUnits = maxQuantityUnits;
    }

    public int getQuantityMaps() {
        return quantityMaps;
    }

    public void setQuantityMaps(int quantityMaps) {
        this.quantityMaps = quantityMaps;
    }

    public boolean isOpportunityCreateMap() {
        return opportunityCreateMap;
    }

    public void setOpportunityCreateMap(boolean opportunityCreateMap) {
        this.opportunityCreateMap = opportunityCreateMap;
    }
    @Override
    public String getTitle(){
        return ("Жанр игры Стратегии; Название: " + getName());
    }

    @Override
    public String toString() {
        return  getTitle() + super.toString() + "Максимальное кол-во юнитов: " + maxQuantityUnits+ "; Количество карт: " +quantityMaps+ "; Возможность создать карту: " +opportunityCreateMap+"\n";
    }
}
