package designpatterns.creational.builder;

import designpatterns.creational.builder.domain.FourWheeler;

public class FourWheelerBuilder extends Builder {
	private FourWheeler car = null;

	public FourWheelerBuilder() {
		this.car = new FourWheeler();
	}
	
	@Override
	public void fixAccessories() {
		super.fixAccessories();

		// add necessary logic here
	}

	@Override
	public void carryPaintJob() {
		super.carryPaintJob();

		// add necessary logic here
		
	}

	@Override
	public void installDoors() {
		super.installDoors();

		// add necessary logic here
	}

	@Override
	public void qualityCheck() {
		super.qualityCheck();
		// add necessary logic here

	}
	
	public FourWheeler getResult() {
		FourWheeler ret = this.car;
		this.car = null;
		return ret;
	}

}
