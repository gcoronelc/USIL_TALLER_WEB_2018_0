<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table style="width: 100%;">
  <tr>
    <td>
        <img src="FOTOS/edut.png"/>
    </td>
    <td>
        <h3><font color="white"> Usuario:</font></h3>${sessionScope.usuario.usuario}<br/>
        <a href="LoginSalir"><h3><font color="white">Cerrar Sesión</font></h3></a>
    </td>
  </tr>
</table>