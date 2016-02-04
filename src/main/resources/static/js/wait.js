$body = $("body");

$(document).on({
    ajaxStart: function() { 
    	$body.addClass("loading");
    	$('#test').attr('disabled','disabled'); 
    },
     ajaxStop: function() { 
    	 $body.removeClass("loading");
    	 $('#file-button').removeAttr('disabled');
     }    
});

// Initiates an AJAX request on click
$(document).on("click", function(){
    $.get("/wait");        
});