package Beytullah.hrms.business.abstracts;

import Beytullah.hrms.core.utilities.results.DataResult;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.dto.CandidateCvDto;
import Beytullah.hrms.entities.concretes.Candidate;

import java.util.List;

public interface CandidateCvService {
    DataResult<List<Candidate>> getAll();

    DataResult<List<CandidateCvDto>> getDetails();
    Result add(Candidate candidateCv);
}
