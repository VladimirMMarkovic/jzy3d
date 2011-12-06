package org.jzy3d.plot3d.primitives.axes.layout.renderers;

public class IntegerTickRenderer implements ITickRenderer{
	public IntegerTickRenderer(){
	}
	
	@Override
	public String format(float value) {
		return "" + (int)value;
	}
}
