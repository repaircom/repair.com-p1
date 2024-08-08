package service;

import model.Schedule;
import repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    public Optional<Schedule> getScheduleById(Long id) {
        return scheduleRepository.findById(id);
    }

    public Schedule createSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    public Schedule updateSchedule(Long id, Schedule scheduleDetails) {
        Schedule schedule = scheduleRepository.findById(id).orElseThrow();
        schedule.setTechnician(scheduleDetails.getTechnician());
        schedule.setAvailableDate(scheduleDetails.getAvailableDate());
        schedule.setAvailableTime(scheduleDetails.getAvailableTime());
        return scheduleRepository.save(schedule);
    }

    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }
}
