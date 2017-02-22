<%@ include file="/WEB-INF/views/taglibs.jsp" %>
<div class="jumbotron">
    <h1><s:message code="myApp.welcome" /></h1>
    <sf:form method="POST" action="login" commandName="user">
        <div class="form-group">
            <sf:label cssClass="control-label" cssErrorClass="control-label error" path="userName"><s:message code="spittr.label.userName" /></sf:label>
            <sf:input type="text" class="form-control" path="userName" placeholder="User Name" cssErrorClass="form-control error"/>
            <sf:errors path="userName" cssClass="error" />
        </div>
        <div class="form-group">
            <sf:label path="password"><s:message code="spittr.label.password" /></sf:label>
            <sf:input class="form-control" path="password"  placeholder="Password" cssErrorClass="form-control error"/>
            <sf:errors path="password" cssClass="error" />
        </div>
        <div class="checkbox">
            <label>
                <input id="remember_me" name="remember-me" type="checkbox"><s:message code="spittr.label.rememberMe" />
            </label>
        </div>
        <button type="submit" class="btn btn-default"><s:message code="spittr.label.login" /></button>
    </sf:form>
</div>
