package food_delivery.controller;

import food_delivery.dto.LoginDTO;
import food_delivery.entity.LoginEntity;
import food_delivery.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-login")
public class LoginController {
    @Autowired
    LoginService loginService;

    @GetMapping("/get-all")
    public List<LoginEntity> getAllLogin(){
        return loginService.getAllLogin();
    }

    @GetMapping("/get-by-{id}")
    public LoginDTO getLoginById(@PathVariable Long id){
        return loginService.getLoginById(id);
    }

    @PostMapping("/save")
    public LoginDTO saveLogin(@RequestBody LoginDTO loginDTO){
        return loginService.saveLogin(loginDTO);
    }

    @DeleteMapping("/delete-by-{id}")
    public void deleteLoginById(@PathVariable Long id){
        loginService.deleteLoginById(id);
    }

    @PutMapping("/update-by-{id}")
    public LoginDTO updateLoginById(@RequestBody LoginDTO loginDTO, @PathVariable Long id){
        return loginService.updateLoginById(loginDTO, id);
    }


}
