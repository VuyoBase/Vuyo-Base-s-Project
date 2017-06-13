package CustomExceptions;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AlreadyExistsException extends Exception implements Serializable {

}
