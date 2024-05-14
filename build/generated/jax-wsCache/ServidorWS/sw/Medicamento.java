
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para medicamento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="medicamento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_producto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre_pro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo_medi" type="{http://SW/}tipoMedicamento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicamento", propOrder = {
    "idProducto",
    "nombrePro",
    "tipoMedi"
})
public class Medicamento {

    @XmlElement(name = "id_producto")
    protected int idProducto;
    @XmlElement(name = "nombre_pro")
    protected String nombrePro;
    @XmlElement(name = "tipo_medi")
    protected TipoMedicamento tipoMedi;

    /**
     * Obtiene el valor de la propiedad idProducto.
     * 
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Define el valor de la propiedad idProducto.
     * 
     */
    public void setIdProducto(int value) {
        this.idProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePro() {
        return nombrePro;
    }

    /**
     * Define el valor de la propiedad nombrePro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePro(String value) {
        this.nombrePro = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMedi.
     * 
     * @return
     *     possible object is
     *     {@link TipoMedicamento }
     *     
     */
    public TipoMedicamento getTipoMedi() {
        return tipoMedi;
    }

    /**
     * Define el valor de la propiedad tipoMedi.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMedicamento }
     *     
     */
    public void setTipoMedi(TipoMedicamento value) {
        this.tipoMedi = value;
    }

}
