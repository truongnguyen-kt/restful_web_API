/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import model.StudentDTO;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author 12345
 */
@Path("get")
public class getData {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public StudentDTO getJsonData() {
        StudentDTO dto = new StudentDTO("1", "an", 1);
        return dto;
    }
}
