import java.util.Scanner; //for taking input
import java.util.Random;
/*

	*****
	*   *
	*****
	*   *	
	*****
	
    *---*
    -*-*-    
    --*--
    -*-*-
    *---*
*/
class CreateGreeting
{
	/// Global Dimension
	 int width = 130;                      // Boundary Width
	 int height= 21;                      // Boundary Height
	 String block="🎂";                    // Block Char
	 String totalwords[];
	 int wordcount=1;
	 int lettercount=1;
	 int wordcountchange = 1;
	 int lettercountchange = 1;
	 int letterincrement = 0;
	 int heightlimit=7;
	 int widthlimit=7;
	 int wordincrement = 0;
	 int letterrow=0;
	 int lettercolumn = 0;
	 int tmp = 1;
	 int sidemargin;
	 int extraspace = 1;



	/// Clear Background
	public void clear_background(){
	    System.out.print("\033[H\033[2J");  //for clearing screen
	}

	//creating Frame for display
	public void frame()
	{	

		for(int row=0;row<height;row++)
		{	
			extraspace=1;
			System.out.print("\n");

				if(row!=0 && row!=1)
				letterrow++;
				
				lettercount=1;lettercountchange=1;letterincrement=0;widthlimit=7;lettercolumn=0;
				if(row==heightlimit && wordcount<totalwords.length)
				{	heightlimit=heightlimit+6;
					wordcountchange = wordcount;
					wordcount++;
					tmp++;
				}	
				/*if(wordcount==totalwords.length)
				{
					wordcount--;

				}*/		



			for(int column=0;column<width;column++)
			{	

				if( column==widthlimit && lettercount<=totalwords[wordcount-1].length())
				{	widthlimit=widthlimit+6;
					lettercountchange = lettercount;
					lettercount++;
				}
				int tmp2 = ((totalwords[wordcount-1].length() * 10)+(totalwords[wordcount-1].length()-1));			
				sidemargin = (width-tmp2)/2;
				
				if(row==0 || row==height-1){
							if(extraspace<65)
								extraspace++;
							else
								System.out.print(block);
				}
				else{
						if(column==0 || column==width-1){
							
								System.out.print(block);

						}
						else if(row==1 || row==height-2)
						{
							System.out.print(" ");
						}
						else if(column<=sidemargin+1)
						{
							System.out.print(" ");
							widthlimit=sidemargin+7;
						}
						else{

								if(wordcountchange==wordcount)
								{	
									if(wordincrement<totalwords.length){
										if(lettercountchange!=lettercount)
										{   
											System.out.print(" ");
											lettercountchange= lettercount;
											letterincrement++;
											lettercolumn=0;
										}
										else if(letterincrement<totalwords[wordcount-1].length())
										{	lettercolumn++;
											extraspace=1;
											 if(letterformation(totalwords[wordcount-1].charAt(letterincrement),letterrow,lettercolumn)){
													
												System.out.print("😃");
												}
											else
												System.out.print("  ");
										}
										else{
											if(extraspace<totalwords[wordcount-1].length()*5+1){
												extraspace++;
												
											}
											else
												System.out.print(" ");

										}
									}
									else
										System.out.print(" ");
								}
								else
									System.out.print(" ");
						}	
				}	
			}
				if(wordcountchange!=wordcount)
				{   
					letterrow=0;
					wordcountchange= wordcount;
					wordincrement++;

				}

		}
			//reset all 
			 wordcount=1;
			 lettercount=1;
			 wordcountchange = 1;
			 lettercountchange = 1;
			 letterincrement = 0;
			 heightlimit=7;
			 widthlimit=7;
			 wordincrement = 0;
			 letterrow=0;
			 lettercolumn = 0;
			 tmp = 1;
			 extraspace =1;
			 		/*System.out.println(wordincrement+","+totalwords.length+","+sidemargin+","+totalwords
			[wordcount-1].length());*/
	}
	public boolean letterformation(char ch,int letterrow,int lettercolumn)
	{
		switch(ch)
				{
					case 'A':
							if(letterrow==1 || letterrow==3 )
							{
								return true;
							}
							else if(lettercolumn==1 || lettercolumn==5)
							{
								
									return true;
								
							}
							else
								return false;


					//break;
					case 'B':
							if(letterrow==1 || letterrow==3 || letterrow==5)
							{
								return true;
							}
							else if(lettercolumn==1 || lettercolumn==5 )
							{
								return true;
							}
							else 
							return false;
					//break;
					case 'C':
							if(letterrow==1 || letterrow==5)
							{
								return true;
							}
							else if(lettercolumn==1)
							{
								return true;
							}
							else 
							return false;
					//break;
					case 'D':
							if(letterrow==1 || letterrow==5)
							{
								return true;
							}
							else if(lettercolumn==1 || lettercolumn==5)
							{
								return true;
							}
							else 
							return false;
					//break;
					case 'E':
							if(letterrow==1 || letterrow==3 ||letterrow==5)
							{
								return true;
							}
							else if(lettercolumn==1)
							{
								return true;
							}
							else 
							return false;
					//break;
					case 'F':
							if(letterrow==1 || letterrow==3)
							{
								return true;
							}
							else if(lettercolumn==1)
							{
								return true;
							}
							else 
							return false;
					//break;
					case 'G':
							if(letterrow==1 || lettercolumn==1)
							{
								return true;
							}
							else if(letterrow>2)
							{	if((letterrow==5 && lettercolumn==2)|| (letterrow==3 && lettercolumn==4))
									return true;
								else if(lettercolumn==3 || lettercolumn==5)
									return true;
								else 
									return false;
							}
							else 
							return false;
					//break;
					case 'H':

							if(letterrow==3)
							{
								return true;
							}
							else if(lettercolumn==1 || lettercolumn==5)
							{
								return true;
							}
							else 
							return false;
					//break;
					case 'I':

							if(letterrow==1 || letterrow==5)
							{
								return true;
							}
							else if(lettercolumn==3)
							{
								return true;
							}
							else 
							return false;
					//break;
					case 'J':
							if(letterrow==1 || lettercolumn==3)
							{
								return true;
							}
							else if(letterrow>2)
							{	
								if(lettercolumn==1)
								return true;
								else if(lettercolumn==2 && letterrow==5)
								return true;
								else 
									return false;
							}
							else 
							return false;
					//break;
					case 'K':
							/*if(lettercolumn==1)
							{
								return true;
							}
							else if(l)
							{
								return true;
							}
							else */
							return true;
					//break;
					case 'L':
							if(lettercolumn==1 || letterrow==5)
							{
								return true;
							}
							else 
							return false;      

					//break;
					case 'M':

							if(lettercolumn==1 || lettercolumn==5)
							{
								return true;
							}
							else if(letterrow==2)
							{
								if(lettercolumn==2 || lettercolumn==4)
								return true;
							}
							else if(letterrow==3 && lettercolumn==3)
							{
								return true;
							}
							else 
							return false;
					//break;
					case 'N':
							if(lettercolumn==1 || lettercolumn==5)
							{
								return true;
							}
							else if(letterrow==lettercolumn)
							{
								return true;
							}
							else 
							return false;
					//break;
					case 'O':
							if(letterrow==1 || letterrow==5 || lettercolumn==1 || lettercolumn==5)
							{
								return true;
							}
							else 
							return false;
					//break;
					case 'P':
							if(letterrow==1 || letterrow==3)
							{
								return true;
							}
							else if(letterrow>3 && lettercolumn==1)
							{
								return true;
							}
							else if(letterrow==2)
							{
								if(lettercolumn==1 || lettercolumn==5)
									return true;
								else 
									return false;
							}
							else 
							return false;
					//break;
					case 'Q':
							if(letterrow==1 || letterrow==5 || lettercolumn==1 || lettercolumn==5)
							{
								return true;
							}
							else if(letterrow>2)
							{	if(letterrow==lettercolumn)
								return true;
								else 
									return false;
							}
							else 
							return false;
					//break;
					case 'R':
							if(letterrow==1 || letterrow==3 || lettercolumn==1)
							{
								return true;
							}
							else if(letterrow>3)
							{	if((letterrow==4 && lettercolumn==2)||(letterrow==5 && lettercolumn==3))
									return true;
								else
									return false;
							}
							else if(letterrow==2 && lettercolumn==5)
							{
								return true;
							}
							else 
							return false;
					//break;
					case 'S':
							if(letterrow==1 || letterrow==3 || letterrow==5)
							{
								return true;
							}
							else if((letterrow==2 && lettercolumn==1)||(letterrow==4 && lettercolumn==5 ))
								return true;
							else 
							return false;
					//break;
					case 'T':
							if(letterrow==1 || lettercolumn==3)
							{
								return true;
							}
							else 
							return false;
						
					//break;
					case 'U':
							if(letterrow==5 || lettercolumn==1 || lettercolumn==5)
							{
								return true;
							}
							else
								return false;
					//break;
					case 'V':
							if(letterrow<4){
								if(lettercolumn==1 || lettercolumn==5)
								{
									return true;
								}
								else
									return false;
							}
							else if(letterrow>3)
							{	
								if((letterrow==4 && (lettercolumn==2 || lettercolumn==4))||(letterrow==5 && lettercolumn==3))
								return true;
								else
									return false;
							}
							else 
							return false;
					//break;
					case 'W':
							if(lettercolumn==1 || lettercolumn==5)
							{
								return true;
							}
							else if(letterrow>2)
							{
								if((letterrow==4 && (lettercolumn==2 || lettercolumn==4))||(letterrow==3 && lettercolumn==3))
								return true;
								else
									return false;
							}
							else 
							return false;
					//break;
					case 'X':
							if(letterrow==lettercolumn || letterrow==6-lettercolumn)
								return true;
							else 
								return false;


					//break;
					case 'Y':
							if(letterrow<4)
							{
								if(letterrow==lettercolumn || letterrow==6-lettercolumn)
									return true;
								else 
									return false;

							}
							else if(letterrow>3 && lettercolumn==3)
							{
								return true;
							}
							else 
							return false;		
					//break;
					case 'Z':

							if(letterrow==1 || letterrow==5 )
							{
								return true;
							}
							else if(letterrow!=5 && letterrow==6-lettercolumn)
							{
								
									return true;
								
							}
							else
								return false;

					//break;

					case '0':
							if(letterrow==1 || letterrow==5 || lettercolumn==1 || lettercolumn==5)
							{
								return true;
							}
							else 
							return false;
					//break;
					case '1':
							if(lettercolumn==3)
							{
								return true;
							}
							else 
								return false;
					//break;
					case '2':
							if(letterrow==1 || letterrow==3 || letterrow==5)
							{
								return true;
							}
							else if((letterrow==4 && lettercolumn==1)||(letterrow==2 && lettercolumn==5 ))
								return true;
							else 
							return false;

					//break;
					case '3':
							if(letterrow==1 || letterrow==3 ||letterrow==5)
							{
								return true;
							}
							else if(lettercolumn==5)
							{
								return true;
							}
							else 
							return false;

					//break;
					case '4':
							if(letterrow==3 || lettercolumn==5)
							{
								return true;
							}
							else if(letterrow>3)
							{	if(lettercolumn==1)
								return true;
								else 
									return false;
							}
							else 
							return false;
					//break;
					//break;
					case '5':
							if(letterrow==1 || letterrow==3 || letterrow==5)
							{
								return true;
							}
							else if((letterrow==2 && lettercolumn==1)||(letterrow==4 && lettercolumn==5 ))
								return true;
							else 
							return false;

					//break;
					case '6':
							if(lettercolumn==1 || letterrow==3 || letterrow==5)
								return true;
							else if(letterrow==4 && lettercolumn==5)
								return true;
							else 
								return false;
					//break;
					case '7':
							if(letterrow==1 || lettercolumn==5)
								return true;
							else
								return false;
					//break;
					case '8':
							if(letterrow==1 || letterrow ==3 || letterrow==5 || lettercolumn==1 || lettercolumn==5)
								return true;
							else
								return false;
					//break;

					case '9':
							if(lettercolumn==5 || letterrow==1 || letterrow==3)
								return true;
							else if(letterrow==2 && lettercolumn==1)
								return true;
							else 
								return false;

					//break;
					
					default: System.out.println("Wrong input");break;
				}//*/
		return true;
	}
	


}
//end of wish class

class main
{
	
	 


	public static void main(String args[])
	{
		CreateGreeting obj = new CreateGreeting();   //object of wish class
		
		Scanner sc=new Scanner(System.in);    //for taking input
		String name=new String();             //represent user input
		String word[]; 							//contains words from input
		///taking input from user
		System.out.println("Enter 3 word sentence: ");
		name=sc.nextLine();
		//name ="happy Birthday xyz";
		name = name.toUpperCase();		//converting input to uppercase
		
		word = name.split(" ");			//splitting each word
		obj.totalwords=word;
		obj.clear_background();
		obj.frame();
	
		System.out.print("\n\n");

	}
}
