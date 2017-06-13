package CustomExceptions;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NotFoundException extends Exception implements Serializable {

}
