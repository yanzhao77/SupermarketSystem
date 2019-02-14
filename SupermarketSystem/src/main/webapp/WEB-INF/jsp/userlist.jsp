<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/head.jsp"%>

        <div class="right">
            <div class="location">
                <strong>你现在所在的位置是:</strong>
                <span>用户管理页面</span>
            </div>
            <div class="search">
           		<form method="get" action="${pageContext.request.contextPath }/sys/userrole/FuzzySearchUser">
					<input name="method" value="query" class="input-text" type="hidden">
					 <span>用户名：</span>
					 <input name="userName" class="input-text"	type="text" value="${oldUser.userName}">
					 
					 <span>用户角色：</span>
					 <select name="userRole">
						<c:if test="${roleList != null }">
						   <option value="0">--请选择--</option>
						   <c:forEach var="role" items="${roleList}">
						   		<option <c:if test="${role.id == oldUser.userRole }">selected="selected"</c:if>
						   		value="${role.id}">${role.roleName}</option>
						   </c:forEach>
						</c:if>
	        		</select>
					 
					 <input type="hidden" name="pageIndex" value="1"/>
					 <input	value="查 询" type="submit" id="searchbutton">
					 <a href="${pageContext.request.contextPath}/jsp/useradd.jsp" >添加用户</a>
				</form>
            </div>
            <!--用户-->
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">用户编码</th>
                    <th width="20%">用户名称</th>
                    <th width="10%">性别</th>
                    <th width="10%">年龄</th>
                    <th width="10%">电话</th>
                    <th width="10%">用户角色</th>
                    <th width="30%">操作</th>
                </tr>
                   <c:forEach items="${userPage.records}" var="p">
					<tr>
						<td>
						<span>${p.userCode }</span>
						</td>
						<td>
						<span>${p.userName }</span>
						</td>
						<td>
							<span>
								<c:if test="${p.gender==1}">男</c:if>
								<c:if test="${p.gender==2}">女</c:if>
							</span>
						</td>
						<%-- <td>
						<span>${p.age}</span>
						</td> --%>
						<td>
						<span>${p.phone}</span>
						</td>
						<td>
							<span>${p.roleName}</span>
						</td>
						<td>
						<span><a class="viewUser" href="javascript:;" userid=${p.id } username=${p.userName }><img src="${pageContext.request.contextPath }/static/images/read.png" alt="查看" title="查看"/></a></span>
						<span><a class="modifyUser" href="javascript:;" userid=${p.id } username=${p.userName }><img src="${pageContext.request.contextPath }/static/images/xiugai.png" alt="修改" title="修改"/></a></span>
						<span><a class="deleteUser" href="javascript:;" userid=${p.id } username=${p.userName }><img src="${pageContext.request.contextPath }/static/images/schu.png" alt="删除" title="删除"/></a></span>
						</td>
					</tr>
				</c:forEach>
			</table>
		
		  	   
<div class="pagination pagination-centered">
						  <ul>
							<li><a href="/sys/userrole/FuzzySearchUser?current=1&userName=${oldUser.userName}&roleId=${oldUser.userRole}" title="首页">首页</a>
							</li>
							<c:if test="${userPage.current>1}">
								<c:forEach begin="1" end="${userPage.current-1}" var="num" step="1">
									<li><a href="/sys/userrole/FuzzySearchUser?current=${num}&userName=${oldUser.userName}&roleId=${oldUser.userRole}"
										class="number" title="${num}">${num} </a></li>
								</c:forEach>>
							</c:if>
				
							<li class="active">
							  <a href="/sys/userrole/FuzzySearchUser?current=${userPage.current}&userName=${oldUser.userName}&roleId=${oldUser.userRole}" title="${userPage.current}">${userPage.current}</a>
							</li>
							
							<c:if test="${userPage.current<pageCount}">
								<c:forEach begin="${userPage.current+1}" end="${pageCount}" var="num" step="1">
									<li><a href="/sys/userrole/FuzzySearchUser?current=${num}&userName=${oldUser.userName}&roleId=${oldUser.userRole}"
										class="number" title="${num}">${num} </a></li>
								</c:forEach>
							</c:if>
							<li><a href="/sys/userrole/FuzzySearchUser?current=${pageCount}&userName=${oldUser.userName}&roleId=${oldUser.userRole}" title="尾页">尾页</a>
							</li>
						  </ul>
						</div>
        </div>
 </section>
<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<div class="remove" id="removeUse">
    <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要删除该用户吗？</p>
            <a href="#" id="yes">确定</a>
            <a href="#" id="no">取消</a>
        </div>
    </div>
</div>


 <%@include file="/WEB-INF/jsp/common/foot.jsp" %>
<script type="text/javascript" src="/static/js/providerlist.js"></script>
 