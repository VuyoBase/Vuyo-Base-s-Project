package CustomExceptions;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MissingParametersException extends Exception implements Serializable {

}
