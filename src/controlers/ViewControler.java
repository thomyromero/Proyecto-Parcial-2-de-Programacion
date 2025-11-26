package controlers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
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
        
        this.abrirFormulario(null);
    }
    
    @FXML
    private void modificar(ActionEvent e){
        
        Alumno seleccionado = this.listViewAlumnos.getSelectionModel().getSelectedItem();
        
        if(seleccionado != null)
        this.abrirFormulario(seleccionado);
            
        
        
    }
    
    private void abrirFormulario(Alumno alumnoExistente){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../Vistas/formulario.fxml"));
        
            Scene scene = new Scene(loader.load());
            
            
            
            FormularioController controller = loader.getController();
            
            controller.setAlumno(alumnoExistente);
            
            Stage stage = new Stage();
            
            stage.initModality(Modality.APPLICATION_MODAL);
            
            stage.setScene(scene);
            
            stage.showAndWait();
            
            Alumno resultado = controller.getAlumno();  
        
            if (resultado != null){
                
                // Para entrar a aun alumno nuevo
                if(alumnoExistente == null){
                    if(!this.listaAlumnos.contains(resultado)){
                        this.listaAlumnos.add(resultado);
                    }
                }
                
                this.actualizarListView();
            }
        
        
        } catch (Exception e) {
            
        }
    }
    
        private void actualizarListView(){
            this.listViewAlumnos.getItems().clear();
            this.listViewAlumnos.getItems().addAll(this.listaAlumnos);
            
            
    }
        
    }
    
   // private void abrirFormulario(Alumno alumno()
    

