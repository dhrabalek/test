package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class AhojPortlet extends GenericPortlet{

	@Override
	protected void doView(RenderRequest req, RenderResponse resp) throws PortletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("Ahoj lidi.");
	}

}
