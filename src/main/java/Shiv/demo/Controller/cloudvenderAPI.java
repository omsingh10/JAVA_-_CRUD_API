package Shiv.demo.Controller;


import Shiv.demo.model.Cloudvender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVender")
public class cloudvenderAPI {

    Cloudvender cloudvender;

    @GetMapping("{venderId}")
    public Cloudvender getvenderdetail(String venderId){

      return cloudvender;
//
//        new Cloudvender("c1", "vendername", "add1" , "5555" );
    }

    @PostMapping //Coz it's a create Request
public String createCloudVenderDetail( @RequestBody Cloudvender cloudvender){

        this.cloudvender = cloudvender;
        return "Cloud Vender Created Succesfully";

}

    @PutMapping  //Coz it's a create Request
    public String UbdateCloudVenderDetail( @RequestBody Cloudvender cloudvender){

        this.cloudvender = cloudvender;
        return "Cloud Vender Ubdated Succesfully";

    }

    @DeleteMapping("{venderId}")  //Coz it's a create Request
    public String DeleteCloudVenderDetail( String vendeId){

        this.cloudvender = null;
        return "Cloud Vender Deleted Succesfully";

    }

}
