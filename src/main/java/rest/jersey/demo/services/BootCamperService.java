package rest.jersey.demo.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import rest.jersey.demo.models.BootCamper;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootCamperService {
    private List<BootCamper> bootCamperList = new ArrayList<>();

    public List<BootCamper> getAll(){
        return bootCamperList;
    }

    public void add(BootCamper bootCamper){
        bootCamperList.add(bootCamper);
    }

    public BootCamper get(String nombre){
        for(BootCamper bootCamper: bootCamperList){
            if(bootCamper.getNombre().equals(nombre)){
                return bootCamper;
            }
        }
        return null;
    }



}
