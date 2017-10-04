$(document).ready(
	function(){
		
		$("H1").css({"color":"magenta", "font-size":"40px", "text-align":"center"});
		$("H3").css({"color":"green", "font-size":"25px", "text-align":"center"});
		
		$("#mainMenu a").css({"color":"blue", "font-size":"14px", "text-align":"center"});
		
		$("#mainMenu a").hover(
				
				function(){
					$(this).css({"color":"red", "font-size":"18px", "text-align":"center"});
				},
				function(){
					$(this).css({"color":"blue", "font-size":"14px", "text-align":"center"});
				}
		);
		
		$("table tr:odd").css({"background-color":"lightgreen"});
		$("table tr:even").css({"background-color":"lightblue"});
	}	

);
