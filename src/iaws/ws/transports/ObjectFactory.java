
package iaws.ws.transports;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the iaws.ws.transports package. 
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

    private final static QName _RateRequest_QNAME = new QName("http://iaws/ws/transports", "RateRequest");
    private final static QName _BikeStationsRequest_QNAME = new QName("http://iaws/ws/transports", "BikeStationsRequest");
    private final static QName _StopPointsResponse_QNAME = new QName("http://iaws/ws/transports", "StopPointsResponse");
    private final static QName _StopTimeResponse_QNAME = new QName("http://iaws/ws/transports", "StopTimeResponse");
    private final static QName _LinesRequest_QNAME = new QName("http://iaws/ws/transports", "LinesRequest");
    private final static QName _AvailableBikesRequest_QNAME = new QName("http://iaws/ws/transports", "AvailableBikesRequest");
    private final static QName _LinesResponse_QNAME = new QName("http://iaws/ws/transports", "LinesResponse");
    private final static QName _AvailableBikesResponse_QNAME = new QName("http://iaws/ws/transports", "AvailableBikesResponse");
    private final static QName _BikeStationsResponse_QNAME = new QName("http://iaws/ws/transports", "BikeStationsResponse");
    private final static QName _StopTimeRequest_QNAME = new QName("http://iaws/ws/transports", "StopTimeRequest");
    private final static QName _StopPointsRequest_QNAME = new QName("http://iaws/ws/transports", "StopPointsRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: iaws.ws.transports
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StopPointsRequestType }
     * 
     */
    public StopPointsRequestType createStopPointsRequestType() {
        return new StopPointsRequestType();
    }

    /**
     * Create an instance of {@link StopTimeRequestType }
     * 
     */
    public StopTimeRequestType createStopTimeRequestType() {
        return new StopTimeRequestType();
    }

    /**
     * Create an instance of {@link BikeStationsResponseType }
     * 
     */
    public BikeStationsResponseType createBikeStationsResponseType() {
        return new BikeStationsResponseType();
    }

    /**
     * Create an instance of {@link AvailableBikesResponseType }
     * 
     */
    public AvailableBikesResponseType createAvailableBikesResponseType() {
        return new AvailableBikesResponseType();
    }

    /**
     * Create an instance of {@link LinesResponseType }
     * 
     */
    public LinesResponseType createLinesResponseType() {
        return new LinesResponseType();
    }

    /**
     * Create an instance of {@link AvailableBikesRequestType }
     * 
     */
    public AvailableBikesRequestType createAvailableBikesRequestType() {
        return new AvailableBikesRequestType();
    }

    /**
     * Create an instance of {@link LinesRequestType }
     * 
     */
    public LinesRequestType createLinesRequestType() {
        return new LinesRequestType();
    }

    /**
     * Create an instance of {@link StopTimeResponseType }
     * 
     */
    public StopTimeResponseType createStopTimeResponseType() {
        return new StopTimeResponseType();
    }

    /**
     * Create an instance of {@link StopPointsResponseType }
     * 
     */
    public StopPointsResponseType createStopPointsResponseType() {
        return new StopPointsResponseType();
    }

    /**
     * Create an instance of {@link BikeStationsRequestType }
     * 
     */
    public BikeStationsRequestType createBikeStationsRequestType() {
        return new BikeStationsRequestType();
    }

    /**
     * Create an instance of {@link RateRequestType }
     * 
     */
    public RateRequestType createRateRequestType() {
        return new RateRequestType();
    }

    /**
     * Create an instance of {@link BikeStationType }
     * 
     */
    public BikeStationType createBikeStationType() {
        return new BikeStationType();
    }

    /**
     * Create an instance of {@link StopPointType }
     * 
     */
    public StopPointType createStopPointType() {
        return new StopPointType();
    }

    /**
     * Create an instance of {@link LineType }
     * 
     */
    public LineType createLineType() {
        return new LineType();
    }

    /**
     * Create an instance of {@link RatedLineType }
     * 
     */
    public RatedLineType createRatedLineType() {
        return new RatedLineType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iaws/ws/transports", name = "RateRequest")
    public JAXBElement<RateRequestType> createRateRequest(RateRequestType value) {
        return new JAXBElement<RateRequestType>(_RateRequest_QNAME, RateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BikeStationsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iaws/ws/transports", name = "BikeStationsRequest")
    public JAXBElement<BikeStationsRequestType> createBikeStationsRequest(BikeStationsRequestType value) {
        return new JAXBElement<BikeStationsRequestType>(_BikeStationsRequest_QNAME, BikeStationsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPointsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iaws/ws/transports", name = "StopPointsResponse")
    public JAXBElement<StopPointsResponseType> createStopPointsResponse(StopPointsResponseType value) {
        return new JAXBElement<StopPointsResponseType>(_StopPointsResponse_QNAME, StopPointsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopTimeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iaws/ws/transports", name = "StopTimeResponse")
    public JAXBElement<StopTimeResponseType> createStopTimeResponse(StopTimeResponseType value) {
        return new JAXBElement<StopTimeResponseType>(_StopTimeResponse_QNAME, StopTimeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iaws/ws/transports", name = "LinesRequest")
    public JAXBElement<LinesRequestType> createLinesRequest(LinesRequestType value) {
        return new JAXBElement<LinesRequestType>(_LinesRequest_QNAME, LinesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailableBikesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iaws/ws/transports", name = "AvailableBikesRequest")
    public JAXBElement<AvailableBikesRequestType> createAvailableBikesRequest(AvailableBikesRequestType value) {
        return new JAXBElement<AvailableBikesRequestType>(_AvailableBikesRequest_QNAME, AvailableBikesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iaws/ws/transports", name = "LinesResponse")
    public JAXBElement<LinesResponseType> createLinesResponse(LinesResponseType value) {
        return new JAXBElement<LinesResponseType>(_LinesResponse_QNAME, LinesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailableBikesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iaws/ws/transports", name = "AvailableBikesResponse")
    public JAXBElement<AvailableBikesResponseType> createAvailableBikesResponse(AvailableBikesResponseType value) {
        return new JAXBElement<AvailableBikesResponseType>(_AvailableBikesResponse_QNAME, AvailableBikesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BikeStationsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iaws/ws/transports", name = "BikeStationsResponse")
    public JAXBElement<BikeStationsResponseType> createBikeStationsResponse(BikeStationsResponseType value) {
        return new JAXBElement<BikeStationsResponseType>(_BikeStationsResponse_QNAME, BikeStationsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopTimeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iaws/ws/transports", name = "StopTimeRequest")
    public JAXBElement<StopTimeRequestType> createStopTimeRequest(StopTimeRequestType value) {
        return new JAXBElement<StopTimeRequestType>(_StopTimeRequest_QNAME, StopTimeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPointsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iaws/ws/transports", name = "StopPointsRequest")
    public JAXBElement<StopPointsRequestType> createStopPointsRequest(StopPointsRequestType value) {
        return new JAXBElement<StopPointsRequestType>(_StopPointsRequest_QNAME, StopPointsRequestType.class, null, value);
    }

}
