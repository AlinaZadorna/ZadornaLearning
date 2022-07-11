package homeWork9_StringsAndEnums;

public enum Ball {

    FOOTBALL(22, "Football", 120, "leather"),
    BASKETBALL(40, "Basketball", 300, "rubber"),
    VOLLEYBALL(32, "Volleyball", 240, "leather"),
    TENNISBALL(15, "Tennis", 80, "rubber"),
    RUGBYBALL(31, "Rugby", 450, "rubber");

    private double ballSize;
    private String kindOFSport;
    private double price;
    private String material;

    Ball(double ballSize, String kindOFSport, double price, String material) {
        this.ballSize = ballSize;
        this.kindOFSport = kindOFSport;
        this.price = price;
        this.material = material;
    }

    public double getBallSize() {
        return ballSize;
    }

    public String getKindOFSport() {
        return kindOFSport;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    public void setBallSize(double ballSize) {
        this.ballSize = ballSize;
    }

    public void setKindOFSport(String kindOFSport) {
        this.kindOFSport = kindOFSport;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String toString() {
        return "Ball size is: " + ballSize + ", sport type: " + kindOFSport
                + ", price is: " + price + " uah, material is: " + material + ".";
    }
}
