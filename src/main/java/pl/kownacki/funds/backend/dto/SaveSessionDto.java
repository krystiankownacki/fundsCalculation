package pl.kownacki.funds.backend.dto;

import lombok.Data;

import java.util.List;

@Data
public class SaveSessionDto {
    private List<Long> funds;
    private Integer totalAmount;
    private Long strategyId;
}
