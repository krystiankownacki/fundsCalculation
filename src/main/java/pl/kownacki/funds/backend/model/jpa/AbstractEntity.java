package pl.kownacki.funds.backend.model.jpa;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class, CustomAuditListener.class})
public abstract class AbstractEntity implements Serializable {

    @Column(name = "ACTIVE_FLAG")
    private Boolean activeFlag;

    @CreatedDate
    @Column(name = "DATE_CREATE")
    @NotNull
    @Convert(converter = LocalDateToStringConverter.class)
    private LocalDate dateCreate;

}
