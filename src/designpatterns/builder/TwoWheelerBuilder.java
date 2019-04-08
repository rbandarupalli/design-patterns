package designpatterns.builder;

import designpatterns.builder.domain.TwoWheeler;

public class TwoWheelerBuilder extends Builder {
	private TwoWheeler bike = null;
	
	public TwoWheelerBuilder() {
		this.bike = new TwoWheeler();
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
	public void installDoors() { // not applicable, leave unimplemented
	}

	@Override
	public void qualityCheck() {
		super.qualityCheck();
		// add necessary logic here

	}

	public TwoWheeler getResult() {
		TwoWheeler ret = this.bike;
		this.bike = null;
		return ret;
	}
}
