package CustomExceptions;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InvalidParametersException extends Exception implements Serializable {

}
