<%@ include file="/WEB-INF/views/taglibs.jsp" %>
<c:url var="logoutUrl" value="/logout" />
<security:authorize access="isAuthenticated()">
    <c:set var="userName"><security:authentication property="principal.username" /></c:set>
</security:authorize>
<div class="header clearfix">
    <nav>

        <ul class="nav nav-pills pull-right">
            <li role="presentation" class="active"><a href="<c:url value="/"/>"><s:message code="spittr.label.home" ></s:message></a></li>

            <security:authorize url="/main">
                <li role="presentation"><a href="<c:url value="/main"/>"><s:message code="spittr.label.main" /></a></li>
            </security:authorize>

            <security:authorize url="/admin">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><s:message code="spittr.label.admin" /> <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <%--<security:authorize url="/spitter/register">--%>
                            <%--<li role="presentation"><a href="<c:url value="/admin/user/register"/>"><s:message code="spittr.label.register" /></a></li>--%>
                        <%--</security:authorize>--%>
                        <%--<li><a href="#">Another action</a></li>--%>
                        <%--<li><a href="#">Something else here</a></li>--%>
                        <%--<li role="separator" class="divider"></li>--%>
                        <%--<li><a href="#">Separated link</a></li>--%>
                        <%--<li role="separator" class="divider"></li>--%>
                        <li><a href="<c:url value="/admin/user/"/>${userName}"><s:message code="spittr.label.profile"/></a></li>
                    </ul>
                </li>
            </security:authorize>

            <security:authorize access="isAnonymous()">
                <%--<li role="presentation"><a href="<c:url value="/login"/>"><s:message code="spittr.label.login" ></s:message></a></li>--%>
                <li role="presentation"><a href="#"><s:message code="spittr.label.about" /></a></li>
                <li role="presentation"><a href="#"><s:message code="spittr.label.contact" /></a></li>
            </security:authorize>

            <security:authorize url="/logout">
                <li role="presentation"><a href="${logoutUrl}"><s:message code="spittr.label.logout" /></a></li>
            </security:authorize>
            </li>
        </ul>

    </nav>
    <h3 class="text-muted"><s:message code="myApp.siteName" /></h3>
</div>