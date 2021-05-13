package hay.foundation.mhfa.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class SupportAidFormReceipt {
    public SupportAidFormReceipt(@JsonProperty("id") Integer id,
                      @JsonProperty("support_aid_id") Integer supportAidId,
                      @JsonProperty("aid_form_id") Integer aidFormId,
                      @JsonProperty("date_assigned") Date date_assigned) {
        this.id = id;
        this.supportAidId = supportAidId;
        this.aidFormId = aidFormId;
        this.date_assigned = date_assigned;
    }
    public SupportAidFormReceipt(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="support_aid_id")
    private Integer supportAidId;
    @Column(name="aid_form_id")
    private Integer aidFormId;
    @Column(name="date_assigned")
    private Date date_assigned;
}
