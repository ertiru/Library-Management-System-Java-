public class Book{
	private final int isbn;
	private String title;
	private short yrpublication;
	private boolean isFictitous;
	
	public Book(int isbn,String title,short yrpublication,boolean isFictitous){
		this.isbn=isbn;
		this.title=title;
		this.yrpublication=yrpublication;
		this.isFictitous=isFictitous;
	}
	
	public int getIsbn(){
		return isbn;
	}
	public void setTitle(String t){
		if(!t.isEmpty()&&t!=null){
			title=t;
		}
	}
	public String getTitle(){
		return title;
	}
	public void setYrPublication(short y){
		yrpublication=y;
	}
	public short getYrPublication(){
		return yrpublication;
	}
	public boolean getIsFictitious(){
		return isFictitous;
	}
	public void setIsFictitous(boolean f){
		isFictitous=f;
	}
	@Override
	public String toString(){
		return isbn+":"+title+"-"+yrpublication+"-is"+(isFictitous?" ":" not ")+"fictitous";
	}
	@Override
	public boolean equals(Object o){
		if(o instanceof Book){
			Book l2=(Book)o;
			return this.isbn==l2.isbn;
		}return false;
	}
}
