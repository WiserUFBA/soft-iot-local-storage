package br.ufba.dcc.wiser.soft_iot.local_storage;

import java.util.Date;
import java.util.List;

import br.ufba.dcc.wiser.soft_iot.entities.Device;
import br.ufba.dcc.wiser.soft_iot.entities.Sensor;
import br.ufba.dcc.wiser.soft_iot.entities.SensorData;

public interface LocalDataController {
	
	SensorData getLastSensorData(Device device, Sensor sensor);
	
	List<SensorData> getSensorData(Device device, Sensor sensor);
	
	List<SensorData> getSensorDataByDateTime(Device device, Sensor sensor, Date startDateTime, Date endDateTime);
	
	List<SensorData> getSensorDataByLastDateTime(Device device, Sensor sensor, Date lastDateTime);
	
	List<SensorData> getSensorDataByAggregationStatusAndDate(Device device, Sensor sensor, int aggregationStatus, Date lastDate);
	
	SensorData getLastAggregatedSensorData(Device device, Sensor sensor);
	
	List<SensorData> getAggregatedSensorData(Device device, Sensor sensor);
	
	void insertSensorDataAggregated(List<SensorData> listSensorData, int aggregationStatus);
	
	void createFirstLastSensorDataAggregated(Device device, Sensor sensor, Date lastDateTime);
	
	void updateLastSensorDataAggregated(Device device, Sensor sensor, Date lastDateTime);
	
	Date getLastDateOfAggregatedSensorData(Device device, Sensor sensor);
	
	void createFirstLastSensorDataEnriched(Device device, Sensor sensor, Date lastDateTime);
	
	void updateLastSensorDataEnriched(Device device, Sensor sensor, Date lastDateTime);
	
	Date getLastDateOfEnrichedSensorData(Device device, Sensor sensor);

}
