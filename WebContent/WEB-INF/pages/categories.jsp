<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>


	<div>
		<fieldset>
			<legend> add/edit Category</legend>

			<f:form modelAttribute="category" action="saveCat"
				enctype="multipart/form-data">

				<table >
					<tr>
						<td>ID Category</td>
						<td><f:errors path="id" ></f:errors></td>
					</tr>
					<tr>
						<td>Name Category</td>
						<td><f:input path="nameCategory" /></td>
						<td><f:errors path="nameCategory" ></f:errors></td>
					</tr>
					<tr>
						<td>Description Category</td>
						<td><f:textarea path="description" /></td>
						<td><f:errors path="description" ></f:errors></td>
					</tr>
					<tr>
						<td>Image</td>
							<td><img src="photoCat?idCat=${category.id}"></td>
		
						<td><input type="file" name="file" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="Save"></td>
					</tr>

				</table>
			</f:form>

		</fieldset>

	</div>

	<!--  end of  form  : save/edit  -->

	<div>

		<fieldset>
			<legend> List categories</legend>

			<table class="tabStyle1">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Description</th>
					<th>Image</th>
				</tr>
				<c:forEach items="${categories}" var="c">
					<tr>
						<td>${c.id}</td>
						<td>${c.nameCategory}</td>
						<td>${c.description}</td>
						<td><img alt="pas de photo" src="photoCat?idCat=${c.id}"></td>
						<td><a href="suppCat?idCat=${c.id}">Remove</a></td>
						<td><a href="editCat?idCat=${c.id}">Edit</a></td>
					</tr>
				</c:forEach>

			</table>


		</fieldset>

	</div>

</body>
</html>
