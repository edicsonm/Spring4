<%@ include file="/WEB-INF/views/taglibs.jsp" %>
<div class="jumbotron">
    <h2> Profile <small><c:out value="${spitter.userName}" /></small></h2>
    <ul class="">
        <li class="list-group-item"><c:out value="${spitter.userName}" /></li>
        <li class="list-group-item"><c:out value="${spitter.firstName}" /></li>
        <li class="list-group-item"><c:out value="${spitter.lastName}" /></li>
    </ul>
</div>
