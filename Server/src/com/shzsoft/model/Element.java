package com.shzsoft.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeInfo;

import java.util.Objects;




/**
 * Generic configuration settings for a TRANSPORT@Web export wizard.
 **/
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-04-15T08:19:35.923Z")
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "wizardType"
)
public class Element {

    protected Long wizardID = null;
    protected Boolean isAvailable = false;
    protected String wizardName = null;
    protected String wizardType = null;
    protected String code=null;

    protected String targetSystem = null;
    protected String sourceSystem = null;
    protected int optimisticLock;


    /**
     * A universal unique identifier for this wizard.
     **/
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    /**
     * A unique identifier for this wizard.
     **/

    @JsonProperty("wizardID")
    public Long getWizardID() {
        return wizardID;
    }

    public void setWizardID(Long wizardID) {
        this.wizardID = wizardID;
    }

    /**
     * Flag whether this wizard is available (enabled) for the user.
     **/

    @JsonProperty("isAvailable")
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    /**
     * The name of this wizard
     **/

    @JsonProperty("wizardName")
    public String getWizardName() {
        return wizardName;
    }

    public void setWizardName(String wizardName) {
        this.wizardName = wizardName;
    }

    /**
     * The type of wizard this object represents.
     **/

    @JsonProperty("wizardType")
    public String getWizardType() {
        return wizardType;
    }

    public void setWizardType(String wizardType) {
        this.wizardType = wizardType;
    }

    /**
     * AET of the DICOM archive to which data shall be stored.
     **/

    @JsonProperty("targetSystem")
    public String getTargetSystem() {
        return targetSystem;
    }

    public void setTargetSystem(String targetSystem) {
        this.targetSystem = targetSystem;
    }

    /**
     * AET of the DICOM archive that shall be used to search for the patient reconciliation\nif the patientReconciliationType is MWL_SEARCH or DICOM_PATIENT_SEARCH. Otherwise this\nparameter will be ignored.\n
     **/

    @JsonProperty("sourceSystem")
    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    @JsonProperty("optimisticLock")
    public int getOptimisticLock() {
        return optimisticLock;
    }

    public void setOptimisticLock(int optimisticLock) {
        this.optimisticLock = optimisticLock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Element wizard = (Element) o;
        return Objects.equals(code, wizard.code)&&
                Objects.equals(wizardID, wizard.wizardID) &&
                Objects.equals(isAvailable, wizard.isAvailable) &&
                Objects.equals(wizardName, wizard.wizardName) &&
                Objects.equals(wizardType, wizard.wizardType)&&
                Objects.equals(sourceSystem, wizard.sourceSystem)&&
                Objects.equals(targetSystem, wizard.targetSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code,wizardID, isAvailable, wizardName, wizardType,sourceSystem,targetSystem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Wizard {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    wizardID: ").append(toIndentedString(wizardID)).append("\n");
        sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
        sb.append("    wizardName: ").append(toIndentedString(wizardName)).append("\n");
        sb.append("    wizardType: ").append(toIndentedString(wizardType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

