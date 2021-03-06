
package ir.iais.sana.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.5
 * 2022-01-23T11:13:07.116+03:30
 * Generated source version: 3.3.5
 */

@WebFault(name = "InternalServerException", targetNamespace = "http://servicebus.sana.ir/PushSana/v5/")
public class InternalServerException_Exception extends Exception {

    private InternalServerException internalServerException;

    public InternalServerException_Exception() {
        super();
    }

    public InternalServerException_Exception(String message) {
        super(message);
    }

    public InternalServerException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public InternalServerException_Exception(String message, InternalServerException internalServerException) {
        super(message);
        this.internalServerException = internalServerException;
    }

    public InternalServerException_Exception(String message, InternalServerException internalServerException, Throwable cause) {
        super(message, cause);
        this.internalServerException = internalServerException;
    }

    public InternalServerException getFaultInfo() {
        return this.internalServerException;
    }
}
