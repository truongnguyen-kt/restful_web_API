/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author 12345
 */
@ApplicationPath("api")
public class StudentApplication extends ResourceConfig{

    public StudentApplication() {
        packages("resource");
    }
    
}
