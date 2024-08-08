package service;


import model.Technician;
import repository.TechnicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TechnicianService {

    @Autowired
    private TechnicianRepository technicianRepository;

    public List<Technician> getAllTechnicians() {
        return technicianRepository.findAll();
    }

    public Optional<Technician> getTechnicianById(Long id) {
        return technicianRepository.findById(id);
    }

    public Technician createTechnician(Technician technician) {
        return technicianRepository.save(technician);
    }

    public Technician updateTechnician(Long id, Technician technicianDetails) {
        Technician technician = technicianRepository.findById(id).orElseThrow();
        technician.setName(technicianDetails.getName());
        technician.setService(technicianDetails.getService());
        technician.setLocation(technicianDetails.getLocation());
        technician.setAvailability(technicianDetails.getAvailability());
        technician.setMobileNumber(technicianDetails.getMobileNumber());
        technician.setEmail(technicianDetails.getEmail());
        return technicianRepository.save(technician);
    }

    public void deleteTechnician(Long id) {
        technicianRepository.deleteById(id);
    }
}





