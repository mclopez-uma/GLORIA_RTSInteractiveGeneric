
package eu.gloria.rt.entity.scheduler;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para plan complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="plan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://gloria.eu/rt/entity/scheduler}planState"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="errorDevId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="errorDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="execWindowStart" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="execWindowEnd" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="execMaxTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rtStart" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="rtSEnd" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan", propOrder = {
    "id",
    "user",
    "templateId",
    "state",
    "creationDate",
    "errorDevId",
    "errorCode",
    "errorDesc",
    "execWindowStart",
    "execWindowEnd",
    "execMaxTime",
    "rtStart",
    "rtSEnd"
})
public class Plan {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String user;
    @XmlElement(required = true)
    protected String templateId;
    @XmlElement(required = true)
    protected PlanState state;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(required = true)
    protected String errorDevId;
    @XmlElement(required = true)
    protected BigInteger errorCode;
    @XmlElement(required = true)
    protected String errorDesc;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar execWindowStart;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar execWindowEnd;
    protected long execMaxTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rtStart;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rtSEnd;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad templateId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Define el valor de la propiedad templateId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateId(String value) {
        this.templateId = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link PlanState }
     *     
     */
    public PlanState getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanState }
     *     
     */
    public void setState(PlanState value) {
        this.state = value;
    }

    /**
     * Obtiene el valor de la propiedad creationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Define el valor de la propiedad creationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad errorDevId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDevId() {
        return errorDevId;
    }

    /**
     * Define el valor de la propiedad errorDevId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDevId(String value) {
        this.errorDevId = value;
    }

    /**
     * Obtiene el valor de la propiedad errorCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getErrorCode() {
        return errorCode;
    }

    /**
     * Define el valor de la propiedad errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setErrorCode(BigInteger value) {
        this.errorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad errorDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDesc() {
        return errorDesc;
    }

    /**
     * Define el valor de la propiedad errorDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDesc(String value) {
        this.errorDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad execWindowStart.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecWindowStart() {
        return execWindowStart;
    }

    /**
     * Define el valor de la propiedad execWindowStart.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecWindowStart(XMLGregorianCalendar value) {
        this.execWindowStart = value;
    }

    /**
     * Obtiene el valor de la propiedad execWindowEnd.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecWindowEnd() {
        return execWindowEnd;
    }

    /**
     * Define el valor de la propiedad execWindowEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecWindowEnd(XMLGregorianCalendar value) {
        this.execWindowEnd = value;
    }

    /**
     * Obtiene el valor de la propiedad execMaxTime.
     * 
     */
    public long getExecMaxTime() {
        return execMaxTime;
    }

    /**
     * Define el valor de la propiedad execMaxTime.
     * 
     */
    public void setExecMaxTime(long value) {
        this.execMaxTime = value;
    }

    /**
     * Obtiene el valor de la propiedad rtStart.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRtStart() {
        return rtStart;
    }

    /**
     * Define el valor de la propiedad rtStart.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRtStart(XMLGregorianCalendar value) {
        this.rtStart = value;
    }

    /**
     * Obtiene el valor de la propiedad rtSEnd.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRtSEnd() {
        return rtSEnd;
    }

    /**
     * Define el valor de la propiedad rtSEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRtSEnd(XMLGregorianCalendar value) {
        this.rtSEnd = value;
    }

}
