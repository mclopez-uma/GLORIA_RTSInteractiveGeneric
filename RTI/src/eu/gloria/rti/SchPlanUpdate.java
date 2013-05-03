
package eu.gloria.rti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="idTmpl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xmlMapping" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="execWindowStart" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="execWindowEnd" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="execMaxTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "idTmpl",
    "xmlMapping",
    "execWindowStart",
    "execWindowEnd",
    "execMaxTime"
})
@XmlRootElement(name = "schPlanUpdate")
public class SchPlanUpdate {

    @XmlElement(required = true)
    protected String session;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected String idTmpl;
    @XmlElement(required = true, nillable = true)
    protected String xmlMapping;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar execWindowStart;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar execWindowEnd;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long execMaxTime;

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
     * Obtiene el valor de la propiedad idTmpl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTmpl() {
        return idTmpl;
    }

    /**
     * Define el valor de la propiedad idTmpl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTmpl(String value) {
        this.idTmpl = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlMapping.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlMapping() {
        return xmlMapping;
    }

    /**
     * Define el valor de la propiedad xmlMapping.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlMapping(String value) {
        this.xmlMapping = value;
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
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExecMaxTime() {
        return execMaxTime;
    }

    /**
     * Define el valor de la propiedad execMaxTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExecMaxTime(Long value) {
        this.execMaxTime = value;
    }

}
