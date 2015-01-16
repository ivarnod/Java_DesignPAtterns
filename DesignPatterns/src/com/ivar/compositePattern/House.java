package com.ivar.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class House implements Group {

	List<Group> groups = new ArrayList<Group>();

	@Override
	public void assemble() {
		for (Group group : groups) {
			group.assemble();
		}

	}
	
	public void add(Group group){
		groups.add(group);
	}
	
	public void remove(Group group){
		groups.remove(group);
	}

}
