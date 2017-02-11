<%@ include file="/WEB-INF/views/taglibs.jsp" %>

<div class="jumbotron">
    <h1>Welcome to Spittr</h1>
    <c:forEach items="${spittleList}" var="spittle">
        <li id="spittle_<c:out value="${spittle.id}"/>">
                <%--<div class="spittleMessage">

                </div>--%>
                <c:out value="${spittle.message}"/>
            <div>
                <span class="spittleTime"><c:out value="${spittle.time}"/></span>
                <span class="spittleLocation">(<c:out value="${spittle.latitude}"/>,<c:out value="${spittle.longitude}"/>)</span>
            </div>
        </li>
    </c:forEach>
</div>
