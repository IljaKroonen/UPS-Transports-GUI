
package iaws.ws.transports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AvailableBikesRequestType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AvailableBikesRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="station" type="{http://iaws/ws/transports}BikeStationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableBikesRequestType", propOrder = {
    "station"
})
public class AvailableBikesRequestType {

    @XmlElement(required = true)
    protected BikeStationType station;

    /**
     * Obtient la valeur de la propri�t� station.
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
     * D�finit la valeur de la propri�t� station.
     * 
     * @param value
     *     allowed object is
     *     {@link BikeStationType }
     *     
     */
    public void setStation(BikeStationType value) {
        this.station = value;
    }

}
