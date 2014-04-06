
package iaws.ws.transports;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RatedLineType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RatedLineType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://iaws/ws/transports}LineType">
 *       &lt;attribute name="likes" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="dislikes" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatedLineType")
public class RatedLineType
    extends LineType
{

    @XmlAttribute(name = "likes")
    protected Long likes;
    @XmlAttribute(name = "dislikes")
    protected Long dislikes;

    /**
     * Obtient la valeur de la propriété likes.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLikes() {
        return likes;
    }

    /**
     * Définit la valeur de la propriété likes.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLikes(Long value) {
        this.likes = value;
    }

    /**
     * Obtient la valeur de la propriété dislikes.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDislikes() {
        return dislikes;
    }

    /**
     * Définit la valeur de la propriété dislikes.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDislikes(Long value) {
        this.dislikes = value;
    }

}
