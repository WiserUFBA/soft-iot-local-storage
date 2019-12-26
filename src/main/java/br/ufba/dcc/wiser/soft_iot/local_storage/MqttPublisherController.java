package br.ufba.dcc.wiser.soft_iot.local_storage;

import br.ufba.dcc.wiser.soft_iot.entities.Actuator;

public interface MqttPublisherController {
	
	boolean sendPostActuator(Actuator actuator, String value);

}
