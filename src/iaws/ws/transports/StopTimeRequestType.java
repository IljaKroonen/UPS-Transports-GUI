
package iaws.ws.transports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour StopTimeRequestType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopTimeRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="line" type="{http://iaws/ws/transports}LineType"/>
 *         &lt;element name="stopPoint" type="{http://iaws/ws/transports}StopPointType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopTimeRequestType", propOrder = {
    "line",
    "stopPoint"
})
public class StopTimeRequestType {

    @XmlElement(required = true)
    protected LineType line;
    @XmlElement(required = true)
    protected StopPointType stopPoint;

    /**
     * Obtient la valeur de la propriété line.
     * 
     * @return
     *     possible object is
     *     {@link LineType }
     *     
     */
    public LineType getLine() {
        return line;
    }

    /**
     * Définit la valeur de la propriété line.
     * 
     * @param value
     *     allowed object is
     *     {@link LineType }
     *     
     */
    public void setLine(LineType value) {
        this.line = value;
    }

    /**
     * Obtient la valeur de la propriété stopPoint.
     * 
     * @return
     *     possible object is
     *     {@link StopPointType }
     *     
     */
    public StopPointType getStopPoint() {
        return stopPoint;
    }

    /**
     * Définit la valeur de la propriété stopPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointType }
     *     
     */
    public void setStopPoint(StopPointType value) {
        this.stopPoint = value;
    }

}
