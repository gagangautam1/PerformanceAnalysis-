/**
 * New node file
 */


function check_prime(req,res){
	
	var number= req.query.num;
	number=number*1;
	console.log(number);
	var flag=true;
	if (typeof(number) !== 'number'|| number>1000 || number<1)
	{
	throw "Input Is not valid. Enter number between 1 and 1000" ;
	}
	    if(number === 1) {console.log("not a prime"); res.send("");}
	    else if(number=== 2) { console.log("is a prime"); res.send("");}
	    else if(number=== 3) { console.log("is a prime"); res.send("");}
	    else { 
	        for(var i=Math.floor(Math.sqrt(number));i>=2;i--){
	            
	                if(number%i===0 || number%2===0 || number%3===0) {flag=false;} 
	        } 
	        }
	    if(flag)
	    	{
	    	console.log("is a prime");
	    	}
	    else
	    	{
	    	console.log("not a prime");
	    	}
	    
	    res.send("");
	}

/*if(number===1)
	{
	console.log("not prime");
	}
else if (number===2){
	console.log("It is prime");
}
else if (number===3)
	{
	console.log("It is prime");
	}
else if(number===5){
	console.log("It is prime");
}
	else if(number%2=== 0)
	   {
	   console.log("not a prime");
	   res.send("");
	   }
   else if (number%3=== 0 )
	   {
	   console.log("not a prime") ;
	   res.send("");
       }
   else if ((number%2!==0) && (number%3!==0)){
	   var n= Math.sqrt(number);
	   console.log(n);
	   for (var i=5; i<n; i+=6)
		   {
		   if ((number%i===0) ||(number%(i+2)===0))
			   {
			   console.log("not a prime") ;
			   res.send("");
			   }
		   }
   }
   else
   {
		   console.log("it is a prime") ;
		   res.send("");
	}
   } */
   
exports.check_prime=check_prime;
