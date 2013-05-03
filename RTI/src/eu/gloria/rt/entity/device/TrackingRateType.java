
package eu.gloria.rt.entity.device;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para trackingRateType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="trackingRateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DriveSidereal"/>
 *     &lt;enumeration value="DriveLunar"/>
 *     &lt;enumeration value="DriveSolar"/>
 *     &lt;enumeration value="DriveKing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "trackingRateType")
@XmlEnum
public enum TrackingRateType {

    @XmlEnumValue("DriveSidereal")
    DRIVE_SIDEREAL("DriveSidereal"),
    @XmlEnumValue("DriveLunar")
    DRIVE_LUNAR("DriveLunar"),
    @XmlEnumValue("DriveSolar")
    DRIVE_SOLAR("DriveSolar"),
    @XmlEnumValue("DriveKing")
    DRIVE_KING("DriveKing");
    private final String value;

    TrackingRateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrackingRateType fromValue(String v) {
        for (TrackingRateType c: TrackingRateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
