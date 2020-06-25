package springbootrunnerconfigurationproperties.springbootrunnerconfigurationproperties.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {

    @Autowired
     Helper helper;

    @GetMapping("/")
    public ResponseEntity<?> fn(){
       return new  ResponseEntity<>( helper.greeting("from controller" ), HttpStatus.OK);
    }
}
