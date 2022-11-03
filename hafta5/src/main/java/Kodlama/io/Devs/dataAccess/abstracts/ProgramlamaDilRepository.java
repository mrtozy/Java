package Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgramlamaDilRepository extends JpaRepository<ProgrammingLanguage, Integer> {

}