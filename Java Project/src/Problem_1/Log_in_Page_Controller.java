package Problem_1;


//Since the username has to be unique, I will use a treemap since a treemap can have a unique
//key, in this case the key would be user name and value would be the account object
//this will be very fast since the BIG(O) is logn for all and the tree can grow 
//it is also good to note that the treemap can grow unlimited, so the number of accounts made 
//will not affect the performance







import java.net.URL;
import java.util.ResourceBundle;
import java.util.TreeMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Log_in_Page_Controller implements Initializable{
	public static TreeMap<String,Account> map=new TreeMap();
    @FXML
    private AnchorPane LogInSuccess_Text;

    @FXML
    private TextField Username_Textfield;

    @FXML
    private TextField Password_TextField;

    @FXML
    private Button Submit_btn;

    @FXML
    private Button Create_btn;

    
    @FXML
    private Text Answer_Text;

    @FXML
    void Create_btn_Clicked(ActionEvent event) {
    	
    	if (!map.containsKey(Username_Textfield.getText()))
    	{
    		Answer_Text.setVisible(false);
    		Account newaccount=new Account(Username_Textfield.getText(),Password_TextField.getText());
    		map.put(Username_Textfield.getText(), newaccount);
    		Answer_Text.setVisible(true);
    		Answer_Text.setText("User Created");
    		
    	}else
    	{
    		Answer_Text.setVisible(true);
    		Answer_Text.setText("Username Already Taken");
    	}
    	
    	
    	
    }
    
    

    @FXML
    void Submit_btn_Clicked(ActionEvent event) {
    	
     
    	if (map.get(Username_Textfield.getText()).getUsername().equals(Username_Textfield.getText())&&
    		map.get(Username_Textfield.getText()).getPassword().equals(Password_TextField.getText()))
    			
    	{
    		Answer_Text.setVisible(true);
    		Answer_Text.setText("Log in Successful");
    		
    	}
    	else
    	{
    		Answer_Text.setVisible(true);
    		Answer_Text.setText("Wrong Username or Password");
    	}
      	
      	
    }

    
    
    
    
    
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	
		
	}

}
