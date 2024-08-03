
import java.io.Serial;
import java.io.Serializable;



public abstract class PackageOffer implements Serializable {
    public Transportation t;
    public Accomodation a;
    public Activities act;

    public PackageOffer(Transportation t, Accomodation a, Activities act){
        this.t = t;
        this.a= a;
        this.act = act;

    }

    public int getTotalPrice(){
        int totalPrice = t.getPrice() + a.getPrice()+ act.getPrice();
        return totalPrice;


    }
    @Override 
    public String toString(){
        return "Transportation: "+ t + "Accomodation" + a + "Activities"+act; 
    }

    

}
