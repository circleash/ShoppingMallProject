<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<header>
			<div class="d-flex justify-content-between mt-3">
				<div>
				열공필템로고
				</div>
				<div>
					<table id="top-table">
						<tbody>
							<tr class="top-tr">
								<td class="d-flex justify-content-between">
								<c:if test="${not empty userName }">
								${userName } <a href="/user/sign_out"> [로그아웃] </a>
								</c:if>
								<c:if test="${empty userName }">
								<a href="/user/signin_view">로그인/회원가입</a>
								</c:if>
								<div>ABOUT</div>
								<div>매장안내</div>
								<div>FAQ</div>
								<div>주문조회</div>
								<div>장바구니</div>
								</td>
							</tr>
							<tr class="bottom-tr">
								<td class="d-flex justify-content-between">
								<a href="/product/new">NEW</a>
								<a href="/product/note">노트</a>
								<a href="/product/pen">필기구</a>
								<div>다이어리</div>
								<div>ACC</div>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</header>
		