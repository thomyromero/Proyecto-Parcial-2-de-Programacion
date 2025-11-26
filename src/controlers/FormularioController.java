package controlers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Alumno;


public class FormularioController implements Initializable {

    @FXML private ListView<Alumno> listViewAlumnos;
    @FXML private Button btnAceptar;
    @FXML private Button btnCancelar;
    @FXML private TextField txtLegajo;
    @FXML private TextField txtNombre;
    @FXML private TextField txtApellido;
    
    private boolean confirmado;
    private Alumno alumno;
    
    public Alumno getAlumno(){
        return this.confirmado ? this.alumno : null;
    }
    
    
    public void setAlumno(Alumno alumno){
        this.alumno = alumno;
        
        if(alumno != null){ 
            this.txtLegajo.setText(String.valueOf(alumno.getLegajo()));
            
            this.txtLegajo.setDisable(true);
            
            this.txtNombre.setText(alumno.getNombre());
            this.txtApellido.setText(alumno.getApellido());
        
        }
        
    }
    
    
    
    @FXML
    private void aceptar(){
        
        String legajo = this.txtLegajo.getText();
        String nombre = this.txtNombre.getText();
        String apellido = this.txtApellido.getText();
        
        if(this.alumno == null){
            this.alumno = new Alumno(nombre, apellido, Integer.parseInt(legajo));
        }else{
            
            this.alumno.setNombre(nombre);
            this.alumno.setApellido(apellido);
            this.alumno.setLegajo(Integer.parseInt(legajo));
            
        }
        
        this.confirmado = true;
        this.cerrarVentana();
    }
    
    
    private void cerrarVentana(){
        Stage stage = (Stage)this.btnCancelar.getScene().getWindow();
        
        stage.close();
    }
    
    
    
    @FXML 
    private void cancelar(){
        this.cerrarVentana();
    }
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
