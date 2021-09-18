package com.closets;

public class BasementCloset implements Order {
	
	private Closets closets;
	
	public BasementCloset(Closets closets) {
    	this.closets = closets;
    }

	@Override
	public void execute() {
		closets.BasementClosets();
		
	}

}
