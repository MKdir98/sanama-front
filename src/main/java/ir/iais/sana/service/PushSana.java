package ir.iais.sana.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2021-03-27T14:44:15.410+04:30
 * Generated source version: 3.3.5
 *
 */
@WebService(targetNamespace = "http://servicebus.sana.ir/PushSana/v4/", name = "PushSana")
@XmlSeeAlso({ObjectFactory.class})
public interface PushSana {

    @WebMethod
    @RequestWrapper(localName = "send", targetNamespace = "http://servicebus.sana.ir/PushSana/v4/", className = "ir.iais.sana.service.Send")
    @ResponseWrapper(localName = "sendResponse", targetNamespace = "http://servicebus.sana.ir/PushSana/v4/", className = "ir.iais.sana.service.SendResponse")
    @WebResult(name = "nextIndex", targetNamespace = "")
    public long send(

        @WebParam(name = "dataPart", targetNamespace = "")
        DataPart dataPart
    ) throws InternalServerExceptionException;

    @WebMethod
    @RequestWrapper(localName = "verify", targetNamespace = "http://servicebus.sana.ir/PushSana/v4/", className = "ir.iais.sana.service.Verify")
    @ResponseWrapper(localName = "verifyResponse", targetNamespace = "http://servicebus.sana.ir/PushSana/v4/", className = "ir.iais.sana.service.VerifyResponse")
    @WebResult(name = "resultId", targetNamespace = "")
    public long verify(

        @WebParam(name = "id", targetNamespace = "")
        long id,
        @WebParam(name = "lastIndex", targetNamespace = "")
        long lastIndex,
        @WebParam(name = "dataType", targetNamespace = "")
        String dataType
    ) throws DomainExceptionException, DataTypeNotSupportedExceptionException, InternalServerExceptionException, MisMatchIndexExceptionException;
}