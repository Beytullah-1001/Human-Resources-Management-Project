package Beytullah.hrms.dataAccess.abstracts;

import Beytullah.hrms.entities.concretes.CandidateCvSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateCvSkillDao extends JpaRepository<CandidateCvSkill,Integer> {
}
