
package eu.gloria.rti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.gloria.rt.entity.scheduler.PlanState;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://gloria.eu/rt/entity/scheduler}planState"/>
 *         &lt;element name="creationFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="creationTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="execWindowStartFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="execWindowStartTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="execWindowEndFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="execWindowEndTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="execMaxFrom" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="execMaxTo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "session",
    "id",
    "user",
    "state",
    "creationFrom",
    "creationTo",
    "execWindowStartFrom",
    "execWindowStartTo",
    "execWindowEndFrom",
    "execWindowEndTo",
    "execMaxFrom",
    "execMaxTo"
})
@XmlRootElement(name = "schPlanGet")
public class SchPlanGet {

    @XmlElement(required = true)
    protected String session;
    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected String user;
    @XmlElement(required = true, nillable = true)
    protected PlanState state;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationFrom;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationTo;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar execWindowStartFrom;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar execWindowStartTo;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar execWindowEndFrom;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar execWindowEndTo;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long execMaxFrom;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long execMaxTo;

    /**
     * Obtiene el valor de la propiedad session.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSession() {
        return session;
    }

    /**
     * Define el valor de la propiedad session.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSession(String value) {
        this.session = value;
    }

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
     * Obtiene el valor de la propiedad creationFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationFrom() {
        return creationFrom;
    }

    /**
     * Define el valor de la propiedad creationFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationFrom(XMLGregorianCalendar value) {
        this.creationFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad creationTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTo() {
        return creationTo;
    }

    /**
     * Define el valor de la propiedad creationTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTo(XMLGregorianCalendar value) {
        this.creationTo = value;
    }

    /**
     * Obtiene el valor de la propiedad execWindowStartFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecWindowStartFrom() {
        return execWindowStartFrom;
    }

    /**
     * Define el valor de la propiedad execWindowStartFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecWindowStartFrom(XMLGregorianCalendar value) {
        this.execWindowStartFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad execWindowStartTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecWindowStartTo() {
        return execWindowStartTo;
    }

    /**
     * Define el valor de la propiedad execWindowStartTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecWindowStartTo(XMLGregorianCalendar value) {
        this.execWindowStartTo = value;
    }

    /**
     * Obtiene el valor de la propiedad execWindowEndFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecWindowEndFrom() {
        return execWindowEndFrom;
    }

    /**
     * Define el valor de la propiedad execWindowEndFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecWindowEndFrom(XMLGregorianCalendar value) {
        this.execWindowEndFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad execWindowEndTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecWindowEndTo() {
        return execWindowEndTo;
    }

    /**
     * Define el valor de la propiedad execWindowEndTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecWindowEndTo(XMLGregorianCalendar value) {
        this.execWindowEndTo = value;
    }

    /**
     * Obtiene el valor de la propiedad execMaxFrom.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExecMaxFrom() {
        return execMaxFrom;
    }

    /**
     * Define el valor de la propiedad execMaxFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExecMaxFrom(Long value) {
        this.execMaxFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad execMaxTo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExecMaxTo() {
        return execMaxTo;
    }

    /**
     * Define el valor de la propiedad execMaxTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExecMaxTo(Long value) {
        this.execMaxTo = value;
    }

}
