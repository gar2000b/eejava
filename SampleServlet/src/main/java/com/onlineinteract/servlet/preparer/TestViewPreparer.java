package com.onlineinteract.servlet.preparer;

import org.apache.tiles.Attribute;
import org.apache.tiles.AttributeContext;
import org.apache.tiles.preparer.PreparerException;
import org.apache.tiles.preparer.ViewPreparer;
import org.apache.tiles.request.Request;

public class TestViewPreparer implements ViewPreparer {

	@Override
	public void execute(Request tilesRequest, AttributeContext attributeContext)
			throws PreparerException {
		attributeContext.putAttribute("body", new Attribute(
				"<p>This is the value added by the view preparer</p>"));
		attributeContext.putAttribute("title", new Attribute(
				"Preparer definition page"));
	}
}
