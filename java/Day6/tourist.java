package Day6;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

public void CustomizePanel6(){
    JPanel p6= new JPanel();
    TitledBorder titledBorder5 = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY,1),"Agency Control Panel",
    TitledBorder.CENTER,
    TitledBorder.DEFAULT_POSITION,
    myFont,
    myColor);
    p6.setBorder(titledBorder6);


    chatBn = new JButton("Start Live Chat");
    makeReservationBTN = new JButton("Make Reservation");
    searchLBL = new JLabel("Search Customer by Phone");
    searchField = new JTextField();
    makeSearch = new JButton("Search Customer");

    p6.add(chatBtn);
    p6.add(makeReservationBTN);
    p6.add(searchLBL);
    p6.add(searchField);
    p6.add(makeSearch);

    makeReservationBTN.addActionListener(e ->{
        MakeReservation();

    });
    makeSearch.addActionListener(e ->{
        SearchCustomerByMobileNb();

    });

    p6.setBounds(660,15,300,300);
    p6.setLayout(new GridLayout(10,1));

    setLayout(null);
    add(p6);




}


else{
    if(packageRadioBTN.isSelected()){
        
    }

}









