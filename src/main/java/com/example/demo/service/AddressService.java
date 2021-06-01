package com.example.demo.service;

import com.example.demo.model.Address;
import com.example.demo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddressDetails(){
        return addressRepository.findAll().stream().collect(Collectors.toList());
    }

    public Address createOrUpdate(Address address){
        return addressRepository.save(address);
    }

    public void delete(Integer id){
        Optional<Address> address = addressRepository.findById(id);
        if(address.isPresent()){
            addressRepository.delete(address.get());
        }
    }

}
