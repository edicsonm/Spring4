<%@ include file="/WEB-INF/views/taglibs.jsp" %>
<div class="jumbotron">
    <h2><s:message code="spittr.label.registerUser" /></h2>
    <sf:form  method="POST" commandName="user"  >
        <%-- enctype="multipart/form-data"--%>
        <%--<sf:errors path="*" element="div" cssClass="errors" />--%>
        <div class="form-group">
            <sf:label cssClass="control-label" cssErrorClass="control-label error" path="firstName">First Name</sf:label>
            <sf:input class="form-control" path="firstName" placeholder="First Name" cssErrorClass="form-control error"  />
            <sf:errors path="firstName" cssClass="error" />
        </div>
        <div class="form-group">
            <sf:label cssClass="control-label" cssErrorClass="control-label error" path="lastName">Last Name</sf:label>
            <sf:input class="form-control" path="lastName" placeholder="Last Name" cssErrorClass="form-control error"/>
            <sf:errors path="lastName" cssClass="error" />
        </div>
        <div class="form-group">
            <sf:label cssClass="control-label" cssErrorClass="control-label error" path="userName">User Name</sf:label>
            <sf:input type="email" class="form-control" path="userName" placeholder="User Name" cssErrorClass="form-control error"/>
            <sf:errors path="userName" cssClass="error" />
        </div>
        <div class="form-group">
            <sf:label path="password">Password</sf:label>
            <sf:input class="form-control" path="password" placeholder="Password" cssErrorClass="form-control error"/>
            <sf:errors path="password" cssClass="error" />
        </div>
        <div class="form-group">
            <label for="profilePicture">Profile Picture</label>
            <input type="file" class="form-control" id="profilePicture" name="profilePicture" cssErrorClass="form-control error" accept="image/jpeg,image/png,image/gif"/>
            <sf:errors cssClass="error" />
        </div>

        <button type="submit" class="btn btn-default">Register</button>
    </sf:form>

</div>
