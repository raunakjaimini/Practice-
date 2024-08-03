package packages;
public abstract class PackageBuilder{
    Package p;
    public void createPackage(){
        p = new Package();
        buildTransportation();
        buildAccomodation();
        buildActivities();

    }

    public abstract void buildTransportation();
    public abstract void buildAccomodation();
    public abstract void buildActivities();


}