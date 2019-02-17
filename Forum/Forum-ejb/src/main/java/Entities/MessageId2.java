package Entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class MessageId2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MessageId2() {
		super();
		// TODO Auto-generated constructor stub
	}
private Integer idSender;
private Integer idReceiver;
public Integer getIdSender() {
	return idSender;
}
public void setIdSender(Integer idSender) {
	this.idSender = idSender;
}
public Integer getIdReceiver() {
	return idReceiver;
}
public void setIdReceiver(Integer idReceiver) {
	this.idReceiver = idReceiver;
}
public MessageId2(Integer idSender, Integer idReceiver) {
	super();
	this.idSender = idSender;
	this.idReceiver = idReceiver;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((idReceiver == null) ? 0 : idReceiver.hashCode());
	result = prime * result + ((idSender == null) ? 0 : idSender.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	MessageId2 other = (MessageId2) obj;
	if (idReceiver == null) {
		if (other.idReceiver != null)
			return false;
	} else if (!idReceiver.equals(other.idReceiver))
		return false;
	if (idSender == null) {
		if (other.idSender != null)
			return false;
	} else if (!idSender.equals(other.idSender))
		return false;
	return true;
}



}
