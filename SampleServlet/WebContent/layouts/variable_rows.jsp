<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tilesx"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<tilesx:useAttribute id="list" name="items" classname="java.util.List" />
<c:forEach var="item" items="${list}">
	<tiles:insertAttribute value="${item}" flush="true" />
	<!-- <br /> -->
</c:forEach>