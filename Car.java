package day9.serializationdemo.aggregation;

import java.io.Serializable;

public class Car implements Serializable{
		private String carModelNo;
		private String carMfgName;
		private double carPrice;
		
		private Engine carEngine;

		public Car() {}
		public Car(String carModelNo, String carMfgName, double carPrice, Engine carEngine) {
			this.carModelNo = carModelNo;
			this.carMfgName = carMfgName;
			this.carPrice = carPrice;
			this.carEngine = carEngine;
		}
		public String getCarModelNo() {
			return carModelNo;
		}
		public void setCarModelNo(String carModelNo) {
			this.carModelNo = carModelNo;
		}
		public String getCarMfgName() {
			return carMfgName;
		}
		public void setCarMfgName(String carMfgName) {
			this.carMfgName = carMfgName;
		}
		public double getCarPrice() {
			return carPrice;
		}
		public void setCarPrice(double carPrice) {
			this.carPrice = carPrice;
		}
		public Engine getCarEngine() {
			return carEngine;
		}
		public void setCarEngine(Engine carEngine) {
			this.carEngine = carEngine;
		}
		@Override
		public String toString() {
			return "Car [carModelNo=" + carModelNo + ", carMfgName=" + carMfgName + ", carPrice=" + carPrice
					+ ", carEngine=" + carEngine + "]";
		}
		
		
		
		
		
		
		
}
