package pl.kownacki.funds.backend.dto;

import lombok.Data;

@Data
public class TranscationDto {
    private Long id;
    private Long fundId;
    private Integer amount;
}
