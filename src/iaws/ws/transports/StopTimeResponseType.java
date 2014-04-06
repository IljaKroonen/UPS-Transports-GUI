
package iaws.ws.transports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour StopTimeResponseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopTimeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="line" type="{http://iaws/ws/transports}LineType"/>
 *         &lt;element name="stopPoint" type="{http://iaws/ws/transports}StopPointType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopTimeResponseType", propOrder = {
    "line",
    "stopPoint"
})
public class StopTimeResponseType {

    @XmlElement(required = true)
    protected LineType line;
    @XmlElement(required = true)
    protected StopPointType stopPoint;
    @XmlAttribute(name = "date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;

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

    /**
     * Obtient la valeur de la propriété date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Définit la valeur de la propriété date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
