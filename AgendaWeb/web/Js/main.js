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
               
           }
        })
        
      });
    
    
    
});


 


