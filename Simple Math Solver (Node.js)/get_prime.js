function get_prime(req,res) {
	
	
	var number= req.query.num;
	number=number*1;
	console.log(number);
	
	if (typeof(number) !== 'number'|| number>1000 || number<1)
		{
		throw "Input Is not valid. Enter number between 1 and 1000";
		}
	var flag=true;
	
	for (var i=1; i<=number; i++)
		{
		
		
		 if(i===1||i===2||i===3)
			 
			 {
			 flag=true;
			 }
		 else
			 {
			 for (var j=2; j<i; j++){
			 
				 if(i%j!==0)
					 {
					 flag=true;
					 }		
				 else
					 {
					 flag=false;
					 break;
					 }
			 }
			 
			 }
		 if(flag)
		 {
		 console.log(i);
		 }
		}
	res.send("");
		}
	
/*	console.log("1");
	var prm=[];
	var x=0;
	console.log("3");
	for (var count=1; count<number; count++)
		{
		if (number === 1|| number === 2|| number === 3)
			{
			prm[x]=number;
			console.log(prm[x]);
			x++;
			console.log("2");
			}
		else
			{
			var n= number/2;
			var flag= true;
			for(var i=2; i<n; i++)
				{
				if (number%i !== 0)
				{
					continue;
					}
				else
				{
					flag=false;
					}
				break;
				}
			if (flag===true)
				{
				prm[x]= number;
				console.log(prm[x]);
				}
			}
		}
	
}*/

exports.get_prime= get_prime;