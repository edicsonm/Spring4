<%@ include file="/WEB-INF/views/taglibs.jsp" %>
<div class="jumbotron">
    <h2> Profile <small><c:out value="${user.userName}" /></small></h2>
    <ul class="">
        <li class="list-group-item"><c:out value="${user.userName}" /></li>
        <li class="list-group-item"><c:out value="${user.firstName}" /></li>
        <li class="list-group-item"><c:out value="${user.lastName}" /></li>
    </ul>
</div>
