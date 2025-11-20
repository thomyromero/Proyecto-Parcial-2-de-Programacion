package proyectonuevofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
    
import javafx.stage.Stage;

 
public class ProyectoNuevoFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../Vistas/vista.fxml"));
        
        Scene scene = new Scene(loader.load());
        
        stage.setScene(scene);
        
        stage.setTitle("Appalumnos");
        
        stage.show();
        
        
        
        
        
    }

        
    
    
    public static void main(String[] args) {   
        Application.launch(args);
    }
    
}
