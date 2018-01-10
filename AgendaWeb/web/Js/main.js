$(document).ready(function(){
    
   $("#agregar").click
   (function(){
       $.post(
        "HomeRegistro",
        $("#formagregar").serialize(),
        function(response)
        {
           if(response=="exito"){
              window.location="index.jsp?page=inicio";
           }
           else{
                console.log(response);
           }
        })
        
      });
   
   $("#editar").click
   (function(){
       $.post(
        "Editor",
        $("#formeditor").serialize(),
        function(response)
        {
           if(response=="exito"){
              window.location="index.jsp?page=inicio";
           }
           else{
              console.log(response); 
           }
        })
        
      });
        
        $("#nuevoUser").click(
            function(){
                 $.ajax(
                {type: "POST",
                url: "userController",
                data:$("#registroform").serialize(),
                success: function(response)
                {
                   if(response=="exito"){
                    window.location="index.jsp?page=login";
                    }
                    else{
               console.log(response);
                        }
                }
                });
            }    
            );
        
     $("#loginaction").click(
            function(){
                 $.ajax(
            {
                type: "POST",
                url: "LoginController",
                data:$("#loginform").serialize(),
                success: function(response)
                {
                   if(response == "exito"){
                      
                    window.location="index.jsp?page=inicio";
                    }
                    else if(response == "Usuario o Contraseña Incorrecta")
                    {
                        $("#msj").html(response);
                    }else
                    {
                        console.log(response);
                    }
                }
            }   ) 
        });
                
             $("#salir").click(
            function(){
                 $.ajax(
            {
                type: "GET",
                url: "LoginController",
                data:{name:close},
                success: function(response)
                {
                   if(response == "exito"){
                      
                    window.location="index.jsp?page=login";
                    }
                    else
                    {
                        console.log(response);
                    }
                }
            }   ) 
        });
    
});

 function eliminar(elem){
                 var id= {id:elem.id};
                $.ajax(
                {type: "GET",
                url: "Editor",
                data:id,
                success: function(response)
                {
                   if(response=="exito"){
                    window.location="index.jsp?page=inicio";
                    }
                    else{
               console.log(response);
                        }
                }
                });
                }
 


