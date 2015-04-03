<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:definition name="myapp.homepage.new" extends="myapp.homepage">
</tiles:definition>

<tiles:insertDefinition name="myapp.homepage.new">
	<tiles:putAttribute name="menu" value="/tiles/common_menu2.jsp"/>
</tiles:insertDefinition>