package com.example.demo.resources;

import com.example.demo.model.Address;
import com.example.demo.service.AddressService;
import javassist.tools.web.BadHttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/homes")
public class HomeController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> getAllAddress(){
        return addressService.getAllAddressDetails();
    }

    @PostMapping
    public ResponseEntity<Address> createAddress(@RequestBody Address address) {
        if (address.getId()!=null) {
            return new ResponseEntity<Address>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Address>(addressService.createOrUpdate(address), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Address> updateAddress(@RequestBody Address address) {
        if (address.getId()==null) {
            return new ResponseEntity<Address>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Address>(addressService.createOrUpdate(address), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable("id") Integer id) {
        addressService.delete(id);
    }



}
