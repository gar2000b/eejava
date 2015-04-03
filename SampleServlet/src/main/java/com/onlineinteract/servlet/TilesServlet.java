package com.onlineinteract.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.web.util.TilesDispatchServlet;

@WebServlet("/TilesServlet")
public class TilesServlet extends TilesDispatchServlet {
	private static final long serialVersionUID = 1L;

	public TilesServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("Tiles Servlet Called");
		
//		TilesContainer container = TilesAccess.getContainer(
//		        request.getSession().getServletContext());
		
		// TODO: need to re-visit.

	}
}
