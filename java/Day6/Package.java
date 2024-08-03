package Day6;

public class Package {
    Transportation t;
    Accomodations a;
    Activities act;

    public Transportation getT() {
        return t;
    }
    public void setT(Transportation t) {
        this.t = t;
    }
    public Accomodations getA() {
        return a;
    }
    public void setA(Accomodations a) {
        this.a = a;
    }
    public Activities getAct() {
        return act;
    }
    public void setAct(Activities act) {
        this.act = act;
    }
    

    public int getTotalPrice(){
        int totalPrice = t.getPrice()+ a.getPrice() + act.getPrice();
        return totalPrice;
        

    }
}
