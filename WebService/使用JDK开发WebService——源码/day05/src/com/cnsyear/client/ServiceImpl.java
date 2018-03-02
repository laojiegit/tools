
package com.cnsyear.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceImpl", targetNamespace = "http://server.cnsyear.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://server.cnsyear.com/", className = "com.cnsyear.client.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://server.cnsyear.com/", className = "com.cnsyear.client.SayHelloResponse")
    @Action(input = "http://server.cnsyear.com/ServiceImpl/sayHelloRequest", output = "http://server.cnsyear.com/ServiceImpl/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
