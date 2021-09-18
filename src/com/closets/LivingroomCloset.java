package com.closets;

public class LivingroomCloset implements Order{

	private Closets closets;

	public LivingroomCloset(Closets closets) {
    	this.closets = closets;
    }

	@Override
	public void execute() {
		closets.LivingroomClosets();

	}

}
