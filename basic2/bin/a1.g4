grammar a1;

rohith returns [Integer val]
   : exp=e  {$val=$e.val;
   	if ($val==-1)
   	{
   	 System.out.println("UNKNOWN");	
   	}
   	else if ($val==1) 
   	{
   		System.out.println("TRUE");
   	}
   	else if ($val==0) 
   	{
   		System.out.println("FALSE");
   	}
   	};
   	
e returns [Integer val]

   : NUMBER  {$val=(Integer.parseInt($NUMBER.text))%2;}| ID {$val=-1;}
   | a=e (PLUS | MINUS) b=e 
   { 
   	if(($a.val==-1) || ($b.val==-1))
   	{   	
   		$val=-1;
   	}
   	else
   	{
   		   	$val=(($a.val+$b.val)%2);
   	}
   }
   	| a=e (MUL) b=e 
   	{ 
   	if(($a.val==-1) || ($b.val==-1))
   	{
   		
   	$val=-1;
   	
   	}
   	else if(($a.val==0) || ($b.val==0))
   	{
   		$val=0;
   	}
   	else
   	{
   		$val=1;
   	}
   	}
   	| LEFTPAR a=e RIGHTPAR {$val=$a.val;} 
   	| MINUS a=e {$val=$a.val;}
   ;
NUMBER: [0-9]+ ;
LEFTPAR: '(';
RIGHTPAR: ')';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
ID: [a-z];
WS:[ \r\n\t] + -> skip;
