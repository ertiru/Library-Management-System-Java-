public class Library{
	private String name;
	private Book [] books;
	private int index=0;
	
	public Library(String name,int noBooks){
		this.name=name;
		books=new Book[noBooks];
	}
	public boolean exists(Book b){
		for(int i=0;i<index;i++){
			if(books[i].equals(b)){
				return true;
			}
		}return false;
	}
	public void addBook(Book b){
		if(!exists(b)&&index<books.length){
			books[index++]=b;
		}
	}
	public void printFictitious(){
		for(int i=0;i<index;i++){
			if(books[i].getIsFictitious()==true){
				System.out.println(books[i]);
			}
		}
	}
	public Book newestBook(){
		Book b=books[index-1];
		for(int i=index-2;i>=0;i--){
			if(books[i].getYrPublication()>b.getYrPublication()){
				b=books[i];
			}
		}return b;
	}
	public Book[] returnbyTitle(String t){
		int no=0;
		for(int i=0;i<index;i++){
			if(books[i].getTitle().equals(t)){
				no++;
			}
		}
		Book [] booksTitle=new Book[no];
		int c=0;
		for(int i=0;i<index;i++){
			if(books[i].getTitle().equals(t)){
				booksTitle[c++]=books[i];
			}
		}return booksTitle;
	}
	public void deleteBook(Book b){
		for(int i=0;i<index;i++){
			if(books[i].equals(b)){
				books[i]=null;
				for(int j=i;j<index-1;j++){
					books[j]=books[j+1];
				}
				i--;
				index--;
			}
		}
	}
	public static void main(String [] args){
		Library l1=new Library("HARVARD LIBRARY",5);
		Book b1=new Book(123123,"Bible",(short)1800,false);
		Book b2=new Book(213222,"Quran",(short)1500,false);
		Book b3=new Book(111222,"Trade",(short)1908,true);
		Book b4=new Book(113123,"Trade",(short)1990,true);
		
		l1.addBook(b1);
		l1.addBook(b2);
		l1.addBook(b3);
		l1.addBook(b4);
		System.out.println(l1.newestBook());
		Book [] t=l1.returnbyTitle("Trade");
		for(Book b:t){
			System.out.println(b);
		}
		l1.deleteBook(b1);
		l1.printFictitious();
	}
}
