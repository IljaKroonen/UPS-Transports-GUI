
package iaws.ws.transports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AvailableBikesResponseType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AvailableBikesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="station" type="{http://iaws/ws/transports}BikeStationType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="availableBikes" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableBikesResponseType", propOrder = {
    "station"
})
public class AvailableBikesResponseType {

    @XmlElement(required = true)
    protected BikeStationType station;
    @XmlAttribute(name = "availableBikes")
    protected Long availableBikes;

    /**
     * Obtient la valeur de la propriété station.
     * 
     * @return
     *     possible object is
     *     {@link BikeStationType }
     *     
     */
    public BikeStationType getStation() {
        return station;
    }

    /**
     * Définit la valeur de la propriété station.
     * 
     * @param value
     *     allowed object is
     *     {@link BikeStationType }
     *     
     */
    public void setStation(BikeStationType value) {
        this.station = value;
    }

    /**
     * Obtient la valeur de la propriété availableBikes.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailableBikes() {
        return availableBikes;
    }

    /**
     * Définit la valeur de la propriété availableBikes.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailableBikes(Long value) {
        this.availableBikes = value;
    }

}
