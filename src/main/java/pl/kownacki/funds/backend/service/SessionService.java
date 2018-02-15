package pl.kownacki.funds.backend.service;

import pl.kownacki.funds.backend.dto.SaveSessionDto;
import pl.kownacki.funds.backend.dto.SessionDto;

public interface SessionService {

    SessionDto buyFunds(SaveSessionDto saveSessionDto);
}
