package controlers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import models.Alumno;

public class ViewControler implements Initializable {
    
    
    @FXML
    private ListView<Alumno> listViewAlumnos;
    
    @FXML
    private Button btnAgregar;
    
    @FXML
    private Button btnEliminar;
    
    @FXML
    private Button btnModificar;


    private List<Alumno> listaAlumnos; 
    
    
    
    
    
    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.listaAlumnos=new ArrayList<>();
        
    }    
    
    @FXML
    private void agregar(ActionEvent e){
        
        
    }
    
   // private void abrirFormulario(Alumno alumno()
    
}
