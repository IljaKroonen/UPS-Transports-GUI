
package iaws.ws.transports;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RateActionType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RateActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="like"/>
 *     &lt;enumeration value="dislike"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateActionType")
@XmlEnum
public enum RateActionType {

    @XmlEnumValue("like")
    LIKE("like"),
    @XmlEnumValue("dislike")
    DISLIKE("dislike");
    private final String value;

    RateActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RateActionType fromValue(String v) {
        for (RateActionType c: RateActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
