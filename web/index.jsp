<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="Header.jsp"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         
          <h3>Cliente</h3> 
         
        <form action="cadastrar" method="POST">  
  
            <table>  
                 
                <tr>  
                    <td>Nome</td>  
                    <td><input type="text" size="30" name="nome"></td>  
                </tr>  
                <tr>  
                    <td>Endereço</td>  
                    <td><input type="text" size="30" name="endereco"></td>   
                </tr>  
                <tr>  
                    <td>CPF</td>  
                    <td><input type="text" size="15" name="cpf"></td>  
                </tr> 
                 
                
             <tr>  
                    <td><input type="reset" value="Limpar"> </td>  
                    <td><input type="submit" value="Enviar"></td>  
                </tr>
</table>
        </form>
          
         <form action="consultar" method="POST">  
          <table>
              <tr>
                  <td> <input type="submit" value="consultar"> </td></tr>
                   
                 </table></form> 
              
        
          <form action="deletar" method="POST">
              
              <table>
                  <tr>
                      <td>Nome</td>
                      <td><input type="text" size="30" name="nome"></td>
                       <td><input type="submit" value="Deletar"></td>  
                  </tr>
              </table>
          </form>
              
              
            
                 <form action="Cadastrar" method="POST">  
  
            <table>  
                <h3>Livro</h3>
                <tr>  
                    <td>Titulo</td>  
                    <td><input type="text" size="30" name="Titulo"></td>  
                </tr>  
                <tr>  
                    <td>Autor</td>  
                    <td><input type="text" size="30" name="Autor"></td>   
                </tr>  
                <tr>  
                    <td>Gênero</td>  
                    <td><input type="text" size="15" name="genero"></td>  
                </tr> 
                 
                <tr>  
                    <td><input type="reset" value="Limpar"> </td>  
                    <td><input type="submit" value="Enviar"></td>  
                </tr>

            </table>

        
        </form>
          
          <form action="Consultar" method="POST">  
          <table>
              <tr>
                  <td> <input type="submit" value="Consultar"> </td></tr>
                   
                 </table></form> 
              
        
          <form action="Deletar" method="POST">
              
              <table>
                  <tr>
                      <td>Titulo</td>
                      <td><input type="text" size="30" name="Titulo"></td>
                       <td><input type="submit" value="Deletar"></td>  
                  </tr>
              </table>
          </form>
          
    </body>
</html>
