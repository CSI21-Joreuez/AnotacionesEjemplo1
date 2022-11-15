
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Lista de productos de tipo 1</title>
</head>
<body>
<h1> Lista de Productos de Tipo 1</h1>


  <ul th:each="producto : ${listaProductos1}">
    <li th:text="${producto.nombre}"></li>
    <li th:text="${producto.precio}"></li>
  </ul>
</body>
</html>