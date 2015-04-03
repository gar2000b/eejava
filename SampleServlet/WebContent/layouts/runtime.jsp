<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertTemplate template="/layouts/classic.jsp">
	<tiles:putAttribute name="title" value="Tiles tutorial homepage" />
	<tiles:putAttribute name="header" value="/tiles/banner.jsp" />
	<tiles:putAttribute name="menu" value="/tiles/common_menu.jsp" />
	<tiles:putAttribute name="body">
		<tiles:insertTemplate template="/layouts/variable_rows.jsp">
			<tiles:putListAttribute name="items">
				<tiles:addAttribute value="/tiles/banner.jsp" />
				<tiles:addAttribute value="/tiles/common_menu.jsp" />
				<tiles:addAttribute value="/tiles/credits.jsp" />
			</tiles:putListAttribute>
		</tiles:insertTemplate>
	</tiles:putAttribute>
	<tiles:putAttribute name="footer" value="/tiles/credits.jsp" />
</tiles:insertTemplate>