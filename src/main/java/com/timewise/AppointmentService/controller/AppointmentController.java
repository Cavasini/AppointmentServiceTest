package com.timewise.AppointmentService.controller;
import com.timewise.AppointmentService.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

//    @Autowired
//    private AppointmentService appointmentService;
//
//    @GetMapping("/{userId}")
//    public ResponseEntity<Page<Appointment>> getAppointmentsByUser(@PathVariable("userId") String userId, @PageableDefault(size = 10, direction = Sort.Direction.ASC) Pageable pageable){
//        Page<Appointment> response = appointmentService.getAllAppointmentsByUserId(userId, pageable);
//        return ResponseEntity.ok(response);
//    }
//
//    @GetMapping("/appo/{id}")
//    public ResponseEntity getAppointmentById(
//            @PathVariable("id") String id
//    ){
//        Optional<Appointment> response = appointmentService.getAppointmentById(id);
//        if(response.isPresent()){
//            return ResponseEntity.ok(response);
//        }
//        return ResponseEntity.notFound().build();
//    }
//
//    @PostMapping
//    public ResponseEntity addAppointment(@RequestBody AppointmentPostRequest appointmentPostRequest) {
//        AppointmentPostResponse response = null;
//        try {
//            response = appointmentService.createAppointment(appointmentPostRequest);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        return ResponseEntity.ok(response);
//    }
//
//    @GetMapping("teste")
//    public ScheduleAvailabilityResponse teste(){
//        return appointmentService.getappo();
//    }

    @GetMapping
    public ResponseEntity<ResponseDTO> getTest(){
        return ResponseEntity.ok(new ResponseDTO("Deu Bom 3!"));
    }

}
