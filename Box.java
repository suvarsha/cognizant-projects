class Box
{
	public int boxlength;
	public int boxwidth;
	public int boxheight;
	Box()
	{
	boxlength=1;
	boxwidth=2;
	boxheight=3;
	}
	Box(int length,int width,int height)
	{
	boxlength=length;
	boxwidth=width;
	boxheight=height;
	}

	void setbox(int boxlength,int boxwidth,int boxheight)
	{
	this.boxlength=boxlength;
	this.boxwidth=boxwidth;
	this.boxheight=boxheight;
	}
	void getbox()
	{
	System.out.println(" "+boxlength+" "+boxwidth+" "+boxheight);
	}
	int voulme()
	{
	return boxlength*boxwidth*boxheight;
	}
}