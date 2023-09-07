package com.Softnerve.PatientAPIs.repositorty;

import com.Softnerve.PatientAPIs.Model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {
}