package pl.pjwstk.jaz19545nbp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@RequestMapping("/nbp/")
public class NBPRestController {

    NBPService nbpService;

    public NBPRestController(NBPService nbpService) {
        this.nbpService = nbpService;
    }

    @GetMapping("/{crn}")
    public ResponseEntity<NBP> getCurrency(@PathVariable("crn") String currency,
                                           @RequestParam Date startdate,
                                           @RequestParam Date enddate){
        return ResponseEntity.ok(nbpService.getNBP(currency, startdate, enddate));
    }
}
