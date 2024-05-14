
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EliminarMedicamento_QNAME = new QName("http://SW/", "EliminarMedicamento");
    private final static QName _EliminarMedicamentoResponse_QNAME = new QName("http://SW/", "EliminarMedicamentoResponse");
    private final static QName _Mostramedica_QNAME = new QName("http://SW/", "Mostramedica");
    private final static QName _MostramedicaResponse_QNAME = new QName("http://SW/", "MostramedicaResponse");
    private final static QName _Mostrarfarma_QNAME = new QName("http://SW/", "Mostrarfarma");
    private final static QName _MostrarfarmaResponse_QNAME = new QName("http://SW/", "MostrarfarmaResponse");
    private final static QName _Mostrarsucurs_QNAME = new QName("http://SW/", "Mostrarsucurs");
    private final static QName _MostrarsucursResponse_QNAME = new QName("http://SW/", "MostrarsucursResponse");
    private final static QName _Mostratipos_QNAME = new QName("http://SW/", "Mostratipos");
    private final static QName _MostratiposResponse_QNAME = new QName("http://SW/", "MostratiposResponse");
    private final static QName _Hello_QNAME = new QName("http://SW/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://SW/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminarMedicamento }
     * 
     */
    public EliminarMedicamento createEliminarMedicamento() {
        return new EliminarMedicamento();
    }

    /**
     * Create an instance of {@link EliminarMedicamentoResponse }
     * 
     */
    public EliminarMedicamentoResponse createEliminarMedicamentoResponse() {
        return new EliminarMedicamentoResponse();
    }

    /**
     * Create an instance of {@link Mostramedica }
     * 
     */
    public Mostramedica createMostramedica() {
        return new Mostramedica();
    }

    /**
     * Create an instance of {@link MostramedicaResponse }
     * 
     */
    public MostramedicaResponse createMostramedicaResponse() {
        return new MostramedicaResponse();
    }

    /**
     * Create an instance of {@link Mostrarfarma }
     * 
     */
    public Mostrarfarma createMostrarfarma() {
        return new Mostrarfarma();
    }

    /**
     * Create an instance of {@link MostrarfarmaResponse }
     * 
     */
    public MostrarfarmaResponse createMostrarfarmaResponse() {
        return new MostrarfarmaResponse();
    }

    /**
     * Create an instance of {@link Mostrarsucurs }
     * 
     */
    public Mostrarsucurs createMostrarsucurs() {
        return new Mostrarsucurs();
    }

    /**
     * Create an instance of {@link MostrarsucursResponse }
     * 
     */
    public MostrarsucursResponse createMostrarsucursResponse() {
        return new MostrarsucursResponse();
    }

    /**
     * Create an instance of {@link Mostratipos }
     * 
     */
    public Mostratipos createMostratipos() {
        return new Mostratipos();
    }

    /**
     * Create an instance of {@link MostratiposResponse }
     * 
     */
    public MostratiposResponse createMostratiposResponse() {
        return new MostratiposResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Sucursal }
     * 
     */
    public Sucursal createSucursal() {
        return new Sucursal();
    }

    /**
     * Create an instance of {@link Farmacia }
     * 
     */
    public Farmacia createFarmacia() {
        return new Farmacia();
    }

    /**
     * Create an instance of {@link Medicamento }
     * 
     */
    public Medicamento createMedicamento() {
        return new Medicamento();
    }

    /**
     * Create an instance of {@link TipoMedicamento }
     * 
     */
    public TipoMedicamento createTipoMedicamento() {
        return new TipoMedicamento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarMedicamento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarMedicamento }{@code >}
     */
    @XmlElementDecl(namespace = "http://SW/", name = "EliminarMedicamento")
    public JAXBElement<EliminarMedicamento> createEliminarMedicamento(EliminarMedicamento value) {
        return new JAXBElement<EliminarMedicamento>(_EliminarMedicamento_QNAME, EliminarMedicamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarMedicamentoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarMedicamentoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SW/", name = "EliminarMedicamentoResponse")
    public JAXBElement<EliminarMedicamentoResponse> createEliminarMedicamentoResponse(EliminarMedicamentoResponse value) {
        return new JAXBElement<EliminarMedicamentoResponse>(_EliminarMedicamentoResponse_QNAME, EliminarMedicamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mostramedica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Mostramedica }{@code >}
     */
    @XmlElementDecl(namespace = "http://SW/", name = "Mostramedica")
    public JAXBElement<Mostramedica> createMostramedica(Mostramedica value) {
        return new JAXBElement<Mostramedica>(_Mostramedica_QNAME, Mostramedica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostramedicaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MostramedicaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SW/", name = "MostramedicaResponse")
    public JAXBElement<MostramedicaResponse> createMostramedicaResponse(MostramedicaResponse value) {
        return new JAXBElement<MostramedicaResponse>(_MostramedicaResponse_QNAME, MostramedicaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mostrarfarma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Mostrarfarma }{@code >}
     */
    @XmlElementDecl(namespace = "http://SW/", name = "Mostrarfarma")
    public JAXBElement<Mostrarfarma> createMostrarfarma(Mostrarfarma value) {
        return new JAXBElement<Mostrarfarma>(_Mostrarfarma_QNAME, Mostrarfarma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarfarmaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MostrarfarmaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SW/", name = "MostrarfarmaResponse")
    public JAXBElement<MostrarfarmaResponse> createMostrarfarmaResponse(MostrarfarmaResponse value) {
        return new JAXBElement<MostrarfarmaResponse>(_MostrarfarmaResponse_QNAME, MostrarfarmaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mostrarsucurs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Mostrarsucurs }{@code >}
     */
    @XmlElementDecl(namespace = "http://SW/", name = "Mostrarsucurs")
    public JAXBElement<Mostrarsucurs> createMostrarsucurs(Mostrarsucurs value) {
        return new JAXBElement<Mostrarsucurs>(_Mostrarsucurs_QNAME, Mostrarsucurs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarsucursResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MostrarsucursResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SW/", name = "MostrarsucursResponse")
    public JAXBElement<MostrarsucursResponse> createMostrarsucursResponse(MostrarsucursResponse value) {
        return new JAXBElement<MostrarsucursResponse>(_MostrarsucursResponse_QNAME, MostrarsucursResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mostratipos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Mostratipos }{@code >}
     */
    @XmlElementDecl(namespace = "http://SW/", name = "Mostratipos")
    public JAXBElement<Mostratipos> createMostratipos(Mostratipos value) {
        return new JAXBElement<Mostratipos>(_Mostratipos_QNAME, Mostratipos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostratiposResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MostratiposResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SW/", name = "MostratiposResponse")
    public JAXBElement<MostratiposResponse> createMostratiposResponse(MostratiposResponse value) {
        return new JAXBElement<MostratiposResponse>(_MostratiposResponse_QNAME, MostratiposResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://SW/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SW/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
