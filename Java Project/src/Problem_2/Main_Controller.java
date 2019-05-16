package Problem_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Main_Controller {
	public HashMap<String,Chargeable> map=new HashMap<>((30+200+100)*2);
	public int numofcars=0;
	public int numoftrucks=0;
	public int numofpedestrians=0;
	public int numofbikes=0;
	
	
//	public int currentcharge=0;
	public int totalcharge=0;
	
	
	@FXML
    private Button Pedestrain_btn;

    @FXML
    private Button truck_btn;

    @FXML
    private Button bike_btn;

    @FXML
    private Text Charge_text;

    @FXML
    private Text Total_Charge_text;

    @FXML
    private TextField TetxField;
    
    
    @FXML
    private Button Car_btn;
    @FXML
    private Text Warning_text;

    @FXML
    void Car_btn_Clicked(ActionEvent event) {
    	if(numofcars<200&!map.containsKey(TetxField.getText()))
    	{
    		Warning_text.setVisible(false);
    		numofcars++;
    		
    		
    		Chargeable p1=new Car(TetxField.getText());
    		
    		PutChargeableandDisplay(p1);
    		

    	}
    	else {
    		Warning_text.setVisible(true);
    		Warning_text.setText("ID Already taken or not Space for that Chargeable");
    		
    	}

    }
    
    
    
    @FXML
    void Pedestrian_btn_Clicked(ActionEvent event) {
    	
    	if(numofpedestrians<200&!map.containsKey(TetxField.getText()))
    	{
    		Warning_text.setVisible(false);
    		numofpedestrians++;
    		
    		
    		Chargeable p1=new Pedestrian(TetxField.getText());
    		PutChargeableandDisplay(p1);
    		

    	}else {
    		Warning_text.setVisible(true);
    		Warning_text.setText("ID Already taken or not Space for that Chargeable");
    		
    	}
    	
    	
    	
    }
    
    

    @FXML
    void bike_btn_Clicked(ActionEvent event) {
    	
    	
    	if(numofbikes<100&&!map.containsKey(TetxField.getText()))
    	{
    		Warning_text.setVisible(false);
    		numofbikes++;
    		
    		
    		Chargeable p1=new Bike(TetxField.getText());
    		PutChargeableandDisplay(p1);

    	}else {
    		Warning_text.setVisible(true);
    		Warning_text.setText("ID Already taken or not Space for that Chargeable");
    		
    	}

    }

    @FXML
    void truck_btn_Clicked(ActionEvent event) {
    	
    	if(numoftrucks<30&&!map.containsKey(TetxField.getText()))
    	{
    		Warning_text.setVisible(false);
    		numoftrucks++;
    		Chargeable p1=new Truck(TetxField.getText());
    		PutChargeableandDisplay(p1);

    	}else {
    		Warning_text.setVisible(true);
    		Warning_text.setText("ID Already taken or not Space for that Chargeable");
    		
    	}
    	
    	

    }
    
    
	public void PutChargeableandDisplay(Chargeable p1)
	{
		map.put(TetxField.getText(), p1);
		 
		int currentcharge=p1.charge();
		String chargestr=  Integer.toString(currentcharge);
		Charge_text.setText(chargestr);
		

		totalcharge=totalcharge+p1.charge();
		String totalchargestr=  Integer.toString(totalcharge);
		Total_Charge_text.setText(totalchargestr);
	}
    
 
    
    
    
    
    
    
    

}
