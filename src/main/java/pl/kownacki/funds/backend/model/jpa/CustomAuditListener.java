package pl.kownacki.funds.backend.model.jpa;

import java.time.LocalDate;

import javax.persistence.PrePersist;

public class CustomAuditListener {

	@PrePersist
    void onInsert(Object o){
        if(o instanceof AbstractEntity) {
            ((AbstractEntity) o).setDateCreate(LocalDate.now());
            ((AbstractEntity) o).setActiveFlag(Boolean.TRUE);
        }
    }
}
