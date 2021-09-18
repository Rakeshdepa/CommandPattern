package com.closets;

public class BedroomCloset implements Order{
	
	private Closets closets;
	
    public BedroomCloset(Closets closets) {
    	this.closets = closets;
    }

	@Override
	public void execute() {
		closets.BedroomClosets();
		
	}
	
	

}
