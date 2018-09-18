import java.util.ArrayList;


public class Factory {
	public static void main (String args[]) {
		Car car1 = new Car("SClass", 20000, 2.5);
		ArrayList<Car> carArray = new ArrayList<>();
		carArray.add(new Car ("1CS", 20, 2));
		carArray.add(new Car ("2CS", 20, 2));
		carArray.add(new Car ("3CS", 20, 2));
		carArray.add(new Car ("4CS", 20, 2));

		
		
		carArray.get(0).seatWeights.add(10.0);
		carArray.get(0).seatWeights.add(20.2);
		carArray.get(0).seatWeights.add(30.3);
		carArray.get(0).seatWeights.add(40.5);
		
		carArray.get(1).seatWeights.add(100.1);
		carArray.get(1).seatWeights.add(200.1);
		carArray.get(1).seatWeights.add(300.1);
		
		carArray.get(2).seatWeights.add(50.1);
		carArray.get(2).seatWeights.add(100.1);

		carArray.get(3).seatWeights.add(100.1);
		
		System.out.println(getAvg(carArray));
	}
	
	public static double getAvg(ArrayList<Car> carArray) {
		
		double avg = 0;
		for (int i = 0; i < carArray.size(); i++) {
			avg += carArray.get(i).avgSeatWeight();
			//System.out.println("The avg of Car " + (i + 1) + " is: " + carArray.get(i).avgSeatWeight());
		}
		avg = avg/carArray.size();
		return avg;
		
	}

	
}

class Car {
	private String modelNum;
	private int price;
	private double tyreWidth;	
	
	ArrayList<Double> seatWeights = new ArrayList<>();
	
	public Car(String modelNum, int price, double tyrewidth){
		this.modelNum = modelNum;
		this.price = price;
		this.tyreWidth = tyrewidth;
	}
	
	public int getPrice () {
		return price;
	}
	
	public void setPrice (int price) {
		this.price = price;
	}
	
	public String getModelNum () {
		return modelNum;
	}
	
	public void setModelNum (String modelNum) {
		this.modelNum = modelNum;
	}
	
	public double getTyreWidth () {
		return tyreWidth;
	}
	
	public void setTyreWidth (double tyreWidth) {
		this.tyreWidth = tyreWidth;
	}
		
	public double avgSeatWeight () {
		double avg = 0;
		for (int i = 0; i < seatWeights.size(); i++) {
			avg += seatWeights.get(i);	
		}
		avg /= seatWeights.size();
		return avg;
	}
	
}

