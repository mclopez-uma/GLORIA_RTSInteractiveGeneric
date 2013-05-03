package eu.gloria.rtc;


import java.util.List;


import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.entity.device.DeviceProperty;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rtc.DeviceDiscoverer;
import eu.gloria.rtc.DeviceManagerInterface;

public class DeviceManager implements DeviceManagerInterface {
	
	
	/**
	 * Constructor
	 */
	public DeviceManager(){
		
	}
	

	@Override
	public List<Device> devGetDevices(boolean allProperties) throws RTException {
		
		return DeviceDiscoverer.devGetDevices(allProperties);		
	}

	@Override
	public Device devGetDevice(String deviceId, boolean allProperties) throws RTException{
		
		return DeviceDiscoverer.devGetDevice(deviceId, allProperties);
		
	}
	
	@Override
	public Device devGetDevice(String deviceId, List<String> propertyNames) throws RTException{
		
		return DeviceDiscoverer.devGetDevice(deviceId, propertyNames);
	}

	@Override
	public List<DeviceProperty> devGetDeviceProperties(String deviceId)
			throws RTException {
		
		return DeviceDiscoverer.getRTD(deviceId).devGetDeviceProperties();
	}

	@Override
	public boolean devUpdateDeviceProperty(String deviceId, String name,
			List<String> value) throws RTException {
		
		return DeviceDiscoverer.getRTD(deviceId).devUpdateDeviceProperty(name, value);
		
	}

	@Override
	public boolean devUpdateDevicePropertyAsync(String deviceId, String name,
			List<String> value) throws RTException {
		
		return DeviceDiscoverer.getRTD(deviceId).devUpdateDevicePropertyAsync(name, value);

	}
	
	@Override
	public boolean devIsConnected(String deviceId) throws RTException {
		
		return DeviceDiscoverer.getRTD(deviceId).devIsConnected();
	}

	@Override
	public void devDisconnect(String deviceId) throws RTException {
		
		DeviceDiscoverer.getRTD(deviceId).devDisconnect();

	}
	
	@Override
	public void devConnect(String deviceId) throws RTException{
		
		DeviceDiscoverer.getRTD(deviceId).devConnect();
	}

	@Override
	public String devGetConfiguration(String deviceId) throws RTException {
		
		return DeviceDiscoverer.getRTD(deviceId).devGetConfiguration();
	}

	@Override
	public DeviceProperty devGetDeviceProperty(String deviceId, String name) throws RTException {

		return DeviceDiscoverer.getRTD(deviceId).devGetDeviceProperty(name);
	}


	@Override
	public boolean devIsBlocked(String deviceId) throws RTException {
		
		return DeviceDiscoverer.getRTD(deviceId).devIsBlocked();
	}

}
