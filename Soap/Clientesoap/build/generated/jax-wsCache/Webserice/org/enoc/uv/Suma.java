
package org.enoc.uv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para suma complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="suma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suma", propOrder = {
    "x",
    "y"
})
public class Suma {

    protected Integer x;
    protected Integer y;

    /**
     * Obtiene el valor de la propiedad x.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getX() {
        return x;
    }

    /**
     * Define el valor de la propiedad x.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setX(Integer value) {
        this.x = value;
    }

    /**
     * Obtiene el valor de la propiedad y.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getY() {
        return y;
    }

    /**
     * Define el valor de la propiedad y.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setY(Integer value) {
        this.y = value;
    }

}
