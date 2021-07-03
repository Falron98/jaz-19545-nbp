package pl.pjwstk.jaz19545nbp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;

@Service
public class NBPService {

    RestTemplate restTemplate;
    private final String NBPServiceAddress;
    private NBPRepository nbpRepository;

    public NBPService(RestTemplate restTemplate, @Value("${nbp.service.address}") String NBPServiceAddress) {
        this.restTemplate = restTemplate;
        this.NBPServiceAddress = NBPServiceAddress;
    }


    public NBP getNBP(String crn, Date startdate, Date enddate){
        String url = NBPServiceAddress + "a/" + crn + "/" + startdate + "/" + enddate + "/";
        NBP nbp = restTemplate.getForObject(url, NBP.class);
        nbpRepository.save(nbp);
        return nbp;
    }
}
