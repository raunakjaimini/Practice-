import javax.imageio.spi.ServiceRegistry.Accomodations;
import javax.imageio.spi.ServiceRegistry.Activities;
import javax.imageio.spi.ServiceRegistry.Transportation;

public class Offer2 extends PackageOffer{
    public Offer2(){
        super(new Bus(), new Hotel(),new SeaCruises());
    }

    
}
