package br.ufba.dcc.wiser.soft_iot.local_storage;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import br.ufba.dcc.wiser.soft_iot.entities.Actuator;
import br.ufba.dcc.wiser.soft_iot.entities.Device;
import br.ufba.dcc.wiser.soft_iot.entities.Sensor;
import br.ufba.dcc.wiser.soft_iot.entities.SensorData;

public interface LocalDataController {
	
	SensorData getLastSensorData(Device device, Sensor sensor);
	
	List<SensorData> getSensorDataByDateTime(Device device, Sensor sensor, Date startDateTime, Date endDateTime);
	
	List<SensorData> getSensorDataByLastDateTime(Device device, Sensor sensor, Date lastDateTime);
	
	List<SensorData> getSensorDataByAggregationStatusAndDate(Device device, Sensor sensor, int aggregationStatus, Date lastDate);
	
	List<SensorData> getSensorDataByAggregationStatusDateAndFunction(Device device, Sensor sensor, int aggregationStatus, Date lastDate, String aggregationFunction);
	
	void insertSensorDataAggregated(List<SensorData> listSensorData, int aggregationStatus, String aggregationFunction);
	
	void createFirstLastSensorDataAggregated(Device device, Sensor sensor, Date lastDateTime, String aggregationFunction);
	
	void updateLastSensorDataAggregated(Device device, Sensor sensor, Date lastDateTime, String aggregationFunction);
	
	Date getLastDateOfAggregatedSensorData(Device device, Sensor sensor, String aggregationFunction);
	
	void createFirstLastSensorDataEnriched(Device device, Sensor sensor, Date lastDateTime);
	
	void updateLastSensorDataEnriched(Device device, Sensor sensor, Date lastDateTime);
	
	Date getLastDateOfEnrichedSensorData(Device device, Sensor sensor);

}
