package tn.esprit.formation.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.formation.entities.Formation;
import tn.esprit.formation.services.FormationService;

import java.util.List;

@AllArgsConstructor
@RestController
public class FormationController {
    FormationService formationService;

    @GetMapping("/getAllFormations")
    public List<Formation> getAllFormations(){
        return formationService.getAllFormations();
    }


    @PostMapping("/addFormation")
    public Formation addFormation(@RequestBody Formation formation){
        return formationService.addFormation(formation);
    }

    @PutMapping("/updateFormation")
    public Formation updateFormation(@RequestBody Formation formation){
        return formationService.updateFormation(formation);
    }

    @GetMapping("/getFormationById/{idFormation}")
    public Formation getFormationById(@PathVariable("idFormation") long idFormation){
        return formationService.getFormationById(idFormation);
    }

    @DeleteMapping("/deleteFormation/{idFormation}")
    public void deleteFormation(@PathVariable("idFormation") long idFormation){
        formationService.deleteFormation(idFormation);
    }

}
