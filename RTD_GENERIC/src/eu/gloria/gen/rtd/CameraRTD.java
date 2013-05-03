package eu.gloria.gen.rtd;

import java.util.Date;
import java.util.List;

import eu.gloria.rt.entity.device.CameraAcquisitionMode;
import eu.gloria.rt.entity.device.CameraDigitizingMode;
import eu.gloria.rt.entity.device.CameraType;
import eu.gloria.rt.entity.device.Device;
import eu.gloria.rt.entity.device.Image;
import eu.gloria.rt.entity.device.ImageContentType;
import eu.gloria.rt.entity.device.ImageFormat;
import eu.gloria.rt.exception.RTException;
import eu.gloria.rt.exception.UnsupportedOpException;
import eu.gloria.rtd.RTDCameraInterface;
import eu.gloria.gen.rtd.DeviceRTD;

public class CameraRTD extends DeviceRTD implements RTDCameraInterface{
	
	/**
	 * Constructor.
	 * @param deviceId Device Identifier.
	 */
	public CameraRTD(String deviceId){
		super(deviceId);
	}

	@Override
	public String camGetFocuser() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public List<String> camGetFilters() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public CameraType camGetCameraType() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetXsize() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetYSize() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camCanAbortExposure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camCanAsymetricBin() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camCanGetCoolerPower() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camCanSetCooler() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camCanSetCCDTemperature() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camCanControlTemperature() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camCanStopExposure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public float camGetCoolerPower() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double camGetElectronsPerADU() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double camGetFullWellCapacity() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camHasShutter() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camHasBrightness() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camHasConstrast() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camHasGain() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camHasGamma() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camHasSubframe() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camHasExposureTime() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double camHeatSinkTemperature() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camIsPulseGuiding() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public String camGetLastError() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public double camGetLastExposureDuration() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Date camGetLastExposureStart() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long camGetMaxAdu() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetMaxBinX() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetMaxBinY() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetPixelSizeX() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetPixelSizeY() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public CameraAcquisitionMode camGetAcquisitionMode() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public float camGetFPS() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public CameraDigitizingMode camGetDigitilizingMode() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetBinX() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetBinX(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetBinY() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetBinY(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camIsCoolerOn() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetCoolerOn(boolean value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetROINumX() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetROINumX(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetROINumY(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetROINumY() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetROIStartX(int ROIStartX) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetROIStartX() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetROIStartY(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetROIStartY() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetBrightness(long value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long camGetBrightness() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetContrast(long value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long camGetContrast() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetGain(long value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long camGetGain() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetGamma(long value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public long camGetGamma() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetExposureTime(double value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Double camGetExposureTime() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetCCDTemperature(float value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public float camGetCCDTemperature() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public float camGetCCDCurrentTemperature() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camAbortExposure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camPulseGuide(int direction, long duration) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public String camStartExposure(boolean light) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camStopExposure() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Image camGetImage(ImageFormat format) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camImageReady() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public ImageContentType camGetImageDataType() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetBitDepth() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetBitDepth(int bits) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetContinueModeQuality() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetContinueModeQuality(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public int camGetOneShotModeQuality() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetOneShotModeQuality(int value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public String camGetContinueModeImagePath() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public String camGetOneShotModeImagePath() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camGetAutoGain() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetAutoGain(boolean value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public boolean camGetAutoExposureTime() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camSetAutoExposureTime(boolean value) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public String camStartContinueMode() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public void camStopContinueMode() throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public String camGetImageURL(String uid, ImageFormat format) throws RTException {
		throw new UnsupportedOpException ("Operation not supported");
		
	}

	@Override
	public Device devGetDevice(boolean allProperties) throws RTException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ImageFormat> camGetOneShotModeImageFormats() throws RTException {
		return null;
	}
	
	@Override
	public List<ImageFormat> camGetContinueModeImageFormats() throws RTException {
		return null;
	}

}
