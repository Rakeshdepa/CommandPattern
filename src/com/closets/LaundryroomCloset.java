package com.closets;

public class LaundryroomCloset implements Order {

	private Closets closets;

	public LaundryroomCloset(Closets closets) {
		this.closets = closets;
	}

	@Override
	public void execute() {
		closets.LaundryroomClosets();

	}

}
