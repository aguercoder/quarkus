package aguerchi.dto.generator;

import java.util.Date;

import com.agcodegen.quarkus.runtime.annotation.DtoGenerator;

import jakarta.persistence.Id;

@DtoGenerator
public class SampleEntity {

    @Id
    private Long id;

    private Boolean objectBooleanField;

    private String stringField;
    private Date dateField;

    // Constructeurs, getters et setters (omis pour plus de concision)

    public SampleEntity() {
        // Constructeur par défaut
    }
}