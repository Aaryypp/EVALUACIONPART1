
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoMedicamento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoMedicamento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_tipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre_tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoMedicamento", propOrder = {
    "idTipo",
    "nombreTipo"
})
public class TipoMedicamento {

    @XmlElement(name = "id_tipo")
    protected int idTipo;
    @XmlElement(name = "nombre_tipo")
    protected String nombreTipo;

    /**
     * Obtiene el valor de la propiedad idTipo.
     * 
     */
    public int getIdTipo() {
        return idTipo;
    }

    /**
     * Define el valor de la propiedad idTipo.
     * 
     */
    public void setIdTipo(int value) {
        this.idTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTipo() {
        return nombreTipo;
    }

    /**
     * Define el valor de la propiedad nombreTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTipo(String value) {
        this.nombreTipo = value;
    }

}
