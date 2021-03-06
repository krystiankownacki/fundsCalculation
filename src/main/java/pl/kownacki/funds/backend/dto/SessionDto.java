package pl.kownacki.funds.backend.dto;

import lombok.Data;

import java.util.List;

@Data
public class SessionDto {
    private Long id;
    private List<TranscationDto> transcations;
    private Integer totalAmount;
    private Integer charge;
}
