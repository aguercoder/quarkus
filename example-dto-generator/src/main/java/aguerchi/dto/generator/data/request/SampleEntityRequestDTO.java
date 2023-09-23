package aguerchi.dto.generator.data.request;
import java.util.Date;

public class SampleEntityRequestDTO {
    private Date dateField;
    private Boolean objectBooleanField;
    private String stringField;

    public Date getDateField() {
        return dateField;
    }
    public void setDateField(Date dateField) {
        this.dateField = dateField;
    }
    public Boolean getObjectBooleanField() {
        return objectBooleanField;
    }
    public void setObjectBooleanField(Boolean objectBooleanField) {
        this.objectBooleanField = objectBooleanField;
    }
    public String getStringField() {
        return stringField;
    }
    public void setStringField(String stringField) {
        this.stringField = stringField;
    }
}
