package org.sealsoft.bean.sensor;

public class BresserBean extends SensorBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1267838585997729095L;
	private String centerkey = "92d95c667e3442f70a66d8cb655a9ee0";
	private String timestamp;
	private double winddir;
	private double humidity;
	private double temp;
	private double heatIndex;
	private double dewpt;
	private double windChill;
	private double windSpeed;
	private double windGust;
	private double pressure;
	private double precipRate;
	private double precipTotal;

	public String getCenterkey() {
		return centerkey;
	}

	public void setCenterkey(String centerkey) {
		this.centerkey = centerkey;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public double getWinddir() {
		return winddir;
	}

	public void setWinddir(double winddir) {
		this.winddir = winddir;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getHeatIndex() {
		return heatIndex;
	}

	public void setHeatIndex(double heatIndex) {
		this.heatIndex = heatIndex;
	}

	public double getDewpt() {
		return dewpt;
	}

	public void setDewpt(double dewpt) {
		this.dewpt = dewpt;
	}

	public double getWindChill() {
		return windChill;
	}

	public void setWindChill(double windChill) {
		this.windChill = windChill;
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public double getWindGust() {
		return windGust;
	}

	public void setWindGust(double windGust) {
		this.windGust = windGust;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public double getPrecipRate() {
		return precipRate;
	}

	public void setPrecipRate(double precipRate) {
		this.precipRate = precipRate;
	}

	public double getPrecipTotal() {
		return precipTotal;
	}

	public void setPrecipTotal(double precipTotal) {
		this.precipTotal = precipTotal;
	}

}
