package br.ufba.dcc.wiser.soft_iot.local_storage;


import br.ufba.dcc.wiser.soft_iot.entities.Actuator;
import br.ufba.dcc.wiser.soft_iot.entities.Device;

public interface MqttPublisherController {
	
	
	boolean sendPostActuator(Device device, Actuator actuator, String value);

}
