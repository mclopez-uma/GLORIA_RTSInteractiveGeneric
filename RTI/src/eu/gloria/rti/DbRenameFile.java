
package eu.gloria.rti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currentFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newFilename" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "deviceId",
    "currentFileName",
    "newFilename"
})
@XmlRootElement(name = "dbRenameFile")
public class DbRenameFile {

    @XmlElement(required = true)
    protected String session;
    @XmlElement(required = true)
    protected String deviceId;
    @XmlElement(required = true)
    protected String currentFileName;
    @XmlElement(required = true)
    protected String newFilename;

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
     * Obtiene el valor de la propiedad deviceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Define el valor de la propiedad deviceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Obtiene el valor de la propiedad currentFileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentFileName() {
        return currentFileName;
    }

    /**
     * Define el valor de la propiedad currentFileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentFileName(String value) {
        this.currentFileName = value;
    }

    /**
     * Obtiene el valor de la propiedad newFilename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewFilename() {
        return newFilename;
    }

    /**
     * Define el valor de la propiedad newFilename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewFilename(String value) {
        this.newFilename = value;
    }

}
