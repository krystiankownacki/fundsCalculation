package pl.kownacki.funds.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kownacki.funds.backend.dao.FundRepository;
import pl.kownacki.funds.backend.dto.SaveSessionDto;
import pl.kownacki.funds.backend.dto.SessionDto;
import pl.kownacki.funds.backend.model.jpa.Fund;

import java.util.List;

@Service
public class SessionServiceImpl implements SessionService{

    @Autowired
    FundRepository fundRepository;

    @Override
    public SessionDto buyFunds(SaveSessionDto saveSessionDto) {

        List<Fund> choosenFunds = fundRepository.findAllByIdIn(saveSessionDto.getFunds());
        return null;
    }
}
