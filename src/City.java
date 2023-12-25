public class City {
    String cityname;
    String regionName;

    public City(String cityname, String regionName) {
        this.cityname = cityname;
        this.regionName = regionName;
    }

    @Override
    public String toString() {
        return cityname + " - " + regionName;
    }
}
